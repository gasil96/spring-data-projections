package br.com.gabriel.springdataprojection.repository;

import br.com.gabriel.springdataprojection.entity.Account;
import br.com.gabriel.springdataprojection.entity.projections.AccountViewSales;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AccountRepository extends JpaRepository<Account, Long> {

    List<AccountViewSales> findByAgency(String agency);
}
