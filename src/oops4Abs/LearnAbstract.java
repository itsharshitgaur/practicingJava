package oops4Abs;


public class LearnAbstract {

    public static void main(String[] args) {
        //Vehicle v1 = new Vehicle();
        Car c1 = new Car();
        c1.accelerate();
        c1.brakes();
        c1.honks();
    }
}

abstract class Vehicle{

    abstract void accelerate();

    abstract void brakes();

    void honks(){
        System.out.println("Car is honking.");
    }
}

class Car extends Vehicle{

    @Override
    void accelerate() {
        System.out.println("Car is accelerating.");
    }

    @Override
    void brakes() {
        System.out.println("Car brakes are pushed.");
    }
}
