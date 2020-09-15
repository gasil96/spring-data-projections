package br.com.gabriel.springdataprojection.entity.projections;

import org.springframework.beans.factory.annotation.Value;

public interface ClientViewSales {


    @Value("#{target.name + ' ' + target.lastName}") //OPEN PROJECTIONS
    String getFullName();

    String getCompanyName();

    String getZipCode();
}
