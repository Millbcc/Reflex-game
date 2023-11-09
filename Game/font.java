package Game;

import java.awt.Font;
import java.io.File;

public class font {

    public static Font getFont(int size) {
        Font font = null;
		try {
			font = Font.createFont(Font.TRUETYPE_FONT,new File("Game\\Mali-Bold.ttf"));
			return font.deriveFont((float)size);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return font;
	
    }
    
}
