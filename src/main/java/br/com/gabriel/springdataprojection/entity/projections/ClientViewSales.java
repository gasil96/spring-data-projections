package br.com.gabriel.springdataprojection.entity.projections;

import org.springframework.beans.factory.annotation.Value;

import java.time.LocalDate;

public interface ClientViewSales {

    @Value("#{target.name + ' ' + target.lastName}") //OPEN PROJECTIONS
    String getFullName();

    String getCompanyName();

    String getZipCode();

    @Value("#{target.dateBirdOrdCreated.getYear()}")
    Integer getAge();
}
