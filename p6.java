import java.util.*;
public class p6{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double a= sc.nextDouble();
        if(a>=100)
        {
            System.out.println("fever");
            
        }
        else
        {
            System.out.println("no fever");
        }
        sc.close();
    }       
}