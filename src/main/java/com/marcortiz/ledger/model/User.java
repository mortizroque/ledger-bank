package com.marcortiz.ledger.model;

import com.marcortiz.ledger.util.Roles;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column (nullable = false, unique = true, length = 30)
    private String username;
    @Column (nullable = false, unique = true, length = 30)
    private String passwordHash;
    @Column (nullable = false, length = 40)
    private String firstName;
    @Column (nullable = false, length = 40)
    private String lastName;
    @Column (nullable = false, length = 20)
    private LocalDate birthDate;
    @Column (nullable = false, unique = true, length = 15)
    private String dni;
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Roles role;
    @Column (nullable = false, length = 15)
    private LocalDateTime createdAt;

    @OneToMany(mappedBy = "owner")
    private List<Account> accounts;
}
