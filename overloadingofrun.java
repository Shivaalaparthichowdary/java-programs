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
    public static void main(String[] args)

    {
        mythread m1 = new mythread();
        m1.start(); 
         m1.run(2);
    }
}
// over loading of run() is possible but thread.start() is only for no arugument run().