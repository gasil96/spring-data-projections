package br.com.gabriel.springdataprojection.controller;

import br.com.gabriel.springdataprojection.entity.Account;
import br.com.gabriel.springdataprojection.entity.projections.AccountViewSales;
import br.com.gabriel.springdataprojection.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping
public class AccountController extends CrudControllerDefault<Account, IAccountService> {

    @Autowired
    private IAccountService accountService;

    @GetMapping("find-per-agency-view-sales")
    public ResponseEntity<List<AccountViewSales>> findViewByAgency(@RequestParam("agency") String agency){
        return new ResponseEntity<List<AccountViewSales>>(accountService.findByAgency(agency), HttpStatus.OK);
    }

}

