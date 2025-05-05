package lambdaExpressionAndFunctionalInterface;

@FunctionalInterface
interface lengthInterf{
    void getlength(String s);
}

@FunctionalInterface
interface squareInterf{
    int squareIt(int n);
}

public class GetLengthOfString {
    public static void main(String[] args) {

        lengthInterf li = s -> System.out.println(s.length());
        li.getlength("Harshit");

        squareInterf si = n -> n*n;
        System.out.println(si.squareIt(2));

    }
}
