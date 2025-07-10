package javaexamples;
import java.util.*;

public class addinginanarray {
    public static int[] plusOne(int[] digits) {
        for(int i = digits.length-1; i>=0; i--)
        {
            if(digits[i]!=9)
            {
                digits[i] = digits[i]+1;
                return digits;
            }
            digits[i] = 0;
        } 
        digits = new int[digits.length+1];
        digits[0] = 1;
        return digits; 
    }

    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] digits=new int[n];
        for(int i=0;i<n;i++){
            digits[i]=sc.nextInt();
        }
        int[] res=plusOne(digits);
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
sc.close();
    }
    
}
