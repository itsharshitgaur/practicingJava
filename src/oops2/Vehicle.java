package oops2;

public class Vehicle {

    final int gears = 6;

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle(2);
        //v1.gears = 4; //error because value is set with final keyword before this.
    }

    int wheelsCount;
    String model;

    void start(){
        System.out.println("Vehicle is starting.");
    }

    Vehicle(){
        System.out.println("Creating a vehicle instance.");
    }

    Vehicle(int wheelsCount){
        this.wheelsCount = wheelsCount;
        System.out.println("Creating vehicle with wheels.");
    }

    final void accelerate() {
        System.out.println("Vehicle is accelerating.");
    }
}
