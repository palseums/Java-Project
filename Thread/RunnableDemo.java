package package1;

public class RunnableDemo {

    public static void main(String[] args)
    {
        RunnableClass rc = new RunnableClass();
        Thread[] dispatchers = new Thread[3];
        for(int i = 0; i<dispatchers.length;i++)
        {
            dispatchers[i] = new Thread(rc);
            System.out.println("Starting the thread number" + i);
            dispatchers[i].start();
        }
    }
}
