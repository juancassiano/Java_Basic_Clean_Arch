package br.com.juancassiano.springbootcleanarch.main;

import br.com.juancassiano.springbootcleanarch.application.controllers.UserDTOMapper;
import br.com.juancassiano.springbootcleanarch.application.gateways.UserGateway;
import br.com.juancassiano.springbootcleanarch.application.useCases.CreateUserInteractor;
import br.com.juancassiano.springbootcleanarch.infrastructure.gateways.UserEntityMapper;
import br.com.juancassiano.springbootcleanarch.infrastructure.gateways.UserRepositoryGateway;
import br.com.juancassiano.springbootcleanarch.infrastructure.persistence.UserRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfig {
    @Bean
    CreateUserInteractor createUserCase(UserGateway userGateway){
        return new CreateUserInteractor(userGateway);
    }

    @Bean
    UserGateway userGateway(UserRepository userRepository, UserEntityMapper userEntityMapper){
        return new UserRepositoryGateway(userRepository, userEntityMapper);
    }

    @Bean
    UserEntityMapper userEntityMapper(){
        return new UserEntityMapper();
    }

    @Bean
    UserDTOMapper userDTOMapper(){
        return new UserDTOMapper();
    }
}
