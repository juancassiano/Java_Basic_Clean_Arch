package br.com.juancassiano.springbootcleanarch.application.useCases;

import br.com.juancassiano.springbootcleanarch.application.gateways.UserGateway;
import br.com.juancassiano.springbootcleanarch.domain.entity.User;

public class CreateUserInteractor {
    private UserGateway userGateway;

    public CreateUserInteractor(UserGateway userGateway) {
        this.userGateway = userGateway;
    }

    public User createUser(User user) {
        return userGateway.createUser(user);
    }
}
