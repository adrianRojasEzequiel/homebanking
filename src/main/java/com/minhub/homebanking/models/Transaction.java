package com.minhub.homebanking.models;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private long id;


    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "account_id")
    private Account account;

    private TransactionType type;
    private double amount;
    private String description;
    private LocalDateTime date;

    private double postTransaction;

    public Transaction(){}

    public Transaction(TransactionType type, double amount, String description, LocalDateTime date ){
        this.type = type;
        this.amount = amount;
        this.description = description;
        this.date = date;
    }
    public Transaction(Account account, TransactionType type, double amount, String description, LocalDateTime date ){
        this.account = account;
        this.type = type;
        this.amount = amount;
        this.description = description;
        this.postTransaction = account.getBalance()+amount;
        this.date = date;
    }

    public long getId() {
        return id;
    }

    public TransactionType getType() {
        return type;
    }
    public void setType(TransactionType type) {
        this.type = type;
    }

    public Account getAccount() {
        return account;
    }

    public double getAmount() {
        return amount;
    }
    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getPostTransaction() {
        return postTransaction;
    }

    public void setPostTransaction(double postTransaction) {
        this.postTransaction = postTransaction;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getDate() {
        return date;
    }
    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}