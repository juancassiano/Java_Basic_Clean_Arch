package br.com.juancassiano.springbootcleanarch.application.controllers;

import br.com.juancassiano.springbootcleanarch.domain.entity.User;

public class UserDTOMapper {
    CreateUserResponse toResponse(User user){
        return  new CreateUserResponse(user.username() ,user.email());
    }

    public User toUser(CreateUserRequest request){
        return new User(request.username(), request.email(), request.password());
    }
}
