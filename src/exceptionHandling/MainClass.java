package exceptionHandling;

public class MainClass {
    public static void main(String[] args) {

//        try{
//
//            int result = 5/0;
//            System.out.println(a[8]);
//
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("Tried to access the out of bound element.");
//        } catch (ArithmeticException e){
//            System.out.println(e.getStackTrace());
//            System.out.println(e.getMessage());
//            System.out.println(e);
//        }
        int a[] = new int[5];
        System.out.println("Hello Guys!");
        try {

            int result = 5 / 0;
            System.out.println(a[8]);

//        } catch (ArrayIndexOutOfBoundsException | ArithmeticException | NullPointerException e) {
//            System.out.println("Handling the exception.");
//        } catch (RuntimeException e){
//            System.out.println("Handling the runtime exception.");
//        }
        } catch (Exception e) { // All 3 exception classes used in catch block are child classes of Runtime Exception and Runtime is the child of "Exception" class so we can say "Exception" class is the parent of every exception class used above hence we can also write like this to handle any exception with just one catch statement.
            System.out.println("All exceptions handled.");
        }

        System.out.println("Bye Guys!");
    }
}
