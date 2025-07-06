public class swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        int temp = a;
        a=b;
        b=temp;
        System.out.println("a ="+ a);
        System.out.println("b ="+b);

        //swaping without temporary variable
        a = a + b; 
        b = a - b;
        a = a - b;
        System.out.println("a ="+ a);
        System.out.println("b ="+b);
        
}}
