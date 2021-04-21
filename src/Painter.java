import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Painter {
    Image character;
    Image background_up;
    Image background_down;
    ArrayList<Image> cars = new ArrayList<>();
    ArrayList<Image> forest = new ArrayList<>();

    Painter(boolean gender) throws IOException {
        String s;
        if(gender == true){
            s = "gentleman";
        } else {
            s = "lady";
        }
        //character = ImageIO.read(new File("data/"+s+"/...."));// Название персонажа
        background_up = ImageIO.read(new File("data/"+s+"/background_up.jpg"));
        background_down = ImageIO.read(new File("data/"+s+"/background_down.jpg"));
        cars.add(ImageIO.read(new File("data/"+s+"/cr_red.jpg")));
        cars.add(ImageIO.read(new File("data/"+s+"/cr_blue.jpg")));
        cars.add(ImageIO.read(new File("data/"+s+"/cr_green.jpg")));
    }

    public void draw(Graphics2D g2d, int x, int y, int w, int h, String s, int number, boolean t){
        if(s.equals("car")){
            Image test = cars.get(number);
            if( t == true) {
                g2d.drawImage(test, x, y, w, h, null);
            } else {
                g2d.drawImage(test, x + w, y, -w, h,null);
            }
        }
        if(s.equals("up")){
            Image test = background_up;
            g2d.drawImage(test,x,y,w,h,null);
        }
        if(s.equals("down")){
            Image test = background_down;
            g2d.drawImage(test,x,y,w,h,null);
        }
        if(s.equals("man")){
            Image test = character;
            g2d.drawImage(test, x,y,w,h,null);
        }
    }
}
