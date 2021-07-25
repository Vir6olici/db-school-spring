package com.db.school.demo.order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService implements OrderServiceContract{
    @Autowired
    private JdbcTemplate template;
    public Order getOrder(int id){
        List<Order> orderList = template.query("SELECT * FROM springdatabase.orders WHERE id = "+id,new OrderMapper());
        return orderList.get(0);
    }
    public List<Order> getAll(){
        List<Order> orderList = template.query("SELECT * FROM springdatabase.orders", new OrderMapper());
        return orderList;
    }
    public void insert(Order order){
        String s = new String("INSERT INTO springdatabase.orders (order_date,shipped_date,stat,comments,customer_id) VALUES ('"+order.getOrder_date()+"','"+order.getShipped_date()+"','"+order.getStat()+"','"+order.getComments()+"',"+order.getCustomer_id()+")");
        template.execute(s);
    }
    public void update(int id,String newComment){
        String s = new String("UPDATE springdatabase.orders SET comments='"+newComment+"' WHERE id = "+id);
        template.update(s);
    }
    public int delete(int id){
        int order = template.update("DELETE FROM springdatabase.orders WHERE id = "+ id);
        return order;
    }

}
