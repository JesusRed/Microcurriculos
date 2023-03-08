package com.ingsistemas.mallacurricular.security;

import com.ingsistemas.mallacurricular.entity.Persona;
import com.ingsistemas.mallacurricular.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.annotation.Order;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * The type Transaction filter.
 */
@Component
@Order(1)
public class TransactionFilter implements Filter {

    /**
     * The Usuario repo.
     */
    @Autowired
    PersonaRepository usuarioRepo;
    /**
     * The Seguridad activada.
     */
    @Value("${seguridadActivada}")
    boolean seguridadActivada;

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        if (seguridadActivada) {
            @SuppressWarnings("unchecked") Collection<SimpleGrantedAuthority> oldAuthorities = (Collection<SimpleGrantedAuthority>) SecurityContextHolder.getContext().getAuthentication().getAuthorities();

            // HttpServletRequest req = (HttpServletRequest) request;
            Authentication a = SecurityContextHolder.getContext().getAuthentication();
            if (a.getPrincipal().getClass() == String.class) {
                chain.doFilter(request, response);
            } else {
                Jwt p = (Jwt) a.getPrincipal();
                String correo = p.getClaimAsString("email");

                if (oldAuthorities.isEmpty()) {

                    Persona usuario = usuarioRepo.findByCorreo(correo);
                    if (usuario == null) {
                        ((HttpServletResponse) response).sendError(HttpServletResponse.SC_FORBIDDEN, "no existe usuario registrado con este correo");
                    } else {
                        Persona user = usuario;
                        if (user.isAdministrador()) {
                            setAutoridad(oldAuthorities, true);
                        } else {
                            setAutoridad(oldAuthorities, false);
                        }
                        chain.doFilter(request, response);
                    }
                }
            }
        } else {
            chain.doFilter(request, response);
        }
    }

    private void setAutoridad(Collection<SimpleGrantedAuthority> oldAuthorities, boolean b) {
        String autoridad = "";
        if (b) {
            autoridad = "ROLE_ADMIN";
        } else {
            autoridad = "ROLE_DIRECTOR";
        }
        SimpleGrantedAuthority authority = new SimpleGrantedAuthority(autoridad);
        List<SimpleGrantedAuthority> updatedAuthorities = new ArrayList<SimpleGrantedAuthority>();
        updatedAuthorities.add(authority);
        updatedAuthorities.addAll(oldAuthorities);

        SecurityContextHolder.getContext().setAuthentication(new UsernamePasswordAuthenticationToken(SecurityContextHolder.getContext().getAuthentication().getPrincipal(), SecurityContextHolder.getContext().getAuthentication().getCredentials(), updatedAuthorities));

    }

    // other methods
}