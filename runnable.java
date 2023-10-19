class dept implements Runnable
{
public void run()
{
for(int i=0; i<=5;i++)
{
System.out.println("cse");
}
}
}
class college implements Runnable
{
public void run()
{
for(int i=0; i<=5; i++)
{
System.out.println(i);
}
}
}
class runnable
{
public static void main(String[] args)
{
dept d1 =new dept();
Thread t1=new Thread(d1);
t1.start();
college c1=new college();
Thread t2= new Thread(c1);
t2.start();
}
}
