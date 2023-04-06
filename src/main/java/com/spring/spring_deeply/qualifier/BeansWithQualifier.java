package com.spring.spring_deeply.qualifier;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class BeansWithQualifier {

    @Bean("carsWithQualifier")
    QualifierApplication.CarsWithQualifier cars () {
        return new QualifierApplication.CarsWithQualifier();
    }

    @Bean(name = "bmw")
    @Qualifier("car_with")
    Car bmw () {
        return new Bmw("bmw with qualifier");
    }

    @Bean(name = "opel")
    @Qualifier("car_with")
    Car opel () {
        return new Opel("opel with qualifier");
    }

    @Bean(name = "mazda")
    @Qualifier("car_with")
    Car mazda () {
        return new Mazda("mazda with qualifier");
    }
}
