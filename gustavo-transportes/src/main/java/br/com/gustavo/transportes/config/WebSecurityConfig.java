package br.com.gustavo.transportes.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.access.channel.ChannelProcessingFilter;

/**
 * Classe utilitaria para habilitar o spring security na app
 * assim como configurar o filtro para o CrossOrigin e liberar
 * o acesso nos paths /rastrear (endpoint) e /h2-console (console do db)
 * 
 * @author Gusta
 *
 */
@EnableWebSecurity
@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.addFilterBefore(new CorsFilter(), ChannelProcessingFilter.class);
        http.csrf().disable()
        .authorizeRequests()
        .antMatchers("/rastrear/**", "/h2-console/**").permitAll();
    }
        
}

