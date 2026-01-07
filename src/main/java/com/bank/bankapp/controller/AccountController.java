package com.bank.bankapp.controller;

import com.bank.bankapp.service.AccountService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AccountController {

    private final AccountService service;

    public AccountController(AccountService service) {
        this.service = service;
    }

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("account", service.getAccount());
        return "index";
    }

    @PostMapping("/deposit")
    public String deposit(@RequestParam double amount) {
        service.deposit(amount);
        return "redirect:/";
    }

    @PostMapping("/withdraw")
    public String withdraw(@RequestParam double amount) {
        service.withdraw(amount);
        return "redirect:/";
    }

    @PostMapping("/change-holder")
    public String changeHolder(@RequestParam String name) {
        service.changeHolder(name);
        return "redirect:/";
    }
}
