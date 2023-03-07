package com.example.spring_deeply.entity;


import org.springframework.beans.factory.annotation.Autowired;

public class SingletonBean {

    private Integer id;
    private String name;
    @Autowired
    private PrototypeBean prototypeBean;

    public SingletonBean() {
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

    public PrototypeBean getPrototypeBean() {
        return prototypeBean;
    }

    public void setPrototypeBean(PrototypeBean prototypeBean) {
        this.prototypeBean = prototypeBean;
    }
}
