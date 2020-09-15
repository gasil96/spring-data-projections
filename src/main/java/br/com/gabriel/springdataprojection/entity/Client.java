package br.com.gabriel.springdataprojection.entity;

import br.com.gabriel.springdataprojection.entity.enums.ClientType;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.LocalDate;

@Table
@Data
@Entity
public class Client extends Audit implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID_CLIENT")
    private Long id;

    private String name;

    private String lastName;

    private String companyName;

    @NotNull
    private String zipCode;

    @NotNull
    private String cpfCnpj;

    private String generalRecord;

    @Column(name = "DATE_BIRD_CREATED")
    private LocalDate dateBirdOrdCreated;

    @NotNull
    @Enumerated(EnumType.STRING)
    private ClientType clientType;
}
