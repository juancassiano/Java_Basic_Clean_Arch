package br.com.juancassiano.springbootcleanarch.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.juancassiano.springbootcleanarch.model.User;
import br.com.juancassiano.springbootcleanarch.service.UserService;

@RestController
@RequestMapping("users")
public class UserController {
  private UserService userService;

  public UserController(UserService userService) {
    this.userService = userService;
  }

  @PostMapping
  User create(@RequestBody User user) {
    return userService.create(user);
  }
}