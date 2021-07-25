package com.db.school.demo.products;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService implements ProductServiceContract {
    @Autowired
    private JdbcTemplate template;

    public Product getProduct(String cod){
        List<Product> productList = template.query("SELECT * FROM springdatabase.products WHERE cod = '"+cod+"'", new ProductMapper());
        return productList.get(0);
    }
    public List<Product> getAll(){
        List<Product> productList = template.query("SELECT * FROM springdatabase.products" , new ProductMapper());
        return productList;
    }
    public void insert (Product product){
        String s = new String("INSERT INTO springdatabase.products VALUES ('"+product.getCod()+"','"+product.getNume()+"','"+product.getDescriere()+"',"+product.getStock()+","+product.getPrice()+")");
        template.execute(s);
    }
    public void update(String cod,String newName){
        String s = new String("UPDATE springdatabase.products SET nume='"+newName+"' WHERE cod = '"+cod+"'");
        template.update(s);
    }
    public int delete(String cod){
        int order = template.update("DELETE FROM springdatabase.products WHERE cod = '"+ cod + "'");
        return order;
    }
}
