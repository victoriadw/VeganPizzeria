package com.Plantizza.VeganPizzeria.dao;

import com.Plantizza.VeganPizzeria.entities.Order;

import java.time.LocalDate;
import java.util.List;

public interface OrderDao {
    Order getOrderByID(int id);
    List<Order> getAllOrders();
    List<Order> getAllOrdersByCustomerIdByDate(int cid, LocalDate date);
    Order addOrder(Order order);
    void updateOrder(Order order);
    void deleteOrderById(int id);
}
