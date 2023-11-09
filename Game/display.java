package Game;
import javax.swing.JFrame;

import event.event;
public class display extends JFrame{
    public display(){
        super("Reflex game");
        this.setSize(1920,1080);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.getContentPane().setLayout(null);
        this.getContentPane().add(new game());
    }
	
	public void endgame(long point) {
		this.getContentPane().removeAll();
		this.getContentPane().repaint();
		this.getContentPane().add(new menu(point, null));
	}

    public static void main(String[] args) {
        display display = new display();
    }
}