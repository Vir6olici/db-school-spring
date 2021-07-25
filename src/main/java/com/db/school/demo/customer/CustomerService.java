package com.db.school.demo.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.stereotype.Service;

import java.sql.PreparedStatement;
import java.util.List;

@Service
public class CustomerService implements CustomerServiceContract {

    @Autowired
    private JdbcTemplate template;

    public void createCustomer(Customer customer){
        String s = new String("INSERT INTO springdatabase.customers (username,last_name,first_name,phone,address,city,postalCode,country) VALUES ('"+customer.getUsername()+"','"+customer.getLastName()+"','"+customer.getFirstName()+"','"+customer.getPhone()+"','"+customer.getAddress()+"','"+customer.getCity()+"','"+customer.getPostalCode()+"','"+customer.getCountry()+"')");
        template.execute(s);
    }
    public Customer getCustomerById(int id){
        List<Customer> customers = template.query("SELECT * FROM springdatabase.customers WHERE id =" + id, new CustomerMapper());
        return customers.get(0);
    }
    public List<Customer> getAll(){
        List<Customer> customerList = template.query("SELECT * FROM springdatabase.customers", new CustomerMapper());
        return customerList;
    }
    public void update(int id, String newUsername) {
        String s = new String("UPDATE springdatabase.customers SET username='"+newUsername+"' WHERE id = "+id);
        template.update(s);
    }
    public int delete(int id){
        int customer = template.update("DELETE FROM springdatabase.customers WHERE id = "+ id);
        return customer;
    }


}
