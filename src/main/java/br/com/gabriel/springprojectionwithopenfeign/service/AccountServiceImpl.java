package br.com.gabriel.springprojectionwithopenfeign.service;

import br.com.gabriel.springprojectionwithopenfeign.entity.Account;
import br.com.gabriel.springprojectionwithopenfeign.entity.projections.AccountViewSales;
import br.com.gabriel.springprojectionwithopenfeign.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AccountServiceImpl implements IAccountService{

    @Autowired
    private AccountRepository accountRepository;

    @Override
    public Account save(Account genericClass) {
        return accountRepository.save(genericClass);
    }

    @Override
    public Account update(Account genericClass) {
        return accountRepository.save(genericClass);
    }

    @Override
    public void delete(Long id) {
        accountRepository.deleteById(id);
    }

    @Override
    public Optional<Account> findById(Long id) {
        return accountRepository.findById(id);
    }

    @Override
    public List<Account> findAll() {
        return accountRepository.findAll();
    }

    @Override
    public List<AccountViewSales> findByAgency(String agency) {
        return accountRepository.findByAgency(agency);
    }
}
