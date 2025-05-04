package oops4Abs;

public class LearnInterfaces {

    //Animal a1 = new Animal();

    public static void main(String[] args) {

        Monkey monkey = new Monkey();
        monkey.eats();
        monkey.sings();
        monkey.drinks();
        System.out.println(Animal.LEGS);
        monkey.walks();
    }
}


interface Animal{

    void eats();
    void drinks();
    public static final int LEGS = 4;

    default void walks(){
        System.out.println("Animal is walking.");
    }
}

interface Pet{

    void sings();
    void drinks();

}
class Monkey implements Animal, Pet{

    @Override
    public void eats() {
        System.out.println("Monkey is eating something.");
    }

    @Override
    public void drinks() {
        System.out.println("Monkey is drinking.");
    }

    @Override
    public void sings() {
        System.out.println("Monkey is singing.");
    }

}