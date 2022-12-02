package com.antlosman.onlinestore.config;

import com.okta.spring.boot.oauth.Okta;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.web.accept.ContentNegotiationStrategy;
import org.springframework.web.accept.HeaderContentNegotiationStrategy;

@Configuration
public class SecurityConfiguration {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity httpSecurity) throws Exception {

        // protect endpoint .../orders
        httpSecurity.authorizeRequests(configurer ->
                        configurer
                                // protect the endpoint, only accessible to authenticated users
                                .antMatchers("/orders/**")
                                .authenticated())
                                // configure OAuth2 Resource Server Support
                                .oauth2ResourceServer()
                                // enable JWT-encoded bearer token support
                                .jwt();

        // add content negotiation strategy to support Okta sending back friendly response
        httpSecurity.setSharedObject(ContentNegotiationStrategy.class,
                                     new HeaderContentNegotiationStrategy());

        // force a non-empty response body for 401's to make the response more friendly
        Okta.configureResourceServer401ResponseBody(httpSecurity);

        // disable CSRF since we are not using Cookies for session tracking
        httpSecurity.csrf().disable();

        // HttpSecurity supports the Builder design pattern
        return httpSecurity.build();
    }
}
