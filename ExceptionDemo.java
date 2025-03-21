import java.util.*;
public class ExceptionDemo
{
    public static void main(String[] args){
        int r,no1,no2;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no1 & no2:");
        no1=sc.nextInt();
        no2=sc.nextInt();
        try{
            r=no1/no2;
            System.out.println("Devesion="+r);
        }
        catch(ArithmeticException e){
            System.out.println("the Demoninator can not be zero");
        }
    }
}