package br.com.gabriel.springdataprojection.entity.projections;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.beans.factory.annotation.Value;

import java.time.LocalDate;

public interface ClientViewSales {

    @Value("#{target.name + ' ' + target.lastName}") //OPEN PROJECTIONS
    String getFullName();

    String getCompanyName();

    String getZipCode();

    @JsonIgnore //Jackson Anottations
    LocalDate getDateBirdOrdCreated();

    //Custom Logic
    default Integer getAge(){
        Integer age = LocalDate.now().getYear() - getDateBirdOrdCreated().getYear();
        return age;
    }

}
