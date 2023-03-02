package com.ingsistemas.mallacurricular.security;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;

@SuppressWarnings("deprecation")
@EnableWebSecurity

public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
    @Value("${seguridadActivada}")
    boolean seguridadActivada;

    @Override
    protected void configure(final HttpSecurity http) throws Exception {
        if (seguridadActivada) {
            http.authorizeRequests().antMatchers("/asignatura/getById", "/asignatura/getAll", "/asignatura/imprimir").permitAll()
                    .and().sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS).and().oauth2ResourceServer().jwt()
                    .and().
                    and()
                    .cors().and().csrf().disable();
        } else {
            http.cors().and().csrf().disable();
        }


    }


}