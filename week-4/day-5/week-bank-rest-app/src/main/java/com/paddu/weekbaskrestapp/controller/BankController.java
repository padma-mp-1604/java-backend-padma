package com.paddu.weekbaskrestapp.controller;


import com.paddu.weekbaskrestapp.domain.BankAccount;
import com.paddu.weekbaskrestapp.dto.AppResponse;
import com.paddu.weekbaskrestapp.service.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/bank")
@RestController
public class BankController {

    @Autowired
    private BankService service;

    @PostMapping
    public ResponseEntity<AppResponse<Integer>> createBankAccount(@RequestBody BankAccount ba) {

        service.createNewAccount(ba);

        var response = new AppResponse<Integer>();
        response.setMsg("account created successfully");
        response.setSts("");
        response.setBody(0);
        return ResponseEntity.ok(response);
    }

    @PostMapping("/withdraw")
    public ResponseEntity<AppResponse<Double>> withdrawMoney(@RequestBody BankAccount ba) {
        double amt = service.withdraw(ba.getAcNum(), ba.getBalance());
        var response = new AppResponse<Double>();
        response.setMsg("account created successfully");
        response.setSts("success");
        response.setBody(amt);
        return new ResponseEntity<>(response, HttpStatus.ACCEPTED);
    }

    @GetMapping("/{prefix}")
    public ResponseEntity<AppResponse<List<BankAccount>>> accountsStartWith(@PathVariable String prefix) {
         var response =new AppResponse<List<BankAccount>>();
         response.setMsg("account list");
         response.setSts("success");
         response.setBody(service.namesStartsWith(prefix));
         return ResponseEntity.ok(response);
    }






}






