import java.awt.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.net.MalformedURLException;
import java.net.URL;

abstract class GameBoard implements ActionListener {
static JButton[] map = new JButton[36];
    static JButton btn1,btn2, btn3,btn4,btn5,btn6,
            btn7,btn8,btn9, btn10,btn11,btn12,
            btn13,btn14, btn15, btn16, btn17,btn18,
            btn19,btn20,btn21,btn22,btn23,btn24,btn25,
            btn26,btn27,btn28,btn29,btn30,btn31,btn32,
            btn33, btn34, btn35, btn36;
    // Main Method
    public static void main(String[] args) throws MalformedURLException {
        frame2();


    }
    public static void boardFrame (Player p, Player q){
        JFrame frame3 = new JFrame("Purdue Life");

        btn1 = new JButton("Finals");
        btn1.setBackground(Color.LIGHT_GRAY);
        btn2 = new JButton("Move to Meredith Hall");
        btn2.setBackground(Color.LIGHT_GRAY);
        btn3 = new JButton("You spot a cutie in CS251");
        btn3.setBackground(Color.LIGHT_GRAY);
        btn4 = new JButton("Sign a lease for an apartment");
        btn4.setBackground(Color.LIGHT_GRAY);
        btn5 = new JButton("Food Poisoning from Wiley");
        btn5.setBackground(Color.LIGHT_GRAY);
        btn6 = new JButton("Finals");
        btn6.setBackground(Color.LIGHT_GRAY);
        btn7 = new JButton("Starbucks Addiction");
        btn7.setBackground(Color.LIGHT_GRAY);
        btn8 = new JButton("");
        btn8.setBorderPainted(false);
        btn8.setBackground(Color.white);
        btn9 = new JButton("");
        btn9.setBorderPainted(false);
        btn9.setBackground(Color.white);
        btn10 = new JButton("");
        btn10.setBorderPainted(false);
        btn10.setBackground(Color.white);
        btn11 = new JButton("");
        btn11.setBorderPainted(false);
        btn11.setBackground(Color.white);
        btn12 = new JButton("Internship");
        btn12.setBackground(Color.LIGHT_GRAY);
        btn13 = new JButton("Part-Time Job");
        btn13.setBackground(Color.LIGHT_GRAY);
        btn14 = new JButton("");
        btn14.setBorderPainted(false);
        btn14.setBackground(Color.white);
        btn15 = new JButton("");
        btn15.setBorderPainted(false);
        btn15.setBackground(Color.white);
        btn16 = new JButton("");
        btn16.setBorderPainted(false);
        btn16.setBackground(Color.white);
        btn17 = new JButton("");
        btn17.setBorderPainted(false);
        btn17.setBackground(Color.white);
        btn18 = new JButton("Chicago Trip");
        btn18.setBackground(Color.LIGHT_GRAY);
        btn19 = new JButton("Roommate Issues");
        btn19.setBackground(Color.LIGHT_GRAY);
        btn20 = new JButton("");
        btn20.setBorderPainted(false);
        btn20.setBackground(Color.white);
        btn21 = new JButton("");
        btn21.setBorderPainted(false);
        btn21.setBackground(Color.white);
        btn22 = new JButton("");
        btn22.setBorderPainted(false);
        btn22.setBackground(Color.white);
        btn23 = new JButton("");
        btn23.setBorderPainted(false);
        btn23.setBackground(Color.white);
        btn24 = new JButton("Party Arrest");
        btn24.setBackground(Color.LIGHT_GRAY);
        btn25 = new JButton("Boiler Gold Rush");
        btn25.setBackground(Color.LIGHT_GRAY);
        btn26 = new JButton("");
        btn26.setBorderPainted(false);
        btn26.setBackground(Color.white);
        btn27 = new JButton("");
        btn27.setBorderPainted(false);
        btn27.setBackground(Color.white);
        btn28 = new JButton("");
        btn28.setBorderPainted(false);
        btn28.setBackground(Color.white);
        btn29 = new JButton("");
        btn29.setBorderPainted(false);
        btn29.setBackground(Color.white);
        btn30 = new JButton("Au Bon Pain lady quits");
        btn30.setBackground(Color.LIGHT_GRAY);
        btn31 = new JButton("Start");
        btn31.setBackground(Color.LIGHT_GRAY);
        btn32 = new JButton("Finals");
        btn32.setBackground(Color.LIGHT_GRAY);
        btn33 = new JButton("The Burrow gives you diarrhea");
        btn33.setBackground(Color.LIGHT_GRAY);
        btn34 = new JButton("Florida Spring Break");
        btn34.setBackground(Color.LIGHT_GRAY);
        btn35 = new JButton("Sledding on Slader Hill");
        btn35.setBackground(Color.LIGHT_GRAY);
        btn36 = new JButton("Finals");
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
        frame3.setSize(1500, 900);
        frame3.getContentPane().add(panel);
        frame3.setVisible(true);

        map = new JButton[]{btn31, btn25, btn19, btn13, btn7,
                btn1, btn2, btn3, btn4, btn5, btn6, btn12,
                btn18, btn24, btn30, btn36, btn35, btn34, btn33, btn32};
        boolean gameGoing = true;

        while(gameGoing){
            //Player1
            moveSpin(p,q);
            //Player2
            moveSpin(q,p);
        }


    }
    public static void moveSpin(Player player, Player other){

    }

    public static void frame2() throws MalformedURLException, MalformedURLException {
        Color color1;
        Color color2;

        JFrame frame2 = new JFrame("Main Menu");
        JTabbedPane jTabbedPane = new JTabbedPane();

        URL url = new URL("https://louisville.edu/enrollmentmanagement/images/person-icon/image");
        URL url2 = new URL("https://people.sc.fsu.edu/~jburkardt/datasets/alphabet_lowercase/i.png");

        ImageIcon icon = new ImageIcon(url);
        ImageIcon icon2 = new ImageIcon(url2);

        JColorChooser player1 = new JColorChooser();
        JColorChooser player2 = new JColorChooser();

        //Instruction Panel
        JButton button = new JButton("Instructions: Finish College before you run out of money and or happiness. Click here to start");
        button.setBackground(Color.white);
        JPanel panelInstruct = new JPanel(new GridLayout(1, 1, 0, 0));
        panelInstruct.add(button);

        jTabbedPane.addTab("Player 1", null, player1, "Determines color for player 1");
        jTabbedPane.setMnemonicAt(0, KeyEvent.VK_1);
        jTabbedPane.addTab("Player 2", null, player2, "Determines color for player 2");
        jTabbedPane.setMnemonicAt(1, KeyEvent.VK_2);
        jTabbedPane.addTab("Instructions", null, panelInstruct, "Instructions");
        jTabbedPane.setMnemonicAt(2, KeyEvent.VK_3);

        //update colors if not null
        if (player1.getColor() != null) {
            color1 = player1.getColor();
        } else {
            color1 = Color.green;
        }

        if (player2.getColor() != null) {
            color2 = player2.getColor();
        } else {
            color2 = Color.blue;
        }

        // Function to close the operation of JFrame.
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Function to set size of JFrame.
        frame2.setSize(800, 800);
        // Function to get the content of JFrame.
        frame2.getContentPane().add(jTabbedPane);
        // Function to set visible status of JFrame.
        frame2.setVisible(true);
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                player1.setVisible(false);
                player2.setVisible(false);
                panelInstruct.setVisible(false);
                jTabbedPane.setVisible(false);
                frame2.setVisible(false);

                //instantiating the Player objects
                Player player1 = new Player (color1);
                Player player2 = new Player(color2);

                boardFrame(player1, player2);
            }
        });

    }

}
