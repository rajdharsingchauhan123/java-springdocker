package com.pramod.accounts.controller;

import com.pramod.accounts.model.Accounts;
import com.pramod.accounts.model.Customer;
import com.pramod.accounts.repository.AccountsRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Ideally we should be using @GetMapping as we are trying to fetch the records.
 * ’But the reason I used @PostMapping is, this will allow me to show more scenarios
 * around security as we progress in the course. At the same time it is not
 * recommended to expose the Customer ID, Account Number etc. inside the URL.
 *
 * */

@RestController
public class AccountsController {
    @Autowired
    private AccountsRepository accountsRepository;

    @PostMapping("/myAccount")
    public Accounts getAccountDetails(@RequestBody Customer customer) {

        Accounts accounts = accountsRepository.findByCustomerId(customer.getCustomerId());
        if (accounts != null)
            return accounts;
        else {
            return null;
        }
    }
}