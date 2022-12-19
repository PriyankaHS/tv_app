//package com.ultralesson.tv_app;
//
public class Product
{
    private String name;
    private String brand;
    private int quantity;
//
//    public int getQuantity() {
//        return quantity;
//    }
//
//    public void setQuantity(int quantity) {
//        this.quantity = quantity;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getBrand() {
//        return brand;
//    }
//
//    public void setBrand(String brand) {
//        this.brand = brand;
//    }
//
//    public static void main(String[] args) {
//
//        Product product = new Product();
//        product.setBrand("Apple");
//        System.out.println(product);
//    }
//
//    @Override
//    public String toString() {
//        return "Product" + '\n' +
//                "name='" + name + '\n' +
//                ", brand='" + brand + '\n' +
//                ", quantity=" + quantity ;
//    }
//}

// Default Constructor
public Product()
{
    this.brand = "Apple";
}

// Parameterized Constructor
public Product(String name, int quantity)
{
    this.name = name;
    this.quantity = quantity;
    this.brand = "Apple";
}

public String getName()
{
    return name;
}

public void setName(String name)
{
    this.name = name;
}

public String getBrand()
{
    return brand;
}

public void setBrand(String brand)
{
    this.brand = brand;
}

public int getQuantity()
{
    return quantity;
}

public void setQuantity(int quantity)
{
    this.quantity = quantity;
}

public static void main(String[] args)
{
    // Creating object from parameterized Constructor
    Product product = new Product("Airpods", 1);
    System.out.println(product);
}
}