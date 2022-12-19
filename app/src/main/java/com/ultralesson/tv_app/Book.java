package com.ultralesson.tv_app;

public class Book
{
    private String name;
    private String category;
    private String author;

    // Static field
    private static String binding = "Paperback";

    // Constructor
    public Book(String name, String category, String author)
    {
        this.name = name;
        this.category = category;
        this.author = author;
    }

    public String getBookDetails()
    {
        return String.format("Book %s belongs to %s, is written by %s and with a binding => %s <=", name, category, author, binding);
    }

    public static void main(String[] args) {
        Book b1 = new Book("Harry and friends", "Fiction","Kumar");
        Book b2 = new Book("Python","Programming","Jack");

        System.out.println(b1.getBookDetails());
        System.out.println(b2.getBookDetails());
    }


}
