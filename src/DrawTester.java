
import java.awt.Container;
import javax.swing.JFrame;

public class DrawTester extends JFrame {

    public void initialize() {

        DrawPanel panel = new DrawPanel(); // Use JPanel for drawing canvas
        Container contentPane = getContentPane();
        contentPane.add(panel, "Center");
        
    }

}
