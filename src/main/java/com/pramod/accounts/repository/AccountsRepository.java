package com.pramod.accounts.repository;

import com.pramod.accounts.model.Accounts;
import com.pramod.accounts.model.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountsRepository extends CrudRepository<Accounts, Long> {
        Accounts findByCustomerId(int customerId);


}