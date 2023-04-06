package com.spring.spring_deeply.qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class QualifierApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(QualifierApplication.class, args);

        CarsWithQualifier carsWithQualifier = context.getBean(CarsWithQualifier.class);
        carsWithQualifier.cars.forEach(Car::printBrand);

        System.out.println("==============================================================================");

        CarsWithoutQualifier carsWithoutQualifier = context.getBean(CarsWithoutQualifier.class);
        carsWithoutQualifier.cars.forEach(Car::printBrand);

//        bmw with qualifier
//        opel with qualifier
//        mazda with qualifier
//        ==============================================================================
//        bmw without qualifier
    }

    public static class CarsWithoutQualifier {
        public List<Car> cars;

        @Autowired
        @Qualifier("car_without")
        public void setList(List<Car> cars) {
            this.cars = cars;
        }
    }

    public static class CarsWithQualifier {
        public List<Car> cars;

        @Autowired
        @Qualifier("car_with")
        public void setList(List<Car> cars) {
            this.cars = cars;
        }
    }
}
