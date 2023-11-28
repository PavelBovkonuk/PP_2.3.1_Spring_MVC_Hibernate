package web.service;

import web.models.Car;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImpl implements CarService {

    private final List<Car> carList = new ArrayList<>();

    public CarServiceImpl() {
        carList.add(new Car("Toyota", "Land Cruiser Prado", "White"));
        carList.add(new Car("Honda", "Civic", "Black"));
        carList.add(new Car("Ford", "Mustang", "Brown"));
        carList.add(new Car("BMW", "3-series", "Blue"));
        carList.add(new Car("Mercedes-Benz", "ML", "Green"));
    }

    @Override
    public List<Car> getCars(int count) {
        if (count >= carList.size() || count < 0) {
            return carList;
        } else {
            return carList.subList(0, count);
        }
    }
}
