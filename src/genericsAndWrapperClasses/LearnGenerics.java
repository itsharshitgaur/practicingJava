package genericsAndWrapperClasses;

public class LearnGenerics {

    public static void main(String[] args) {
        Dog<String> d1 = new Dog<>("abc123");
        Dog<String> d2 = new Dog<>("def456");

        Dog<Integer> d3 = new Dog<>(12);
        System.out.println(d1.getId());
        System.out.println(d2.getId());
        System.out.println(d3.getId());
    }
}

class Dog<E>{
    E id;
    //V name;
    public Dog(E id){
        this.id = id;
        //this.name = name;
    }

    E getId(){
        return id;
    }
}
