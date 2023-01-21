import java.awt.*;
import javax.swing.*;
import java.awt.*;

// create a class griddemo
public class GameBoard {

    // Main Method
    public static void main(String[] args)
    {

        // Creating Object of JFrame class
        // with new name frame
        JFrame frame = new JFrame("GridLayout Demo");

        // Initialization of object
        JButton btn1 = new JButton("Button 1");
        JButton btn2 = new JButton("Button 2");
        JButton btn3 = new JButton("Button 3");
        JButton btn4 = new JButton("Button 4");
        JButton btn5 = new JButton("Button 5");
        JButton btn6 = new JButton("Button 5");
        JButton btn7 = new JButton("Button 5");
        JButton btn8 = new JButton("");
        btn8.setBorderPainted(false);
        btn8.setBackground(Color.white);
        JButton btn9 = new JButton("");
        btn9.setBorderPainted(false);
        btn9.setBackground(Color.white);
        JButton btn10 = new JButton("");
        btn10.setBorderPainted(false);
        btn10.setBackground(Color.white);
        JButton btn11 = new JButton("");
        btn11.setBorderPainted(false);
        btn11.setBackground(Color.white);
        JButton btn12 = new JButton("Button 5");
        JButton btn13 = new JButton("Button 5");
        JButton btn14 = new JButton("");
        btn14.setBorderPainted(false);
        btn14.setBackground(Color.white);
        JButton btn15 = new JButton("");
        btn15.setBorderPainted(false);
        btn15.setBackground(Color.white);
        JButton btn16 = new JButton("");
        btn16.setBorderPainted(false);
        btn16.setBackground(Color.white);
        JButton btn17 = new JButton("");
        btn17.setBorderPainted(false);
        btn17.setBackground(Color.white);
        JButton btn18 = new JButton("Button 5");
        JButton btn19 = new JButton("Button 5");
        JButton btn20 = new JButton("");
        btn20.setBorderPainted(false);
        btn20.setBackground(Color.white);
        JButton btn21 = new JButton("");
        btn21.setBorderPainted(false);
        btn21.setBackground(Color.white);
        JButton btn22 = new JButton("");
        btn22.setBorderPainted(false);
        btn22.setBackground(Color.white);
        JButton btn23 = new JButton("");
        btn23.setBorderPainted(false);
        btn23.setBackground(Color.white);
        JButton btn24 = new JButton("Button 5");
        JButton btn25 = new JButton("Button 5");
        JButton btn26 = new JButton("");
        btn26.setBorderPainted(false);
        btn26.setBackground(Color.white);
        JButton btn27 = new JButton("");
        btn27.setBorderPainted(false);
        btn27.setBackground(Color.white);
        JButton btn28 = new JButton("");
        btn28.setBorderPainted(false);
        btn28.setBackground(Color.white);
        JButton btn29 = new JButton("");
        btn29.setBorderPainted(false);
        btn29.setBackground(Color.white);
        JButton btn30 = new JButton("Button 5");
        JButton btn31 = new JButton("Button 5");
        JButton btn32 = new JButton("Button 5");
        JButton btn33 = new JButton("Button 5");
        JButton btn34 = new JButton("Button 5");
        JButton btn35 = new JButton("Button 5");
        JButton btn36 = new JButton("Button 5");







        // Creating Object Panel of JPanel class
        // create grid layout with 3 rows,
        // 2 columns with horizontal and
        // vertical gap set to 10
        JPanel panel = new JPanel(new GridLayout(6, 6, 0, 0));

        // Adding JButton "btn1" on JPanel.
        panel.add(btn1);

        // Adding JButton "btn2" on JPanel.
        panel.add(btn2);

        // Adding JButton "btn3" on JPanel.
        panel.add(btn3);

        // Adding JButton "btn4" on JPanel.
        panel.add(btn4);

        // Adding JButton "btn5" on JPanel.
        panel.add(btn5);
        panel.add(btn6);
        panel.add(btn7);
        panel.add(btn8);
        panel.add(btn9);
        panel.add(btn10);
        panel.add(btn11);
        panel.add(btn12);
        panel.add(btn13);
        panel.add(btn14);
        panel.add(btn15);
        panel.add(btn16);
        panel.add(btn17);
        panel.add(btn18);
        panel.add(btn19);
        panel.add(btn20);
        panel.add(btn21);
        panel.add(btn22);
        panel.add(btn23);
        panel.add(btn24);
        panel.add(btn25);
        panel.add(btn26);
        panel.add(btn27);
        panel.add(btn28);
        panel.add(btn29);
        panel.add(btn30);
        panel.add(btn31);
        panel.add(btn32);
        panel.add(btn33);
        panel.add(btn34);
        panel.add(btn35);
        panel.add(btn36);



        // Function to close the operation of JFrame.
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Function to set size of JFrame.

        frame.setSize(800, 800);

        // Function to get the content of JFrame.
        frame.getContentPane().add(panel);

        // Function to set visible status of JFrame.
        frame.setVisible(true);
    }
}
