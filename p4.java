import java.util.*;
public class p4{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int tx;
        if(a<500000)
        {
            tx=0;
             System.out.println("tax is"+tx);
        }
        else if(a>=500000 && a<1000000)
        {
            tx=(a*20)/100;
             System.out.println("tax is"+tx);
        }
        else if(a>=100000)
        {
            tx=(a*30)/100;
             System.out.println("tax is"+tx);
        }
       
        
        sc.close(); 
    }
}
