package br.com.juancassiano.springbootcleanarch.infrastructure.gateways;

import br.com.juancassiano.springbootcleanarch.application.gateways.UserGateway;
import br.com.juancassiano.springbootcleanarch.domain.entity.User;
import br.com.juancassiano.springbootcleanarch.infrastructure.persistence.UserEntity;
import br.com.juancassiano.springbootcleanarch.infrastructure.persistence.UserRepository;

public class UserRepositoryGateway implements UserGateway {

    private final UserRepository userRepository;
    private final UserEntityMapper userEntityMapper;

    public UserRepositoryGateway(UserRepository userRepository, UserEntityMapper userEntityMapper) {
        this.userRepository = userRepository;
        this.userEntityMapper = userEntityMapper;
    }

    @Override
    public User createUser(User userDomainObject) {
        UserEntity userEntity = userEntityMapper.toEntity(userDomainObject);
        UserEntity userSaved = userRepository.save(userEntity);
        return userEntityMapper.toDomainObject(userSaved);
    }
}
