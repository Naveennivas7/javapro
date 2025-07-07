package javaexamples;

public class axisingfromfirst {
    public static void main(String[] args) {
        int n = 24618;
        int pv=1;
        int temp = n;
        
        while(temp!=0){
         pv=pv*10;
            temp=temp/10;

            
        }pv=pv/10;
        while(pv!=0){
            int d =(n/pv)%10;
            System.out.println(d);
            pv=pv/10;

    
}}}
