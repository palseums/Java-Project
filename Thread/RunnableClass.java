package package1;

public class RunnableClass implements Runnable{

    @Override
    public void run() {
        for (int i=0;i<=10;i++)
        {
            System.out.println("The value of i is " + i);
        }
    }
}
