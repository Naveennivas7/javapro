package javaexamples;

import java.util.Scanner;

public class largestamongthreenum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        /*
         * if (a > b && a > c) {
         * System.out.println("largest number is:" + a);
         * } else if (b > a && b > c) {
         * System.out.println("largest number is :" + b);
         * } else {
         * System.out.println("largest number is;" + c);
         * }
         */
        int max = Math.max(a, Math.max(b, c));
        System.out.println("largest number is:" + max);
    }
}