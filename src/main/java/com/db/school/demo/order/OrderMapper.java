package com.db.school.demo.order;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class OrderMapper implements RowMapper<Order> {

    @Override
    public Order mapRow(ResultSet resultSet, int i) throws SQLException {
        Order order = new Order();
        order.setId(resultSet.getInt("id"));
        order.setOrder_date(resultSet.getDate("order_date"));
        order.setShipped_date(resultSet.getDate("shipped_date"));
        order.setStat(resultSet.getString("stat"));
        order.setComments(resultSet.getString("comments"));
        order.setCustomer_id(resultSet.getInt("customer_id"));
        return order;
    }
}
