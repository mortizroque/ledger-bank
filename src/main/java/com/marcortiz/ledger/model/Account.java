package com.marcortiz.ledger.model;

import com.marcortiz.ledger.util.Status;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "accounts")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column (nullable = false, unique = true, length = 40)
    private String account_number;

    @ManyToOne
    @JoinColumn(name = "owner_id")
    private User owner;

    @Column (nullable = false)
    private BigDecimal balance;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Status state;

    @Column (nullable = false, length = 15)
    private LocalDateTime createdAt;

}
