import vehicles.Car;
import vehicles.Motorcycle;
import vehicles.Truck;
import vehicles.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class StartPoint {
    public static void main(String[] args) {
        List<Vehicle> file = new ArrayList<>();

        file.add(new Car());
        file.add(new Motorcycle());
        file.add(new Truck());

        for (Vehicle v : file ) {
            v.makeSound();
            if(v instanceof Car){
                ((Car) v).rollDownWindow();
            }
        }
    }
}
