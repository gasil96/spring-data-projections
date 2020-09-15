package br.com.gabriel.springdataprojection.entity;

import br.com.gabriel.springdataprojection.entity.enums.ClientType;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

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

    @NotNull
    @Enumerated(EnumType.STRING)
    private ClientType clientType;

}
