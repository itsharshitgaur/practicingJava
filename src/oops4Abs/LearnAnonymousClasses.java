package oops4Abs;

public class LearnAnonymousClasses {
    OuterClass obj = new OuterClass(){
        void sing(){

        }

        public void outerMethod(){

        }
    };

    SuperInterface obj2 = new SuperInterface() {
        @Override
        public void interfaceMethod() {

        }
    };

    SuperInterface obj3 = () -> {

    };

    public static void main(String[] args) {
        //Lambda expression
        Walkable walkable = (int steps) -> {
            System.out.println("Walked "+steps+" steps.");
            return steps;
        };
        walkable.walks(5);
        Walkable obj2 = (int steps) -> 2*steps;
        System.out.println(obj2.walks(8));
    }
}


class OuterClass{
    public void outerMethod(){

    }
}

@FunctionalInterface
interface SuperInterface{

    void interfaceMethod();

}

interface Walkable{
    int walks(int steps);
}