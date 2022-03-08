package activities;

public class Activity1 {
    public static void main(String[] args){
        Car Baleno = new Car();
        Baleno.sTransmission = "Manual";
        Baleno.sMake = "2022";
        Baleno.sColor = "Blue";
        Baleno.displayCharacteristics();
        Baleno.accelerate();
        Baleno.brake();
    }
}
