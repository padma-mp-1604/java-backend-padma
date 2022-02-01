package com.paddu.weekbaskrestapp.service;

import com.paddu.weekbaskrestapp.domain.BankAccount;
import com.paddu.weekbaskrestapp.respository.BankRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;

import javax.transaction.Transactional;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;


@Transactional
@Service
public class BankServiceImpl implements BankService {


    @Autowired
    private BankRepository repository;

    @Override
    public void createNewAccount(BankAccount ba) {
        repository.save(ba);
    }

    @Override
    public int updateAccountDetails(BankAccount ba) {
        return 0;
    }

    @Override
    public boolean activateAccount(Long acNum) {
        return false;
    }

    @Override
    public boolean deActivateAccount(Long acNum) {
        return false;
    }

    @Override
    public double withdraw(Long acNum, double amt) {
        repository.withdraw(amt, acNum);
        return amt;
    }

    @Override
    public double deposit(Long acNum, double amt) {
        return 0;
    }

    @Override
    public int transferMoney(Long srcAc, Long dstAc, double amt) {
        return 0;
    }

    @Override
    public BankAccount findAccountByAcNum(Long acNum) {
        return null;
    }

    @Override
    public List<BankAccount> findAllBankAccounts() {
        return repository.findAll();
    }

    @Override
    public List<BankAccount> namesStartsWith(String prefix) {
        return repository.findByAcHldNmStartingWith(prefix);
    }
}
