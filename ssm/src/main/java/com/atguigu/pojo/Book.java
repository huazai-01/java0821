package com.atguigu.pojo;

import java.math.BigDecimal;

public class Book {
    private String name;
    private Integer id;
    private String author;
    private BigDecimal price;
    private Integer sales;
    private Integer stock;

    public Book() {
    }

    public Book(String name, Integer id, String author, BigDecimal price, Integer sales, Integer stock) {
        this.name = name;
        this.id = id;
        this.author = author;
        this.price = price;
        this.sales = sales;
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getSales() {
        return sales;
    }

    public void setSales(Integer sales) {
        this.sales = sales;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", sales=" + sales +
                ", stock=" + stock +
                '}';
    }
}
