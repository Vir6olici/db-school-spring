package com.db.school.demo.products;

public class Product {
    private String cod;
    private String nume;
    private String descriere;
    private int stock;
    private int price;

    public Product() { }

    public Product(String cod, String nume, String descriere, int stock, int price) {
        this.cod = cod;
        this.nume = nume;
        this.descriere = descriere;
        this.stock = stock;
        this.price = price;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getDescriere() {
        return descriere;
    }

    public void setDescriere(String descriere) {
        this.descriere = descriere;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "cod='" + cod + '\'' +
                ", nume='" + nume + '\'' +
                ", descriere='" + descriere + '\'' +
                ", stock=" + stock +
                ", price=" + price +
                '}';
    }
}
