package com.db.school.demo.products;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductMapper implements RowMapper<Product> {
    @Override
    public Product mapRow(ResultSet resultSet,int rowNum) throws SQLException {
        Product product = new Product();
        product.setCod(resultSet.getString("cod"));
        product.setNume(resultSet.getString("nume"));
        product.setDescriere(resultSet.getString("descriere"));
        product.setStock(resultSet.getInt("stock"));
        product.setPrice(resultSet.getInt("price"));
        return product;
    }
}
