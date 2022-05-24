package vehicles;

import lombok.Data;

@Data
public class Car extends Vehicle{

    public void rollDownWindow(){
        System.out.println("window is down");
    }

    @Override
    public void makeSound() {
        System.out.println("Car horn");
    }

}
