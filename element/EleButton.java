package element;

import java.awt.Color;
import javax.swing.JButton;

import Game.font;

public class EleButton extends JButton{

	private static final long serialVersionUID = 1L;

		public EleButton(String title,int size,int x,int y,int width,int height) {
			super(title);
			this.setBackground(new Color(0,0,0));
			this.setForeground(Color.white);
			this.setFont(font.getFont(size));
			this.setBounds(x, y, width, height);
		}
		
}