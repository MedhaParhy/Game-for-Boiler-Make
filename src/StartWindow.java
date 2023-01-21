
import javax.swing.*;
import java.awt.*;

public class StartWindow extends JComponent implements Runnable {
    /*JFrame frame;
    ImageIcon image;
    JLabel label;*/


    public StartWindow(){
        /*image = new ImageIcon("IMG_1843.jpeg");
        label = new JLabel(image);
        label.setSize(780, 500);

        frame = new JFrame("Purdue Life");
        frame.add(label);
        frame.setSize(780, 500);
        frame.setVisible(true);
        */



    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new GameBoard());
        /*frame = new JFrame("Purdue Life");
        Container contentPane = frame.getContentPane();
        contentPane.add(new JLabel(new ImageIcon ("IMG_1843.jpeg")));
        frame.setSize(780, 500);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setVisible(true);*/
        JFrame frame = new JFrame();
        frame.setTitle("Purdue Life");
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(780, 500);
        Container c = frame.getContentPane();
        JLabel label = new JLabel();
        label.setSize(780, 500);
        ImageIcon icon = new ImageIcon("PURDUE.jpg");
        Image img = icon.getImage();
        Image imageScale = img.getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaleIcon = new ImageIcon(imageScale);
        label.setIcon(scaleIcon);
        c.add(label);
        frame.setVisible(true);
        JButton startButton = new JButton("Start");

    }

    @Override
    public void run() {
        /*image = new ImageIcon("IMG_1843.jpeg");
        label = new JLabel(image);
        label.setSize(100, 100);

        frame = new JFrame("Purdue Life");
        frame.add(label);
        frame.setSize(780, 500);
        frame.setVisible(true);*/

    }
}
