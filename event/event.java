package event;

import javax.swing.JPanel;


public class event {
    public static int score=0;
    public static void checktap(boolean b,JPanel game){

        if(b==true){
            score+=1;
            game.repaint();
        }
        else{
            if(score>0){
                score-=1;
                game.repaint();
            }
        }
    }
        
}
