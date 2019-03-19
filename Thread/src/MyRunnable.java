import javax.swing.*;
import java.awt.*;

public class MyRunnable implements Runnable {

    private String text;
    private JPanel panel;

    boolean running = true;

    public MyRunnable (JPanel p) {
        panel = p;
        text = new String("Welcome to IT Tralee ");
    }

    public void run() {
            draw();
            while (running) {
                move();
                try {
                    Thread.sleep(100);
                }
                catch (InterruptedException e)
                {

                }
            }
    }

    public void setRunning(boolean running)
    {
        this.running = running;
    }

    private void draw() {
        Graphics g = panel.getGraphics();
        g.setColor(Color.black);
        g.drawString(text, 10, 20);
        g.dispose();
    }
    private void move() {
        Graphics g = panel.getGraphics();
        Color c = panel.getBackground();
        g.setColor(c);
        g.drawString(text, 10, 20);
        text = text.substring(1, text.length())
                + text.substring(0, 1);
        g.setColor(Color.black);
        g.drawString(text, 10, 20);
        g.dispose();
    }

}
