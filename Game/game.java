package Game;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JPanel;

import character.*;
import event.event;

public class game extends JPanel implements KeyListener{
    private long lastPress=0;
    wbutton w = new wbutton(50, 50, 150,this);
    qbutton q = new qbutton(50, 50, 150,this);
    ebutton e = new ebutton(50, 50, 150,this);
    abutton a = new abutton(50, 50, 150,this);
    sbutton s = new sbutton(50, 50, 150,this);
    dbutton d = new dbutton(50, 50, 150,this);

    public game(){
        this.setBounds(0,0,1920,1080);
        this.addKeyListener(this);
        this.setFocusable(true);
        this.setLayout(null);
    }
    @Override
    public void paint(Graphics g){
        super.paint(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.drawImage(qbutton.getImage(), 300, 200,q.Size,q.Size,null);
        g2.drawImage(wbutton.getImage(), 650, 200,w.Size,w.Size,null);
        g2.drawImage(ebutton.getImage(), 1000, 200,w.Size,w.Size,null);
        g2.drawImage(abutton.getImage(), 300, 450,q.Size,q.Size,null);
        g2.drawImage(sbutton.getImage(), 650, 450,w.Size,w.Size,null);
        g2.drawImage(dbutton.getImage(), 1000, 450,w.Size,w.Size,null);
        g2.setFont(font.getFont(33));
		g2.setColor(Color.black);
        g2.drawString("Q",360, 380);
        g2.drawString("W",710, 380);
        g2.drawString("e",1060, 380);
        g2.drawString("A",360, 650);
        g2.drawString("S",710, 650);
        g2.drawString("D",1060, 650);
        g2.drawString("score "+event.score, 1300, 40);
    }
    @Override
    public void keyTyped(KeyEvent e) {
    }
    @Override
    public void keyPressed(KeyEvent e) {
        if(System.currentTimeMillis() - lastPress > 100) {
            if(e.getKeyCode()==87){
                wbutton.tap(this);
                this.repaint();
            }
            if(e.getKeyCode()==81){
                qbutton.tap(this);
                this.repaint();
            }
            if(e.getKeyCode()==69){
                ebutton.tap(this);
                this.repaint();
            }
            if(e.getKeyCode()==65){
                abutton.tap(this);
                this.repaint();
            }
            if(e.getKeyCode()==83){
                sbutton.tap(this);
                this.repaint();
            }
            if(e.getKeyCode()==68){
                dbutton.tap(this);
                this.repaint();
            }

            lastPress = System.currentTimeMillis();
        }
    }
    @Override
    public void keyReleased(KeyEvent e) {
    }
}
