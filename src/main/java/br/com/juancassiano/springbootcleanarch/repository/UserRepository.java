package br.com.juancassiano.springbootcleanarch.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.juancassiano.springbootcleanarch.model.User;

public interface UserRepository extends CrudRepository<User, Long> {

}
