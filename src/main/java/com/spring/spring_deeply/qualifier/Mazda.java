package com.spring.spring_deeply.qualifier;

public class Mazda implements Car {

    private String brand;

    public Mazda() {
    }

    public Mazda(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public void printBrand() {
        System.out.println(brand);
    }
}
