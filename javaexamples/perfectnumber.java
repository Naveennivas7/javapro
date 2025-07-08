package javaexamples;

public class perfectnumber {
    public static int isPerfect(int num) {
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        if(sum==num) {
            return sum;
        } else {
        return 0;
        }

    
}
public static void main(String[] args) {
        int a = 1000;
        for (int i = 1; i <= a; i++) {
            if (isPerfect(i) != 0) {
                System.out.println(i);

    }}}}

