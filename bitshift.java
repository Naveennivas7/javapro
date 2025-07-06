public class bitshift {
    public static void main(String[]args){
        int a=10;
        int temp=a;
        int bit=0;
        while(temp !=0){
            bit++;
            temp=temp>>1;

        }
        int mask=(1<<bit)-1;
        int res=a^mask;
        System.out.println(res);
        

    } 
    
}
