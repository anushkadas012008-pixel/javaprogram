import java.util.*;
public class p3{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        int tax= (a+b+c)*18/100;
        int total= a+b+c+tax;
        System.out.println("Total amount after adding 18% tax is: " + total);
        sc.close();
    }
}