public class MyMain {
    public static void main(String argv[]) {
        String[] fileNames = {"hamlet.txt", "Heart of Darkness Text File.txt"};
        for (int i = 0; i < fileNames.length; i++) {

            MyRunnableAlt runnable = new MyRunnableAlt(fileNames[i]);
            Thread t = new Thread(runnable);
            t.start();
            System.out.println("State: " + t.getState());

            /*MyRunnableAlt runnable2 = new MyRunnableAlt(fileNames[i]);
            Thread t2 = new Thread(runnable2);
            t2.start();*/



           // MyRunnableVer myThread = new MyRunnableVer(fileNames[i]);
            //myThread.start();

        }
    }

}
