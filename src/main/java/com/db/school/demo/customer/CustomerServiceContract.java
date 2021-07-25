package com.db.school.demo.customer;

import java.util.List;

public interface CustomerServiceContract {
    public void createCustomer(Customer customer);
    public Customer getCustomerById(int id);
    public void update(int id,String s);
    public int delete(int id);
    public List<Customer> getAll();

}
