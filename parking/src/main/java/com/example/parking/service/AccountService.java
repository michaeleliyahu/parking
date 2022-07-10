package com.example.parking.service;

import com.example.parking.Repository.AccountRepository;
import com.example.parking.models.Account;
import com.example.parking.models.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class AccountService {

    private final AccountRepository accountRepository;

    @Autowired
    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public String saveAccount(@RequestBody Account account)
    {
        accountRepository.save(account);
        return "added book with id:" +account.getId();
    }
}
