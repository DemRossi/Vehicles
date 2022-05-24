package vehicles;

public abstract class CanMakeSound {
    private String sound;

    abstract void makeSound();

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }
}
