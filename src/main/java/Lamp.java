public class Lamp {
    // State of the Lamp
    private boolean isOn;

    //constructor
    public Lamp(){
        isOn = false;
    }

    //Method to Turn Lamp On
    public void turnOn(){
        isOn = true;
    }

    //Method to turn the lamp off
    public void turnOff(){
        isOn = false;
    }

    //Method to check if the lamp is on:
    public boolean isTheLampOn(){
        return isOn;
    }
}
