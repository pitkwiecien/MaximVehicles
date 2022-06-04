package com.company.classes;

public abstract class MyObject {
    private Integer price;

    //Polimorfizm statyczny (2 konstruktory)
    public MyObject() {
    }

    public MyObject(Integer price) {
        this.price = price;
    }

    public void printParentClassName(){
        System.out.println(this.getClass().getSuperclass().getName());
    }

    public void buy(String price){
        System.out.println("Buying " + this.getClass().getName() + ", price = " + price);
    }

    public void sell(String price){
        System.out.println("Selling " + this.getClass().getName() + ", price = " + price);
    }
}
