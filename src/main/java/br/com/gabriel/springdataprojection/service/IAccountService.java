package br.com.gabriel.springdataprojection.service;

import br.com.gabriel.springdataprojection.entity.Account;
import br.com.gabriel.springdataprojection.entity.projections.AccountViewSales;

import java.util.List;

public interface IAccountService extends CrudService<Account> {

    List<AccountViewSales> findByAgency(String agency);

}
