package oops3.learnEncapsulation;

import oops3.learnPackage.Person;

public class MainInEncapsulation {

    static{
        System.out.println("Called from the static block.");
    }

    public static void main(String[] args) {
        System.out.println("Called from the main method.");
        Person p1 = new Person();
        p1.setAge(12);
        System.out.println(p1.getAge());

    }
}
