
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import javax.swing.JPanel;

public class DrawPanel extends JPanel {

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        
        Rectangle2D.Float r = new Rectangle2D.Float(20, 20, 50, 90);
        g2.setColor(Color.blue);
        g2.fill(r); // g2.draw( ) draws outline only

        g2.setColor(Color.red);
        for (int i = 0; i < 10; i++) {
            g2.draw(new Ellipse2D.Float(100 + i * 10, 100 + i * 10, 60, 30));
        }

        // to see when paintComponent is called by JVM
        System.out.println("paintComponet is called");
    }
}
