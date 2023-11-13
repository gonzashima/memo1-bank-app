package com.aninfo.model;

import com.aninfo.enums.TransactionType;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private final TransactionType type;

    private final double amount;

    private final long accountCbu;


    public Transaction(TransactionType type, double amount, long accountCbu) {
        this.type = type;
        this.amount = amount;
        this.accountCbu = accountCbu;
    }

    public double getAmount() {
        return amount;
    }

    public TransactionType getType() {
        return type;
    }

    public long getAccountCbu() {
        return accountCbu;
    }
}