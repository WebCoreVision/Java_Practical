
import java.util.*;
class StudentP1
{
 String name;
 int age;
 StudentP1()
 {
 System.out.println("Default Constructor.");
 name="Unknown";
 age=0;
 }
 StudentP1(String nm,int a)
 {
 System.out.println("Overloaded Constructor.");
 name=nm;
 age=a;
 }
 StudentP1(StudentP1 s)
 {
 System.out.println("Copy Constructor.");
 this.name=s.name;
 this.age=s.age;
 }
 void show()
 {
 System.out.println("Name="+name+"\t Age="+age);
 }
 public static void main(String[] args) {
 StudentP1 obj1=new StudentP1();
 StudentP1 obj2=new StudentP1("Raaj", 18);
 StudentP1 obj3=new StudentP1(obj2);
 obj1.show();
 obj2.show();
 obj3.show();
 }
}