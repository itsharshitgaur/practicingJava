public class table {
    void print (int num){
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d * %d = %d",num, i, num*i).println();
        }
    }
    public static void main(String[] args) {
        table Table = new table();
        Table.print(5);
    }
}
