package com.db.school.demo.customer;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CustomerMapper implements RowMapper<Customer>{
        @Override
        public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {
            Customer customer=new Customer();
            customer.setId(rs.getInt("id"));
            customer.setUsername(rs.getString("username"));
            customer.setLastName(rs.getString("last_name"));
            customer.setFirstName(rs.getString("first_name"));
            customer.setAddress(rs.getString("address"));
            customer.setPhone(rs.getString("phone"));
            customer.setCity(rs.getString("city"));
            customer.setPostalCode(rs.getString("postalCode"));
            customer.setCountry(rs.getString("country"));
            return customer;
        }
}
