package javaexamples;
import java.util.*;
public class printingzeroatlast {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int index=0;
            int [] arr=new int[n];
        for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
        }
        for(int j=0;j<n;j++){
            if(arr[j]!=0){
                System.out.println(arr[j]);
                index++;
            }
        
        }
        for(int i=index;i<n;i++){
                System.out.println(arr[i]=0);
        }



        
   sc.close();
 }
}
