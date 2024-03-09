package com.matuga.springsecurityjpah2basicAuth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
  @GetMapping("/")
  public String welcome() {
    return ("Welcome to Auth Demo");
  }

  @GetMapping("/user")
  public String user() {
    return ("Welcome USER 007");
  }

  @GetMapping("/admin")
  public String admin() {
    return ("Welcome ADMIN 101");
  }

  @GetMapping("/customer")
  public String customer() {
    return ("Welcome customer");
  }
}
