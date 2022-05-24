package com.jesderr.shop.repositories;

import com.jesderr.shop.models.Buyer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.List;

public interface BuyerRepository extends JpaRepository<Buyer, Long> {

     //sql запрос
//     @Query(name = "select id,name,surname,gender,cardid from buyer", nativeQuery = true)
//     List<Buyer> getAll();
//
//
//     @Query(nativeQuery = true,
//             value = "insert into buyer(name,surname,gender,cardid) values(:b.name, :b.surname, :b.gender, :b.cardid)")
//     void create(@Param("b") Buyer buyer);
//     @Override
//     @Transactional
//     @Query(nativeQuery = true, value = "insert into buyer(name,surname,gender,cardid) " +
//             "values(:b.name, :b.surname, :b.gender, :b.cardid)")
//     <S extends Buyer> S save(S b);
}

