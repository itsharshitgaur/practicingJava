package lambdaExpressionAndFunctionalInterface;

@FunctionalInterface
interface interf{
    public void m1();
}

/*Without Lambda Expression*/
/*
class Demo implements interf{
    @Override
    public void m1() {
        System.out.println("Normal implementation of m1() method.");
    }
}

public class Test {

    public static void main(String[] args) {

        interf i = new Demo();
        i.m1();

    }
}
*/

/*With Lambda Expression*/

class Test{
    public static void main(String[] args) {

        interf i = () -> System.out.println("Lambda Expression implementation of m1() method.");
        i.m1();

    }
}
