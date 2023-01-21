import javax.swing.*;
import java.awt.*;

public class GameBoard extends JComponent implements Runnable{
    JFrame frame;
    JPanel pa;
    public GameBoard() {
        frame = new JFrame();
        pa = new JPanel();

        // set the layout
        pa.setLayout(new BorderLayout());

        // add a new JButton with name "wel" and it is
        // lie top of the container
        pa.add(new JButton("Welcome"), BorderLayout.NORTH);

        // add a new JButton with name "come" and it is
        // lie button of the container
        pa.add(new JButton("Geeks"), BorderLayout.SOUTH);

        // add a new JButton with name "Layout" and it is
        // lie left of the container
        pa.add(new JButton("Layout"), BorderLayout.EAST);

        // add a new JButton with name "Border" and it is
        // lie right of the container
        pa.add(new JButton("Border"), BorderLayout.WEST);

        // add a new JButton with name "hello everybody" and it is
        // lie center of the container
        pa.add(new JButton("GeeksforGeeks"), BorderLayout.CENTER);

        // add the pa object which refer to the Jpanel
        frame.add(pa);

        // Function to close the operation of JFrame.
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Function to set size of JFrame.
        frame.setSize(780, 780);

        // Function to set visible status of JFrame.
        frame.setVisible(true);

    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new GameBoard());
    }

    @Override
    public void run() {

    }
}

/* class MainFrame {

    // Driver code
    public static void main(String[] args)
    {

        // calling the constructor
        new BoderLayoutDemo();
    }
}
    }

    public void run() {




    }
}*/
