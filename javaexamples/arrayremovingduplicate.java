package javaexamples;

import java.util.*;

public class arrayremovingduplicate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int j=0;j<n;j++){
            // System.out.println(arr[j]+" ");
        }
        // for input


        //eliminating the duplicate values
        for(int i=0;i<n;i++){
          boolean k=true;
            for(int j=0;j<i;j++){
                if(arr[i]==arr[j]){
                    k=false;
                    break;
                }
            }
        
        if( k==true){
            System.out.print(arr[i]+" ");
        }
    }
       

        
   sc.close();
 }

}
