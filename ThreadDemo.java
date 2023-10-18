class mythread extends Thread{
    public void run()
    {
        System.out.println("no argument method");
    }
    public void run(int i)
    {
        System.out.println("int argument method");
    }
}
class overloadingofrun
{
    public static void main(STring[] args)

    {
        mythread m1 = new mythread();
        m1.start(); 
    }
}