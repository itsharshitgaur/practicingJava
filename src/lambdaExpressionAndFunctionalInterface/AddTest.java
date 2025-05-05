package lambdaExpressionAndFunctionalInterface;

@FunctionalInterface
interface addInterf{
    void add(int a, int b);
}

public class AddTest {
    public static void main(String[] args) {
        addInterf ai = (a,b) -> System.out.println(a+b);
        ai.add(2,3);
    }
}
