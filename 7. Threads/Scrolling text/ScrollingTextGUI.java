//Scroller without threads 
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Cathryn
 */
public class ScrollingTextGUI extends JFrame {

    private JPanel canvas;
    private JButton goButton;
    private JButton stopButton;

    Scroller scroller;
    
    public static void main(String[] args) {
        ScrollingTextGUI frame = new ScrollingTextGUI();
        frame.setSize(200, 200);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public ScrollingTextGUI() {
        //setSize(500, 500);
        setTitle("Scrolling Text");
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

        public void actionPerformed(ActionEvent event) {
            if (event.getSource() == goButton) {

                scroller = new Scroller(canvas);

                Thread thread = new Thread(scroller);
                thread.start();


            } else if (event.getSource() == stopButton) {
                // not implemented


                scroller.setRunning(false);

                System.out.println("Stop");
            }
        }
    }
}
