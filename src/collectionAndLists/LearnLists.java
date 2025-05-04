package collectionAndLists;

import java.util.ArrayList;
import java.util.List;

public class LearnLists {

    public static void main(String[] args) {

        //int a[] = new int[5];

        List<Integer> list = new ArrayList<>();
//        List<Integer> list2 = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(4);

        System.out.println(list);
        System.out.println(list.get(0));
        list.set(1, 3);
        System.out.println(list);
        list.add(3, 5);
        System.out.println(list);
        list.remove(1);
        System.out.println(list);
        System.out.println(list.indexOf(10));
        System.out.println(list.lastIndexOf(10));
//        list2.add(1);
//        list2.add(2);
//        list2.add(3);
//        list2.add(4);

//        System.out.println(list);
//        System.out.println(list.size());
//        System.out.println(list.contains(20));
//
//
//        list.remove(1);
//        System.out.println(list);
//
//        list.remove(Integer.valueOf(10));
//        System.out.println(list);

//        list.addAll(list2);
//        System.out.println(list);
//
//        list.removeAll(list2);
//        System.out.println(list);

//        list.retainAll(list2); //prints common of both
//        System.out.println(list);
//
//        list.clear();
//        System.out.println(list);

//        Object[] a = list.toArray();
//
//        for(Object e: a) {
//            Integer temp = (Integer) e;
//            System.out.println(e);
//        }
//
//        System.out.println(list);
    }
}
