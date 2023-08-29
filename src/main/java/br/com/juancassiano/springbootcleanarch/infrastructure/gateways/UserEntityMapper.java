package br.com.juancassiano.springbootcleanarch.infrastructure.gateways;

import br.com.juancassiano.springbootcleanarch.domain.entity.User;
import br.com.juancassiano.springbootcleanarch.infrastructure.persistence.UserEntity;

public class UserEntityMapper {
    UserEntity toEntity(User userDomainObject){
        return new UserEntity(userDomainObject.username(), userDomainObject.email(), userDomainObject.password());
    }

    User toDomainObject(UserEntity userEntity){
        return new User(userEntity.getUsername(), userEntity.getPassword(), userEntity.getEmail());
    }
}
