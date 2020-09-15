package br.com.gabriel.springprojectionwithopenfeign.service;

import br.com.gabriel.springprojectionwithopenfeign.entity.Account;
import br.com.gabriel.springprojectionwithopenfeign.entity.projections.AccountViewSales;

import java.util.List;

public interface IAccountService extends CrudService<Account> {

    List<AccountViewSales> findByAgency(String agency);

}
