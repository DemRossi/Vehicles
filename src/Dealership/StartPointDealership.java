package Dealership;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StartPointDealership {
    private List<Car> cars = new ArrayList<>();
    private List<UsedCars> usedCars = new ArrayList<>();

    public static void main(String[] args) {
        StartPointDealership startPointDealership = new StartPointDealership();

        startPointDealership.makeInventory();

        System.out.println(startPointDealership.findCar("1234567890"));
        System.out.println(startPointDealership.findCar("0987654321"));
        System.out.println(startPointDealership.findCar("5673447382"));

    }
    public void makeInventory(){
        Car car1 = new Car();
        car1.setVin("1234567890");
        car1.setBrand("BMW");
        car1.setFuel("Diesel");
        car1.setColor("grey");

        Car car2 = new Car();
        car2.setVin("0987654321");
        car2.setBrand("Citroen");
        car2.setFuel("Naft");
        car2.setColor("Red");

        cars.add(car1);
        cars.add(car2);

        UsedCars car3 = new UsedCars();
        car3.setVin("5673447382");
        car3.setBrand("Mazda");
        car3.setFuel("Naft");
        car3.setColor("Blue");
        car3.setAmountOfKM(120000);

        usedCars.add(car3);
    }

    protected List<Car> getAllCars(){
        ArrayList<Car> res = new ArrayList<>(cars.size() + usedCars.size());

        res.addAll(cars);
        res.addAll(usedCars);

        return Collections.unmodifiableList(res);
    }

    public Car findCar(String vin){
        for(Car car : getAllCars()){
            if (car.getVin().equals(vin)){
                return car;
            }
        }
        return null;
    }
}
