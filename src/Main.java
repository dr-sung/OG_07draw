
import javax.swing.JFrame;

public class Main {

    public static void main(String[] args) {
        DrawTester frame = new DrawTester();
        frame.initialize();
        frame.setSize(300, 300);
        frame.setLocation(100, 100);
        frame.setTitle("Draw Test");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
