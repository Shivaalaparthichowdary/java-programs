import java.io.*;
import java.util.Scanner;

class parent
{
int n;
public void salary()
{

    Scanner s1=new Scanner(System.in);
    System.out.println("enter the salary:-");
    n=s1.nextInt(); 
}
}
class child1 extends parent
{
void incre1()
{

double hike1=0.2;
double m= n+(n*hike1);
System.out.println("first child incrementn "+m);
}
}
class child2 extends parent
{
    public void incre2()
    {
        double hike2= 0.2;
        double p=n+(n*hike2);
        System.out.println("the second child increment is"+p);
    }
}
class hierarical
{
    public static void main(String[] args)
    {
    child1 c1 = new child1();
    c1.salary();
    c1.incre1();
    child2 c2= new child2();
    c2.salary();
    c2.incre2();
    }
}

