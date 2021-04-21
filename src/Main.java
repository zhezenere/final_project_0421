import java.io.IOException;

public class Main {
    public static void main(String[] args) throws InterruptedException, IOException {
        PreGame preGame = new PreGame();
        while (true){
            preGame.repaint();
            Thread.sleep(20);
            if(preGame.isDrawing == false){
                break;
            }
        }

        Frame frame = new Frame(preGame.gender);
        while (true){
            frame.updateState();
            frame.repaint();
            Thread.sleep(20);
        }
    }
}
