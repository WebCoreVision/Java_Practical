import java.util.*;
public class Demo {
    public static void main(String[] args){
        int r,no1,no2;
        Scanner sc=new Scanner(System.in);
        try{
            System.out.println("Enter no1 & no2");
            no1=sc.nextInt();
            no2=sc.nextInt();
            r=no1/no2;
            System.out.println("Division="+r);
        }
        catch(ArithmeticException e){
            System.out.println("The Denominator can not be zero");
        }
        catch(Exception e){
            System.out.println("Please enter integer value");
        }
    }
}