import javax.swing.*;

public class NoName implements Runnable{

    private JLabel label;
    private int n = 0;

    boolean running = true;

    public NoName(JLabel label) {
        this.label = label;
    }

    public void setRunning(boolean running) {
        this.running = running;
    }

    public void run() {
        while (running) {
            try {
                label.setText("" + n);
                n++;
                Thread.sleep(1000);


            }
            catch (InterruptedException e) {

            }
        }
    }
}
