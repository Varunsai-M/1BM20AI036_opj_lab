import java.awt.*;
import java.awt.event.*;
public class MouseListenerExample2 extends Frame implements MouseListener{
   MouseListenerExample2(){
      addMouseListener(this);
      setSize(500,500);
      setLayout(null);
      setVisible(true);
   }
   public void mouseClicked(MouseEvent e) {
         Graphics g=getGraphics();
         g.setColor(Color.GREEN);
         g.fillOval(e.getX(),e.getY(),30,30);
   }
   public void mouseEntered(MouseEvent e) {}
   public void mouseExited(MouseEvent e) {}
   public void mousePressed(MouseEvent e) {}
   public void mouseReleased(MouseEvent e) {}
   public static void main(String[] args) {
      new MouseListenerExample2();
   }
}