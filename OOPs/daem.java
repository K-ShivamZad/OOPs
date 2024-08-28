class daem 
{
    public static void main(String[] args) 
    {
        First f = new First();

        if (f.isDaemon())
            System.out.println("This is a Daemon Thread");
        else
            System.out.println("This is not a Daemon Thread");
        f.setDaemon(true);

        if (f.isDaemon())
            System.out.println("This is a Daemon Thread");
        f.setDaemon(false);
        f.start();
    }
}

class First extends Thread 
{
    public void run() 
    {
        System.out.println("Begin first thread");
        for (int i = 1; i < 3; i++)
            System.out.println("i=" + i);
        System.out.println("Over first thread");
    }
}
