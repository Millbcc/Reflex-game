package character;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.Timer;

import java.util.Random;
import Game.game;
import event.event;


public class qbutton {
    public int x,y,Size,origin = 4000,bound = 7000;
    private static int status = 1;

    public qbutton(int x,int y,int Size,JPanel game){
        this.x = x;
        this.y = y;
        this.Size = Size;
        setStatus(game);
    }

    public static void tap(JPanel game) {
        if(status==2){
            status=3;
            game.repaint();
            event.checktap(true, game);
            Timer timer = new Timer(600,new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                status = 1;
                game.repaint();
            }
            
        });
        timer.setRepeats(false);
        timer.start();
        }
        else{
            event.checktap(false, game);
        }
    }
    
    public void setStatus(JPanel game){
        Random r = new Random();
        int n = r.nextInt(origin,bound);
        Timer timer = new Timer(n,new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(status==1){
                    status = 2;
                    game.repaint();
                }
            }
            
        });
        timer.setRepeats(true);
        timer.start();
    }
        
    
    
    
    public static BufferedImage getImage(){
        BufferedImage image = null;
        try {
            if(status==1){
                image = ImageIO.read(new File("img\\bs1.png"));
            }
            else if(status==2){
                image = ImageIO.read(new File("img\\bs2.png"));
            }
            else{
                image = ImageIO.read(new File("img\\bs3.png"));
            }
        } catch (IOException e) {

            e.printStackTrace();
        }
        return image;
    }
    
}
