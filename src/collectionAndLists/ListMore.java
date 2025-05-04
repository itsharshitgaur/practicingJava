package collectionAndLists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class ListMore {

    public static void main(String[] args) {
//        List<String> fruits = new ArrayList<>();
//        fruits.add("Kiwi");
//        fruits.add("Mango");
//        fruits.add("Papaya");
//        fruits.add("Guava");
//
//        System.out.println("Using normal for loop: ");
//        for (int i = 0; i < fruits.size(); i++) {
//            System.out.println(fruits.get(i));
//        }
//
//        System.out.println("\nUsing for each loop: ");
//        for(String fruit: fruits){
//            System.out.println(fruit);
//        }
//
//        System.out.println("\nUsing iterator: ");
//        Iterator<String> fe = fruits.iterator();
//        while(fe.hasNext()){
//            System.out.println(fe.next());
//        }
//
//        List<String> smallList = fruits.subList(1,3);
//        System.out.println(smallList);

        Stack<String> vowels = new Stack<>();
        vowels.push("A");
        vowels.push("E");
        vowels.push("I");
        vowels.push("O");
        vowels.push("U");
        System.out.println(vowels);
        System.out.println(vowels.pop());
        System.out.println(vowels);
        System.out.println(vowels.peek());
        System.out.println(vowels);
    }
}
