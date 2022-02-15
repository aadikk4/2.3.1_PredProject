package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarServiceImpl implements CarService {

    private List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car("BMW", "X5", 2004));
        cars.add(new Car("LADA", "GRANTA", 2010));
        cars.add(new Car("MERCEDES", "BENZ", 2014));
        cars.add(new Car("VAZ", "2107", 2000));
        cars.add(new Car("Porsche", "7777", 2018));
    }


    public List<Car> getCars(int count) {
        return cars.stream().limit(count).collect(Collectors.toList());
    }
}