package com.fintech.core.domain.exception;

public class AccountNotFoundException extends RuntimeException {
    public AccountNotFoundException(Long id) {
        super("Conta não encontrada para o ID: " + id);
    }
}