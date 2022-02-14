package core;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Game extends JPanel {

    labrynth lab = new labrynth();
    Player p = new Player();

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        lab.paint(g);
        p.paint(g);
    }

    public Game() {
        addKeyListener(new KeyListener() {

            @Override
            public void keyTyped(KeyEvent e) {
                p.keyPressed(e);
            }

            @Override
            public void keyPressed(KeyEvent e) {
                p.keyPressed(e);
            }

            @Override
            public void keyReleased(KeyEvent e) {
                p.keyPressed(e);
            }

        });
        setFocusable(true);
    }

    public static void main(String[] args) {
        JFrame miVentana = new JFrame("Labrynth");
        Game miJuego = new Game();
        miVentana.add(miJuego);

        miVentana.setSize(900, 600);
        miVentana.setVisible(true);
        miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miVentana.setLocation(600, 200);

        while (true) {

            miJuego.repaint();
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {// cada 500 milisegundos se repinta x2
                e.printStackTrace();
            }
            // miJuego.juego();

        }

    }
}
