import java.awt.*;

public class Bridge {
    public int x;
    public int y;
    public int w;
    public int h;
    public Bridge(int x0, int y0){
        this.x = x0;
        this.y = y0;
        w = (int) (Math.random()*30) + 40;
        h = 30;
    }
    public void draw(Graphics2D g2d){
        g2d.setColor(new Color(125,50,50));
        g2d.fillRect(x, y, w, h);
    }
}
