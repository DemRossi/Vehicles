package vehicles;

import lombok.Data;
import fuel.Fuel;

@Data
public abstract class Vehicle extends CanMakeSound{
    private int speed;
    private Integer wheels;
    private String color;
    private Fuel fuel;

    private String sound;

    public abstract void makeSound();

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }





    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(Integer wheels) {
        this.wheels = wheels;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Fuel getFuel() {
        return fuel;
    }

    public void setFuel(Fuel fuel) {
        this.fuel = fuel;
    }

}
