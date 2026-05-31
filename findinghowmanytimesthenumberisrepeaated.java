import java.util.Scanner;

public class findinghowmanytimesthenumberisrepeaated {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("enter the number to find how many times it is repeated");
        int x = sc.nextInt();
        int count = 0;
        while (n > 0) {
            int rem = n % 10;
            if (rem == x) {
                count++;
            }
            n = n / 10;
        }
        System.out.println("the number is repeated " + count + " times");

    }

}
