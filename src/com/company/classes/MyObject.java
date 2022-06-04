package com.company.classes;

// klasa abstrakcyjna
public abstract class MyObject {
    // enkapsulacja(modyfikator dostępu)
    private Integer price;

    // statyczny(ad hoc) polimorfizm (2 konstruktory)
    public MyObject() {
    }

    public MyObject(Integer price) {
        this.price = price;
    }

    public String getClassName(){
        return this.getClass().getSimpleName();
    }

    public void printParentClassName(){
        System.out.println(this.getClass().getSuperclass().getSimpleName());
    }

    public void buy(String price){
        System.out.println("Buying " + getClassName() + ", price = " + price);
    }

    public void sell(String price){
        System.out.println("Selling " + getClassName() + ", price = " + price);
    }

    // enkapsulacja(getter)
    public Integer getPrice() {
        return price;
    }

    // enkapsulacja(setter)
    public void setPrice(Integer price) {
        this.price = price;
    }
}
