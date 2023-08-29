package br.com.juancassiano.springbootcleanarch.application.gateways;

import br.com.juancassiano.springbootcleanarch.domain.entity.User;

public interface UserGateway {

    User createUser(User user);
}
