package com.weektwo.casestudy.weekbankrestapp.repository;

import com.weektwo.casestudy.weekbankrestapp.domain.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface BankRepository extends JpaRepository<BankAccount, Long>  {
    @Modifying
    @Query(value = "update bank_account set balance = :bal where ac_num = :acNum", nativeQuery = true)
    void withdraw(@Param("bal") double bal, @Param("acNum") Long acNum);

    List<BankAccount> findByAcHldNmStartingWith(String prefix);

    List<BankAccount> findByStatusTrue();

    @Modifying
    @Query(value="select * from bank_account where ac_num=:acNum",nativeQuery = true)
    void findall(@Param("acNum")Long acNum);

}
