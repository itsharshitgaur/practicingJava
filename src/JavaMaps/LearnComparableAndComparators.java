package JavaMaps;

import java.util.*;

class MyCustomComparator implements Comparator<Animal>{

    @Override
    public int compare(Animal o1, Animal o2) {
        return Integer.compare(o1.weight, o2.weight);
    }
}

public class LearnComparableAndComparators {

    public static void main(String[] args) {
        Animal a1 = new Animal(4, "Leo", 10);
        Animal a2 = new Animal(2, "Bruno", 4);
        Animal a3 = new Animal(2, "Max", 6);
        Animal a4 = new Animal(3, "Don", 3);

        List<Animal> dogs = new ArrayList<>();
        dogs.add(a1);
        dogs.add(a2);
        dogs.add(a3);
        dogs.add(a4);

        System.out.println(dogs);

//        Collections.sort(dogs, new MyCustomComparator());
//        Collections.sort(dogs, (o1,  o2) -> o1.name.compareTo(o2.name));
//
//        Collections.sort(dogs, Comparator.comparing(Animal::getAge).thenComparing(Animal::getName));
//        System.out.println(dogs);

        int a[][] = {
                {4, 5, 2},
                {5, 1, 2},
                {1, 4, 7}
        };

        Arrays.sort(a, (arr1, arr2) -> {
            return arr1[0] - arr2[0];
        });

        for (int e[]: a) {
            for (int element: e) {
                System.out.print(element+" ");
            }
            System.out.println();
        }
    }
}
