package core;

import java.awt.Graphics;
import java.awt.event.KeyEvent;


public class Player {
    private int x = 40;
    private int y = 40;
    private int width = 40;
    private int height = 40;
    private int speed = 40;
    labrynth labrynth = new labrynth();

    

    public void paint(Graphics graphics) {
        graphics.setColor(java.awt.Color.RED);
        graphics.fillOval(x, y, width, height);
        graphics.setColor(java.awt.Color.BLACK);
        graphics.drawOval(x, y, width, height);
    }
    

    public void keyPressed(KeyEvent e) {
        int[][] lab=labrynth.getLabrynth();
        if (e.getKeyCode() == 37) {// left
            if(lab[y/40][(x/40)-1]!=1){
                x-=speed;
            }
        }
        if (e.getKeyCode() == 39) {// right
            if(lab[y/40][(x/40)+1]!=1){
                x+=speed;
            }
        }
        if (e.getKeyCode() == 40) {// down
            if(lab[(y/40)+1][x/40]!=1){
                y+=speed;
            }
        }
        if (e.getKeyCode() == 38) {// up
            if(lab[(y/40)-1][x/40]!=1){
                y-=speed;
            }
        }
    }

}
