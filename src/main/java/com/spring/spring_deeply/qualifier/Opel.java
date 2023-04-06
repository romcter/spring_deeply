package com.spring.spring_deeply.qualifier;

public class Opel implements Car {

    private String brand;

    public Opel() {
    }

    public Opel(String brand) {
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
