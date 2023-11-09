package Game;

import javax.swing.JPanel;

import java.awt.Color;
import java.awt.event.ActionListener;

import element.EleButton;
import element.EleLabel;

public class menu extends JPanel{
    public menu() {
        //----
    }
    public menu(long point,ActionListener main){
        try{
            this.setBounds(0,0,1920,1080);
            this.setFocusable(true);
            this.setLayout(null);
                        
            EleLabel game_name = new EleLabel("Reflex",40,700,100,200,100);
            game_name.setForeground(Color.black);	

            EleButton easyButton = new EleButton("Easy mode", 40, 700, 200, 200, 100);
            easyButton.addActionListener(main);
            
            this.add(game_name);
            this.add(easyButton);
        }catch (Exception e) {
            e.printStackTrace();
        }
		
    }
}
