package com.klef.jfsd.exam.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.klef.jfsd.exam.Model.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer>{

}
