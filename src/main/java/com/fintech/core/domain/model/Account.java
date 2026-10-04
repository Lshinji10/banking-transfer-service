package com.fintech.core.domain.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "accounts")
public class Account {

    @Id
    private Long id;
    private BigDecimal balance;

    public Account() {}

    public Account(Long id, BigDecimal balance) {
        this.id = id;
        this.balance = balance;
    }

    public Long getId() { return id; }
    public BigDecimal getBalance() { return balance; }

    public void debito(BigDecimal amount) {
        this.balance = this.balance.subtract(amount);
    }

    public void credito(BigDecimal amount) {
        this.balance = this.balance.add(amount);
    }
}