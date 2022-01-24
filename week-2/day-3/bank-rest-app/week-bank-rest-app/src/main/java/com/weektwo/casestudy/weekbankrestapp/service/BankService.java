package com.weektwo.casestudy.weekbankrestapp.service;

import com.weektwo.casestudy.weekbankrestapp.domain.BankAccount;
import com.weektwo.casestudy.weekbankrestapp.exception.InvalidAcNumberException;
import com.weektwo.casestudy.weekbankrestapp.exception.InvalidAccountNumberExecption;
import com.weektwo.casestudy.weekbankrestapp.exception.InvalidAmountException;
import com.weektwo.casestudy.weekbankrestapp.exception.InvalidNumberException;

import java.util.List;

public interface BankService {
    void createNewAccount(BankAccount ba) throws InvalidNumberException;

    BankAccount updateAccountDetails(BankAccount ba);

    boolean activateAccount(Long acNum);

    boolean deActivateAccount(Long acNum);

    double withdraw(Long acNum, double amt);

    double deposit(Long acNum, double amt) throws InvalidAmountException;

    double transferMoney(Long srcAc, Long dstAc, double amt) throws InvalidAmountException;//done error

    BankAccount findAccountByAcNum(Long acNum) throws InvalidAcNumberException;

    List<BankAccount> findAllBankAccounts() throws InvalidAccountNumberExecption;

    List<BankAccount> namesStartsWith(String prefix);
}
