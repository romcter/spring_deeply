package com.spring.spring_deeply.qualifier;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class BeansWithoutQualifier {

    @Bean("carsWithoutQualifier")
    QualifierApplication.CarsWithoutQualifier cars () {
        return new QualifierApplication.CarsWithoutQualifier();
    }

    @Bean(name = "car_without")
    Car bmw () {
        return new Bmw("bmw without qualifier");
    }

    @Bean(name = "car_without")
    Car opel () {
        return new Opel("opel without qualifier");
    }

    @Bean(name = "car_without")
    Car mazda () {
        return new Mazda("mazda without qualifier");
    }
}
