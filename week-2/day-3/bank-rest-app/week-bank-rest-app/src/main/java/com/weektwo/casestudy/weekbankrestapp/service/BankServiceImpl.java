package com.weektwo.casestudy.weekbankrestapp.service;

import com.weektwo.casestudy.weekbankrestapp.domain.BankAccount;
import com.weektwo.casestudy.weekbankrestapp.exception.InvalidAcNumberException;
import com.weektwo.casestudy.weekbankrestapp.exception.InvalidAccountNumberExecption;
import com.weektwo.casestudy.weekbankrestapp.exception.InvalidAmountException;
import com.weektwo.casestudy.weekbankrestapp.exception.InvalidNumberException;
import com.weektwo.casestudy.weekbankrestapp.repository.BankRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

@Transactional(
        isolation = Isolation.READ_UNCOMMITTED,
        rollbackFor = SQLException.class,
        noRollbackFor = InvalidAmountException.class
)
@Service
public class BankServiceImpl implements BankService{

    private final Logger logger = LoggerFactory.getLogger(BankServiceImpl.class);

    @Autowired
    private BankRepository repository;

    @Override
    public void createNewAccount(BankAccount ba) throws InvalidNumberException {

        repository.save(ba);
    }

    @Override
    public BankAccount updateAccountDetails(BankAccount ba) {
        BankAccount baNew = repository.findById(ba.getAcNum()).orElse(null);



//        BankAccount baOld = op.orElseThrow();
//        boolean existingstatus = baOld.getStatus();
//        boolean newstatus = Boolean.parseBoolean("true");

        //BankAccount baNew = new BankAccount();
        baNew.setBalance(ba.getBalance());
        baNew.setAcCrDt(ba.getAcCrDt());
        baNew.setStatus(ba.getStatus());
        baNew.setAcHldNm(ba.getAcHldNm());
        baNew.setAcNum(ba.getAcNum());

        return repository.save(baNew);


        //repository.save(baNew);
        //return baNew.getStatus();
    }

    @Override
    public boolean activateAccount(Long acNum) {
        Optional<BankAccount> op = repository.findById(acNum);

        BankAccount baOld = op.orElseThrow();
        boolean existingstatus = baOld.getStatus();
        boolean newstatus = Boolean.parseBoolean("true");

        BankAccount baNew = new BankAccount();
        baNew.setBalance(baOld.getBalance());
        baNew.setAcCrDt(baOld.getAcCrDt());
        baNew.setStatus(newstatus);
        baNew.setAcHldNm(baOld.getAcHldNm());
        baNew.setAcNum(baOld.getAcNum());

        repository.save(baNew);
        return baNew.getStatus();
    }

    @Override
    public boolean deActivateAccount(Long acNum) {
        Optional<BankAccount> op = repository.findById(acNum);

        BankAccount baOld = op.orElseThrow();
        boolean existingstatus = baOld.getStatus();
        boolean newstatus = Boolean.parseBoolean("false");

        BankAccount baNew = new BankAccount();
        baNew.setBalance(baOld.getBalance());
        baNew.setAcCrDt(baOld.getAcCrDt());
        baNew.setStatus(newstatus);
        baNew.setAcHldNm(baOld.getAcHldNm());
        baNew.setAcNum(baOld.getAcNum());

        repository.save(baNew);
        return baNew.getStatus();    }

    @Override
    public double withdraw(Long acNum, double amt) throws InvalidAmountException {
        if (amt <= 0) throw new InvalidAmountException("Amount Should be Non Zero Positive " + amt);

        Optional<BankAccount> op = repository.findById(acNum);

        BankAccount baOld = op.orElseThrow();
        double existingBalance = baOld.getBalance();
        double newBalance = existingBalance - amt;

        BankAccount baNew = new BankAccount();
        baNew.setBalance(newBalance);
        baNew.setAcCrDt(baOld.getAcCrDt());
        baNew.setStatus(baOld.getStatus());
        baNew.setAcHldNm(baOld.getAcHldNm());
        baNew.setAcNum(baOld.getAcNum());

        repository.save(baNew);
        return baNew.getBalance();
    }

    @Override
    public double deposit(Long acNum, double amt) throws InvalidAmountException {

        if(amt <= 0) throw new InvalidAmountException("Amount Should be Non Zero Positive "+amt);

        Optional<BankAccount> op = repository.findById(acNum);

        BankAccount baOld = op.orElseThrow();
        double existingBalance = baOld.getBalance();
        double newBalance = existingBalance + amt;

        BankAccount baNew = new BankAccount();
        baNew.setBalance(newBalance);
        baNew.setAcCrDt(baOld.getAcCrDt());
        baNew.setStatus(baOld.getStatus());
        baNew.setAcHldNm(baOld.getAcHldNm());
        baNew.setAcNum(baOld.getAcNum());

        repository.save(baNew);

//        withdraw(acNum, 10);

        return baNew.getBalance();
    }

    @Override
    public int transferMoney(Long srcAc, Long dstAc, double amt) throws InvalidAmountException {
        return 0;
    }

    @Override
    public BankAccount findAccountByAcNum(Long acNum)  throws InvalidAcNumberException {
        Optional<BankAccount> op = repository.findById(acNum);

        BankAccount baOld = op.orElseThrow();


        return repository.save(baOld);
//        return baNew.getAcNum();
    }

//    @Override
//    public List<BankAccount> findAllBankAccounts() {
//        return repository.findByStatusTrue();
//    }

    @Override
    public List<BankAccount> findAllBankAccounts() throws InvalidAccountNumberExecption {

        return repository.findAll();
    }

    @Override
    public List<BankAccount> namesStartsWith(String prefix) {
        return repository.findByAcHldNmStartingWith(prefix);
    }
}
