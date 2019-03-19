import javax.swing.*;

public class BallThread extends Thread {

    private JPanel panel;
    boolean running = true;
    Ball ball = new Ball(panel);


    public BallThread(JPanel p) {
        panel = p;
    }

    @Override
    public void run() {

            ball.draw();
            //for (int i = 1; i <= 1000; i++){

            while (running) {
                ball.move();
                try {
                    Thread.sleep(5);
                }
                catch(InterruptedException e) {

                }
            }

    }

    public void setRunning(boolean running)
    {
        this.running = running;
    }
}
