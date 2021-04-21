import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferStrategy;

public class PreGame extends JFrame implements MouseListener {

    public ClickObject gent;
    public ClickObject l;
    public boolean gender = true;
    public ClickObject start;
    public boolean isDrawing = true;

    public PreGame() {
        setVisible(true);
        setSize(700, 700);
        gent = new ClickObject(200, 200, 40, 80, "gentleman");
        l = new ClickObject(400, 200, 40, 40, "lady");
        start = new ClickObject(300, 380, 40, 70, "START");
        addMouseListener(this);
    }


    public void paint(Graphics g) {
        BufferStrategy bufferStrategy = getBufferStrategy();
        if (bufferStrategy == null) {
            createBufferStrategy(2);
            bufferStrategy = getBufferStrategy();
        }
        g = bufferStrategy.getDrawGraphics();
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(new Color(240,180,180));
        g2d.fillRect(0, 0, getWidth(), getHeight());

        g.setColor(Color.WHITE);
        g.fillRect(0,0,getWidth(),getHeight());
        if((gent != null)&&(l != null)&&(start != null)){
            gent.drawButton(g);
            l.drawButton(g);
            start.drawButton(g);
        }
        g.dispose();
        bufferStrategy.show();
    }


    @Override
    public void mouseClicked(MouseEvent e) {
        if (gent.checkClick(e)) {
            gent.color = Color.GREEN;
            l.color = Color.WHITE;
            gender = true;
        }
        if (l.checkClick(e)) {
            gent.color = Color.WHITE;
            l.color = Color.RED;
            gender = false;
        }
        if (start.checkClick(e)) {
            isDrawing = false;
        }

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
