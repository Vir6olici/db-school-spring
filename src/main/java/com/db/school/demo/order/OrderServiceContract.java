package com.db.school.demo.order;

import java.util.List;

public interface OrderServiceContract {
    public Order getOrder(int id);
    public List<Order> getAll();
    public void insert(Order order);
    public void update(int id,String newComment);
    public int delete(int id);
}
