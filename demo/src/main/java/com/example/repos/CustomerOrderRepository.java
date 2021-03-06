package com.example.repos;

import java.util.List;

import com.example.domain.CustomerOrder;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerOrderRepository extends JpaRepository<CustomerOrder, Long> {

    <T> List <T> findBy(Class<T> type);

}