package com.db.school.demo.order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private OrderServiceContract orderService;

    @GetMapping("/orderById")
    public Order getOrder(@RequestParam("id") int id) {return orderService.getOrder(id);}
    @PostMapping("/insertOrder")
    public void createOrder(@RequestBody Order order) {orderService.insert(order);}
    @PutMapping("/updateOrder")
    public void updateOrderComment(@RequestParam("id") int id , @RequestBody String comment){ orderService.update(id,comment);}
    @DeleteMapping("/deleteOrder")
    public int deleteOrderById(@RequestParam("id") int id){return orderService.delete(id); }
    @GetMapping("/getAllOrders")
    public List<Order> getAll() {return orderService.getAll();}

}
