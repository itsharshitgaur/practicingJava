package collectionQueueAndSet;

import java.util.*;


class Student{
    int rollNo;
    String name;

    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return rollNo == student.rollNo;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(rollNo);
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                '}';
    }
}


public class LearnSets {

    enum Color{
        RED, YELLOW, GREEN;
    }

    public static void main(String[] args) {

        System.out.println(Color.RED);

        EnumSet<Color> enumSet = EnumSet.allOf(Color.class);

        Set<Student> set = new HashSet<>();

        Student s1 = new Student(1,"Harshit");
        Student s2 = new Student(1, "Harsh");
        System.out.println(s1.equals(s2));

        set.add(new Student(1, "Harshit"));
        set.add(new Student(1, "Harshit"));
        set.add(new Student(1, "Ram"));

        System.out.println(set);

//        Set<Integer> s = new HashSet<>();  //O(1)
//        Set<Integer> s = new LinkedHashSet<>();  //O(n)
//        Set<Integer> s = new TreeSet<>();  //O(logn)
//        s.add(10);
//        s.add(20);
//        s.add(30);
//        s.add(40);
//        s.add(50);
//
//        System.out.println(s);
//
//        s.remove(20);
//        System.out.println(s.contains(30));
//
//        System.out.println(s);
    }
}
