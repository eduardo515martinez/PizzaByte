package com.pizza.pizzeria.service;

import com.pizza.pizzeria.persistence.entity.OrderEntity;
import com.pizza.pizzeria.persistence.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

@Service
public class OrderService {
    private final OrderRepository orderRepository;

    @Autowired
    public OrderService(OrderRepository orderRepository){
        this.orderRepository = orderRepository;
    }

    public List<OrderEntity> getAll(){
        List<OrderEntity> orders = this.orderRepository.findAll();
        orders.forEach(o -> System.out.println(o.getCustomer().getName()));
        return orders;
    }

    //public List<OrderEntity> getTodayOrders(){
      //  LocalDateTime today = LocalDate.now().atTime(LocalTime);
        //return this.orderRepository.findAllByDateAfter(today);
    //}

}
