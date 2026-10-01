package com.app.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.model.Order;
import com.app.model.Product;

@Repository
public interface OrderRepositoryI extends JpaRepository<Order,Integer> {

}

