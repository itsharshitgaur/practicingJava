package oops3.package2;

import oops3.learnPackage.Teacher;

public class MainInPackage2 extends Teacher{

    public static void main(String[] args) {
        Teacher obj = new Teacher();
        obj.teachingClass = 4;
        //obj.id = 122;
        //obj.degree = "PHD"

        MainInPackage2 mainInPackage2 = new MainInPackage2();
        mainInPackage2.studentsCount = 100;
    }
}
