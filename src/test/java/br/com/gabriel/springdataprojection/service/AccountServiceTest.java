package br.com.gabriel.springdataprojection.service;

import br.com.gabriel.springdataprojection.Application;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(classes = Application.class)
@EnableJpaRepositories
public class AccountServiceTest {

    @Autowired
    private IAccountService iAccountService;

    @Test
    public void hasTurnBackListClientViewSales(){
        String agency = "0001";
        assertEquals(3, iAccountService.findByAgency(agency).size());
    }

    @Test
    public void hasTurnBackAgeEquals24(){
        String agency = "0001";
        assertEquals(24, iAccountService.findByAgency(agency).get(0).getClient().getAge());
    }


}
