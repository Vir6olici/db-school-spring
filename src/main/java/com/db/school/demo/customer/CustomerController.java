package com.db.school.demo.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerServiceContract customerService;

    @GetMapping("/customerById")
    public Customer getCustomer(@RequestParam("id") int id){ return customerService.getCustomerById(id); }
    @PostMapping("/insertCustomer")
    public void createCustomer(@RequestBody Customer customer) {  customerService.createCustomer(customer); }
    @PutMapping("/updateCustomer")
    public void update(@RequestParam("id") int id,@RequestBody String s) { customerService.update(id,s);}
    @DeleteMapping("/deleteCustomer")
    public int delete(@RequestParam("id") int id){return customerService.delete(id);}
    @GetMapping("/allCustomers")
    public List<Customer> getAll(){return customerService.getAll();}
}

