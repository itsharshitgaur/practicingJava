package oops2;

public class Car extends Vehicle{    //Inheritance
    String color;

    void start(){       //Method Overriding
        Scooter scooterObj = new Scooter();
        scooterObj.braking(this);
        super.start();
        System.out.println("Car is starting.");
    }

    /*
    void accelerate(){  //error because it is a method with final keyword in Vehicle.java
        System.out.println("Error");
    }
    */

    Car(){
        super(3);
        System.out.println("Car is being created.");
    }

    public static void main(String[] args) {
        Car obj = new Car();
        obj.model = "I10";
        obj.wheelsCount = 4;
        obj.color = "Black";
        obj.start();
    }
}

class Scooter{

    void braking(Car car){
        System.out.println(car.model + " is braking.");
    }
}