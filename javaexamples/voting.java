package javaexamples;
import java.util.Scanner;
public class voting {
    public static void main(String args []){
    
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age:");
        int myage=sc.nextInt();
        System.out.println("Enter voting age:");
        int votingage=sc.nextInt();
        sc.close();

        if(myage>=votingage){
            System.out.println("you are elegible for voting");
        }
        else{
            System.out.println("you are not elegible for voting");
        
        }
    }
                    

    }
    
