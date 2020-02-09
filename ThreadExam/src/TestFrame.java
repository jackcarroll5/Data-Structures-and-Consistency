import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestFrame extends JFrame{
    private JButton startButton;
    private JButton stopButton;
    private JLabel label;
    private NoName noname;
    private Thread thread;

    // set up GUI
    public TestFrame() {
        super("Test Application");
        setLayout(new FlowLayout());
        startButton = new JButton("Start");
        add(startButton);
        stopButton = new JButton("Stop");
        add(stopButton);
        label = new JLabel("Time");
        add(label);
        ButtonHandler handler = new ButtonHandler();
        startButton.addActionListener(handler);
        stopButton.addActionListener(handler);
        setSize(275, 100);
        setVisible(true);
    }
    private class ButtonHandler implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            if (event.getSource() == startButton) {
                noname = new NoName(label);
                thread = new Thread(noname);
                thread.start();
            } else if (event.getSource() == stopButton) {
                // to be completed

                noname.setRunning(false);


            }
        }
    }
    public static void main(String args[]) {
        TestFrame frame = new TestFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
