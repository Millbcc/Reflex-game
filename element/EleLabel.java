package element;

import javax.swing.JLabel;

import Game.font;

public class EleLabel extends JLabel {

	private static final long serialVersionUID = 1L;
		
		public EleLabel(String title,int size,int x,int y,int w,int h) {
			 super(title);
			 setFont(font.getFont(size));
			 setBounds(x,y,w,h);
		}
}