public class ReverseString {
    public static void main(String[] args) {
        String str = "ABCDEF";
        StringBuilder revStr = new StringBuilder();
        int len = str.length();
        for (int i = len-1; i >= 0; i--) {
            revStr.append(str.charAt(i));
        }
        System.out.println("Reversed String : "+ revStr);
    }
}
