class syncTest extends Thread 
{
    static int n = 5;

    public syncTest(String threadName) 
    {
        super(threadName);
    }

    void pleasewait() 
    {
        try {
            sleep(1000);
        } catch (InterruptedException e) 
        {
            System.out.println("Interrupted Exception arised");
        }
    }

    public void run() 
    {
        syncClass.view(getName(), n);
    }
}

class syncClass 
{
    public static synchronized void view(String tname, int n) 
    {
        for (int i = 0; i < n; i++) 
        {
            syncTest s = (syncTest) Thread.currentThread();
            s.pleasewait();
            System.out.println(tname + " " + i);
        }
    }
}

class test 
{
    public static void main(String[] args) 
    {
        syncTest s1 = new syncTest("First");
        syncTest s2 = new syncTest("Second");
        s1.start();
        s2.start();
    }
}
