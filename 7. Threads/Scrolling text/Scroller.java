//Scroller without threads 
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
import javax.swing.*;

/**
 *
 * @author Cathryn
 */

public class Scroller implements Runnable
{
    private String text;
    private JPanel panel;

    private boolean running = true;

    public Scroller (JPanel p) {
        panel = p;   
        //text = new String("Visit the Wild Atlantic Way ");


        text = JOptionPane.showInputDialog("Please enter the text to be scrolled!  ");


    }

        public void run() {
        draw();
        while (running) {
            move();
            delay();
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
        Thread thread = new Thread(text);
        thread.start();
        thread.run();

        text = text.substring(1, text.length())
                + text.substring(0, 1);

        Random ran = new Random();

        int red = ran.nextInt(255);
        int green = ran.nextInt(255);
        int blue = ran.nextInt(255);

       Color ranColour = new Color(red,green,blue);

        g.setColor(ranColour);
        /*g.setColor(Color.black);*/
        g.drawString(text, 10, 20);
        g.dispose();
    }

    private void delay() {
        try {
            Thread.sleep(100);
        }
        catch (InterruptedException e) {
            return;
        }
    }
}

