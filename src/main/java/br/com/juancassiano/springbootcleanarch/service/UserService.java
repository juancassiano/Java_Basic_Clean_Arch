package br.com.juancassiano.springbootcleanarch.service;

import br.com.juancassiano.springbootcleanarch.repository.UserRepository;
import org.springframework.stereotype.Service;

import br.com.juancassiano.springbootcleanarch.model.User;

@Service
public class UserService {
  private UserRepository userRepository;

  public UserService(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  public User create(User user) {
    return userRepository.save(user);
  }
}
