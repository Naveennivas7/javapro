import java.util.Scanner;

public class basic {
    public static void main(String[] args) {
        // System.out.println(13&5);
        // System.out.println(42|13);
        // System.out.println(13^6);
        // System.out.println(13&5);
        // System.out.println(42|13);
        // System.out.println(13^6);
        // System.out.println(13>>3);

        // int x=15;
        // if(x%3 == 0){
        // System.out.println("hi");}
        // else if(x%5 == 0){
        // System.out.println("hello");}
        // else if(x%3 == 0 && x%5 == 0){
        // System.out.println("hihello");
        // }
        int a = 10;
        int b = 5;
        Scanner s = new Scanner(System.in);
        char c = s.next().charAt(0);
        s.close();

        switch (c) {
            case '+':
                System.out.println(a + b);
                break;
            case '-':
                System.out.println(a - b);
                break;
        }
    }

}
