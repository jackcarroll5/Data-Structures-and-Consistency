import javax.swing.*;
import java.awt.*;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class ClockThread implements Runnable {

   private JLabel timeLabel;
    private JLabel alarmTime;

   boolean running = true;

   ClockThread(JLabel timeLabel,JLabel alarmTime)
   {
       this.timeLabel = timeLabel;
       this.alarmTime = alarmTime;
   }

    public void run() {
       while (running)
       {

           try{
               GregorianCalendar gc = new GregorianCalendar();
               int hour = gc.get(Calendar.HOUR);

               int minute = gc.get(Calendar.MINUTE);

               int second = gc.get(Calendar.SECOND);

               String time = hour + ":" + minute + ":" + second;
               timeLabel.setText(time);

               System.out.println("Time Now: " + timeLabel.getText());
               System.out.println("Alarm set for: " + alarmTime.getText());


               Thread.sleep(10000);


           }
           catch (InterruptedException e){

           }
       }

    }

    public void setRunning(boolean running) {
        this.running = running;
    }

    public void setTimeLabel(JLabel timeLabel) {
        this.timeLabel = timeLabel;
    }

    public JLabel getTimeLabel() {
        return timeLabel;
    }

    public JLabel getAlarmTime() {
        return alarmTime;
    }

    public void setAlarmTime(JLabel alarmTime) {
        this.alarmTime = alarmTime;
    }
}
