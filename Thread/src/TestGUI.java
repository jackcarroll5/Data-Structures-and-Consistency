import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestGUI extends JFrame {
    private JPanel canvas;
    private JButton goButton;
    private JButton stopButton;

    public static void main(String[] args) {
        TestGUI frame = new TestGUI();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public TestGUI() {
        setSize(200, 200);
        setTitle("Test");
        canvas = new JPanel();
        add(canvas, "Center");
        JPanel buttonPanel = new JPanel();
        goButton = new JButton("Go");
        stopButton = new JButton("Stop");

        buttonPanel.add(goButton);
        buttonPanel.add(stopButton);

        ButtonHandler handler = new ButtonHandler();
        goButton.addActionListener(handler);
        stopButton.addActionListener(handler);

        add(buttonPanel, "South");
    }
    private class ButtonHandler implements ActionListener {
        private MyRunnable myRunnable;
        public void actionPerformed(ActionEvent event) {
            if (event.getSource() == goButton) {
                myRunnable = new MyRunnable(canvas);
                Thread thread = new Thread(myRunnable);
                thread.start();
            } else if (event.getSource() == stopButton) {
                // Complete this code

                myRunnable.setRunning(false);

            }
        }
    }
}
