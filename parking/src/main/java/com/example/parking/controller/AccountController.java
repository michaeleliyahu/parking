package com.example.parking.controller;

import com.example.parking.models.Account;
import com.example.parking.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

    private final AccountService accountService;

    @Autowired
    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @PostMapping("/addAccount")
    public String saveAccount(@RequestBody Account account)
    {
        return accountService.saveAccount(account);
    }
}
