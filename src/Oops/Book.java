package Oops;

public class Book {
    String name;
    String author;
    double price;

    Book(String name, String author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }
    public String toString(){
    return "name:"+name+"author:"+author+"price:"+price;
    }
}