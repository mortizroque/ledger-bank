package com.marcortiz.ledger.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "accounts")
@Getter
@Setter
@NoArgsConstructor
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column (nullable = false, unique = true, length = 40)
    private String accountNumber;

    @ManyToOne
    @JoinColumn(name = "owner_id")
    private User owner;

    @Column (nullable = false, precision = 19, scale = 2)
    private BigDecimal balance;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private AccountStatus state;

    @Column (nullable = false, length = 15)
    private LocalDateTime createdAt;

}
