public class Test
{
    public static void main(String argv[])
    {
        String [] fileNames = {"Files example/mary1.txt", "Files example/mary2.txt"};
        
        for (int i = 0; i < fileNames.length; i++)
        {
            MyRunnable runnable = new MyRunnable("lamb", fileNames[i]);
            Thread t = new Thread(runnable);
            t.start();
        }
    }
}

