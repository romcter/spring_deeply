package com.spring.spring_deeply.qualifier;


public class Bmw implements Car {

    private String brand;

    public Bmw(){}

    public Bmw(String name) {
        this.brand = name;
    }

    public String getName() {
        return brand;
    }

    public void setName(String name) {
        this.brand = name;
    }

    @Override
    public void printBrand() {
        System.out.println(brand);
    }
}
