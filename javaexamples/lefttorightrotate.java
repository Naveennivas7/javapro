package javaexamples;

import java.util.Scanner;

public class lefttorightrotate {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        // for(int j=0;j<n;j++){
        //     System.out.print(arr[j]+" ");
        // }



    int r=sc.nextInt();
    for(int j=1;j<=r;j++){
        int temp=arr[0];
       
       for(int i=0;i<n-1;i++){
        arr[i]=arr[i+1];
       }
        arr[n-1]=temp;
    }


 for(int j=0;j<n;j++){
            System.out.print(arr[j]+" ");
        }



// int temp=arr[n-1];
// for(int i=n-1;i>0;i--){
//     arr[i]=arr[i-1];

// }
// arr[0]=temp;
      
// for(int j=0;j<n;j++){
//             System.out.print(arr[j]+" ");
// }
sc.close();
}}
