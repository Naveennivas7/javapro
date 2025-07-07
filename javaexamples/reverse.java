package javaexamples;

public class reverse {
    public static void main(String[] args) {
        int n = 12345;
        int s = 0;
        while (n > 0) {
            int d = n % 10;
            s = s * 10 + d;
            n = n / 10;
     
        }
        System.out.print(s);
    }
}
