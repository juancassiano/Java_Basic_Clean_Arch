package br.com.juancassiano.springbootcleanarch.application.controllers;

public record CreateUserRequest(String username, String password, String email) {
}
