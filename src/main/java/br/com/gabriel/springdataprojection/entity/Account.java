package br.com.gabriel.springdataprojection.entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Data
@Entity
@Table
public class Account extends Audit{

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "ID_ACCOUNT")
    private Long id;

    private String agency;

    private String accountNumber;

    private String nameBank;

    private BigDecimal balance;

    private BigDecimal savingsBalance;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "ID_CLIENT_FK", referencedColumnName = "ID_CLIENT")
    private Client client;

}
