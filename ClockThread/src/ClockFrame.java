import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClockFrame extends JFrame {

    private JButton startButton;
    private JButton setAlarm;
    private JLabel timeLabel;
    private JLabel alarmTime;
    String time;
    String currentTime;

    public ClockFrame()
    {
      super("Clock Application");
        setLayout(new FlowLayout());
        startButton = new JButton("Start");
       add(startButton);
       setAlarm = new JButton("Set Alarm");
       add(setAlarm);
       timeLabel = new JLabel("Time");
       add(timeLabel);
       alarmTime = new JLabel("Alarm");
       add(alarmTime);

       ButtonHandler handler = new ButtonHandler();
       startButton.addActionListener(handler);
       setAlarm.addActionListener(handler);

   setSize(275, 100);
   setVisible(true);

    }

    private class ButtonHandler implements ActionListener
    {
        private ClockThread r1;


        public void actionPerformed(ActionEvent e) {

           if(e.getSource() == startButton)
           {
               r1 = new ClockThread(timeLabel,alarmTime);

               Thread thread = new Thread(r1);
               thread.start();

               timeLabel.setText(r1.getTimeLabel().getText());

               //r1.setTimeLabel(timeLabel);
               System.out.println("Current Time: " + timeLabel.getText());
               System.out.println(r1.getTimeLabel().getText());
               System.out.println("Alarm Time " + alarmTime.getText());


               if(timeLabel == alarmTime)
               {
                   r1.setRunning(false);
                   Toolkit.getDefaultToolkit().beep();
                   System.out.println("\nWake Up! It's now " + time);
               }

           }


            else if(e.getSource() == setAlarm)
           {

              int hour = Integer.parseInt(JOptionPane.showInputDialog("Please enter alarm hour"));

               int minute = Integer.parseInt(JOptionPane.showInputDialog("Please enter alarm minute"));

               int sec = Integer.parseInt(JOptionPane.showInputDialog("Please enter alarm second"));

               //Second not needed

              time = hour + ":" + minute + ":" + sec;
               System.out.println("The time set is " + time);

               alarmTime.setText(time);

               System.out.println(alarmTime.getText());


           }


        }

    }

    public static void main(String[] args) {
        ClockFrame frame = new ClockFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public JButton getSetAlarm() {
        return setAlarm;
    }

    public void setSetAlarm(JButton setAlarm) {
        this.setAlarm = setAlarm;
    }

    public JLabel getTimeLabel() {
        return timeLabel;
    }

    public void setTimeLabel(JLabel timeLabel) {
        this.timeLabel = timeLabel;
    }
}
