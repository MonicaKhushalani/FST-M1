package activities;

public class Car {
    String sColor;
    String sTransmission;
    String sMake;
    int iDoors;
    int iTyres;
//constructor
    Car(){
        iDoors = 4;
        iTyres = 4;
    }
//Methods
    public void displayCharacteristics(){
 System.out.println ("Color of the car :" + sColor);
 System.out.println("Make of the Car :" + sMake);
 System.out.println("No. of Doors of the Car :" + iDoors);
 System.out.println("No.of Tyres of the car :" + iTyres);
 System.out.println("Transmission of the Car :" + sTransmission);
    }
public  void accelerate(){
        System.out.println("Car is moving forward");
}
public  void brake(){
        System.out.println("Car has stopped");
}
}
