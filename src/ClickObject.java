import java.awt.*;
import java.awt.event.MouseEvent;

public class ClickObject {

    public int x;
    public int y;
    public int w;
    public int h;
    public Color color = Color.WHITE;
    public String s;

    public ClickObject(int x, int y, int h, int w, String s) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
        this.s = s;
    }

    public boolean checkClick(MouseEvent e) {
        if ((e.getX() > this.x) && (e.getX() < this.x + this.w) && (e.getY() > this.y) && (e.getY() < this.y + this.h)) {
            return true;
            } else {
            return false;
        }
    }

    public void drawButton(Graphics g) {
        g.setColor(color);
        g.fillRect(x, y, w, h);
        g.setColor(Color.BLACK);
        g.drawRect(x, y, w, h);
        g.drawString(s, x + 3, y + (int)(h/2));
    }






}
