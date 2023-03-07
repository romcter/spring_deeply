package com.example.spring_deeply.entity;


public class PrototypeBean {

    private Integer id;
    private String name;


    public PrototypeBean(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public PrototypeBean() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
