import javax.swing.*;

public class GameBoard extends JComponent implements Runnable{
    public GameBoard() {

    }
    public static void main(String[] args) {
        //System.out.println("Testing main menu...");
        SwingUtilities.invokeLater(new GameBoard());
    }

    public void run() {

    }
}
