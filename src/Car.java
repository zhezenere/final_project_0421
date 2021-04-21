import java.awt.*;

public class Car {
    public double x;
    public double y;
    public int w;
    public int h;
    public int number;
    public Car(double x0, double y0){
        this.x = x0;
        this.y = y0;
        number = (int) (Math.random() * 3);
        w = 56;
        h = 30;
    }
    public void drawCar(Graphics2D g2d, int w0){
       // g2d.setColor(Color.BLUE);
       // g2d.fillRect((int)x,(int) y, w, h);
       // g2d.fillRect((int)x - w0,(int) y, w, h);
       // g2d.fillRect((int)x + w0, (int)y, w, h);

    }
    public void updateState(double speed0, int w0, long dt){
        if(x > w0){ x = x - w0; }
        if(x < 0){ x = x + w0; }
        this.x += speed0 * dt;
    }

}
