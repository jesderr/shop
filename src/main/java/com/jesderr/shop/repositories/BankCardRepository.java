package com.jesderr.shop.repositories;

import com.jesderr.shop.models.BankCard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface BankCardRepository extends JpaRepository<BankCard, Long> {

//    @Query(value = "select id,digitcard,cvv,actiontime,cardholder from bankcard", nativeQuery = true)
//    List<BankCard> getAll();

}


