package Math;

public class lowerCase {
    public static String toLowerCase(String str) {
        char[] charString = str.toCharArray();
        for (int i = 0; i < charString.length; i++) {
            if (charString[i] >= 'A' && charString[i] <= 'Z') {
                charString[i] += 32;
            }
        }
        return new String(charString);
    }

    public static void main(String[] args) {
        String Input = "Hello";
        System.out.println(toLowerCase(Input));
    }
}
