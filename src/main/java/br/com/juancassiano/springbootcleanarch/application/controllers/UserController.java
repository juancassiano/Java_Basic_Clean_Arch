package br.com.juancassiano.springbootcleanarch.application.controllers;

import br.com.juancassiano.springbootcleanarch.application.useCases.CreateUserInteractor;
import br.com.juancassiano.springbootcleanarch.domain.entity.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("users")
public class UserController {
  private final CreateUserInteractor createUserInteractor;
  private final UserDTOMapper userDTOMapper;

  public UserController(CreateUserInteractor createUserInteractor,UserDTOMapper userDTOMapper) {
    this.createUserInteractor = createUserInteractor;
    this.userDTOMapper = userDTOMapper;
  }

  @PostMapping
  CreateUserResponse create(@RequestBody CreateUserRequest request) {
    User userBusinessObject = userDTOMapper.toUser(request);
    User user = createUserInteractor.createUser(userBusinessObject);
    return userDTOMapper.toResponse(user);
  }
}
