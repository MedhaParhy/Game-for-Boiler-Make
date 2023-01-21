import java.awt.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// create a class griddemo
abstract class GameBoard implements ActionListener {

    // Main Method
    public static void main(String[] args)
    {

        // Creating Object of JFrame class
        // with new name frame

        JFrame frame2 = new JFrame("Menu");
        JFrame frameInstruct = new JFrame("Instructions");
        // Frame 2:

        //Instruction Frame
        JButton button = new JButton("Instructions: Finish College before you run out of money and or happiness. Click here to start");
        button.setBackground(Color.white);
        JPanel panelInstruct = new JPanel(new GridLayout(1, 1, 0, 0));
        panelInstruct.add(button);
        frameInstruct.setSize(300, 400);
        frameInstruct.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameInstruct.setSize(800, 800);
        frameInstruct.getContentPane().add(panelInstruct);
        frameInstruct.setVisible(true);
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frameInstruct.setVisible(false);
                boardFrame();
            }
        });


    }
    public static void boardFrame (){
        JFrame frame3 = new JFrame("Purdue Life");

        JButton btn1 = new JButton("Button 1");
        btn1.setBackground(Color.LIGHT_GRAY);
        JButton btn2 = new JButton("Button 2");
        btn2.setBackground(Color.LIGHT_GRAY);
        JButton btn3 = new JButton("Button 3");
        btn3.setBackground(Color.LIGHT_GRAY);
        JButton btn4 = new JButton("Button 4");
        btn4.setBackground(Color.LIGHT_GRAY);
        JButton btn5 = new JButton("Button 5");
        btn5.setBackground(Color.LIGHT_GRAY);
        JButton btn6 = new JButton("Button 5");
        btn6.setBackground(Color.LIGHT_GRAY);
        JButton btn7 = new JButton("Button 5");
        btn7.setBackground(Color.LIGHT_GRAY);
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
        btn12.setBackground(Color.LIGHT_GRAY);
        JButton btn13 = new JButton("Button 5");
        btn13.setBackground(Color.LIGHT_GRAY);
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
        btn18.setBackground(Color.LIGHT_GRAY);
        JButton btn19 = new JButton("Button 5");
        btn19.setBackground(Color.LIGHT_GRAY);
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
        btn24.setBackground(Color.LIGHT_GRAY);
        JButton btn25 = new JButton("Button 5");
        btn25.setBackground(Color.LIGHT_GRAY);
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
        btn30.setBackground(Color.LIGHT_GRAY);
        JButton btn31 = new JButton("Button 5");
        btn31.setBackground(Color.LIGHT_GRAY);
        JButton btn32 = new JButton("Button 5");
        btn32.setBackground(Color.LIGHT_GRAY);
        JButton btn33 = new JButton("Button 5");
        btn33.setBackground(Color.LIGHT_GRAY);
        JButton btn34 = new JButton("Button 5");
        btn34.setBackground(Color.LIGHT_GRAY);
        JButton btn35 = new JButton("Button 5");
        btn35.setBackground(Color.LIGHT_GRAY);
        JButton btn36 = new JButton("Button 5");
        btn36.setBackground(Color.LIGHT_GRAY);

        JPanel panel = new JPanel(new GridLayout(6, 6, 0, 0));
        panel.add(btn1);
        panel.add(btn2);
        panel.add(btn3);
        panel.add(btn4);
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

        frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame3.setSize(800, 800);
        frame3.getContentPane().add(panel);
        frame3.setVisible(true);
    }
}
