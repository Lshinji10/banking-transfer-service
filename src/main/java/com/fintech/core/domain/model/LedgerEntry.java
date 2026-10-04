package com.fintech.core.domain.model;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "ledger_entries")
public class LedgerEntry {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long sourceAccountId;
    private Long targetAccountId;
    private BigDecimal amount;
    private LocalDateTime createdAt;

    public LedgerEntry() {}

    public LedgerEntry(Long sourceAccountId, Long targetAccountId, BigDecimal amount) {
        this.sourceAccountId = sourceAccountId;
        this.targetAccountId = targetAccountId;
        this.amount = amount;
        this.createdAt = LocalDateTime.now();
    }

    public static LedgerEntry createDoubleEntry(Account source, Account target, BigDecimal amount) {
        return new LedgerEntry(source.getId(), target.getId(), amount);
    }

    public Long getId() { return id; }
}