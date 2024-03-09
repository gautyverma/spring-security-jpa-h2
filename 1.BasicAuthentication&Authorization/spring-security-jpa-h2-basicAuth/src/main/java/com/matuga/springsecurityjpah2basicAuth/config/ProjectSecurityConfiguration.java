package com.matuga.springsecurityjpah2basicAuth.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class ProjectSecurityConfiguration {
  @Bean
  SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception {
    http.csrf((csrf) -> csrf.ignoringRequestMatchers("/h2-console/**"))
        .headers(headers -> headers.frameOptions().disable())
        .authorizeHttpRequests(
            (requests) ->
                requests
                    .requestMatchers("/admin")
                    .hasAnyRole("USER", "ADMIN")
                    .requestMatchers("/user")
                    .hasRole("USER")
                    .requestMatchers("/customer")
                    .hasAuthority("VIEWCUSTOMER")
                    .requestMatchers("/", "/h2-console/**")
                    .permitAll());
    http.formLogin(Customizer.withDefaults());
    http.httpBasic(Customizer.withDefaults());
    return http.build();
  }

  @Bean
  public PasswordEncoder passwordEncoder() {
    return new BCryptPasswordEncoder();
  }
}
