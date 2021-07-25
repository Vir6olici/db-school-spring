package com.db.school.demo.products;

import java.util.List;

public interface ProductServiceContract {
    public Product getProduct(String cod);
    public List<Product> getAll();
    public void insert(Product product);
    public void update(String cod,String nume);
    public int delete(String cod);
}
