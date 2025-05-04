package exceptionHandling;

public class FinallyBlockInExceptions {

    public static void main(String[] args) {
        int a[] = new int[5];

//        System.out.println("Hello World!");
//
//        try{
//            System.out.println(a[3]);
//        } catch (Exception e) {
//            System.out.println("Exceptions Handled.");
//        } finally {
//            System.out.println("I will always run.");
//        }
//
//        System.out.println("Bye World!");
        try{
            getNumberFromArray(a);
        } catch (Exception e){
            System.out.println("Catched the exception "+e.getMessage());
        }
    }

    static int getNumberFromArray(int a[]) throws ArithmeticException{
        return a[8];
    }
}
