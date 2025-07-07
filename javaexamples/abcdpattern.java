package javaexamples;

public class abcdpattern {
    public static void main(String [] args) {
//         char ch = 'A';
//         for (int i = 1; i <= 5; i++) {
//             for (int j = 1; j <= i; j++) {
//                 System.out.print(ch + " ");
//                 ch++;
//             }
//             System.out.println();
//         }
    
        int n=4;
        for(int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print(j);
            }System.out.println();
        }
}
}