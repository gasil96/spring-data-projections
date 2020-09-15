package br.com.gabriel.springprojectionwithopenfeign.repository;

import br.com.gabriel.springprojectionwithopenfeign.entity.Account;
import br.com.gabriel.springprojectionwithopenfeign.entity.projections.AccountViewSales;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AccountRepository extends JpaRepository<Account, Long> {

    List<AccountViewSales> findByAgency(String agency);
}
