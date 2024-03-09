package com.matuga.springsecurityjpah2basicAuth;

import jakarta.persistence.Entity;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableAutoConfiguration
public class SpringSecurityJpaH2BasicAuthApplication {

  public static void main(String[] args) {
    SpringApplication.run(SpringSecurityJpaH2BasicAuthApplication.class, args);
  }
}
