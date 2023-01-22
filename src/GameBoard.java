import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import static javax.swing.JColorChooser.showDialog;

abstract class GameBoard implements ActionListener {
    static JButton[] map = new JButton[36];
    static JButton btn1, btn2, btn3, btn4, btn5, btn6,
            btn7, btn8, btn9, btn10, btn11, btn12,
            btn13, btn14, btn15, btn16, btn17, btn18,
            btn19, btn20, btn21, btn22, btn23, btn24, btn25,
            btn26, btn27, btn28, btn29, btn30, btn31, btn32,
            btn33, btn34, btn35, btn36;
    static boolean gameGoing1 = true;
    static boolean gameGoing2 = true;
    // Main Method
    public static void main(String[] args) throws MalformedURLException {
        frame2Method();
    }

    public static void playerFrame(Player p, Player q) throws MalformedURLException {
        double player1Money = p.getMoney();
        double player2Money = q.getMoney();
        int player1Hearts = p.getHearts();
        int player2Hearts = q.getHearts();

        JTabbedPane tabbedPane = new JTabbedPane();
        URL url = new URL("https://cdn.singulart.com/artworks/v2/cropped/2769/main/fhd/320803_56071d9f960ce7bed2363a451e60bb37.jpeg");
        ImageIcon icon = new ImageIcon(url);

        JPanel player1Stats = new JPanel(new GridLayout(1,1));
        JPanel player2Stats = new JPanel(new GridLayout(1,1));

        JLabel p1M = new JLabel("Money: $" + player1Money);
        JLabel p2M = new JLabel("Money: $" + player2Money);
        JLabel p1H = new JLabel("<3: " + player1Hearts);
        JLabel p2H = new JLabel("<3: " + player2Hearts);

        player1Stats.add(p1M);
        player1Stats.add(p1H);
        player2Stats.add(p2M);
        player2Stats.add(p2H);

        tabbedPane.addTab("Player 1 Stats:", icon, player1Stats);
        tabbedPane.addTab("Player 2 Stats:", icon, player2Stats);

        JFrame frame = new JFrame();
        // Function to close the operation of JFrame.
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Function to set size of JFrame.
        frame.setSize(400, 400);
        // Function to get the content of JFrame.
        frame.getContentPane().add(tabbedPane);
        // Function to set visible status of JFrame.
        frame.setVisible(true);
        frame.setVisible(false);

    }

    public static void boardFrame(Player p, Player q) throws MalformedURLException {

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



        //instantiate the colors for the first position
        btn31.setBackground(new Color((p.getColor().getRGB() + q.getColor().getRGB()) / 2));


        while (gameGoing1 || gameGoing2) {
            //Player1
            if (gameGoing1) {
                p = moveSpin(p, q);
                System.out.println(p.getPosition());
                if(p.getPosition()>=19){
                    gameGoing1= false;
                }
            }

            //Player2
            if (gameGoing2) {
                q = moveSpin(q, p);
                System.out.println(q.getPosition());
                if(q.getPosition()>=19){
                    gameGoing2= false;
                }
            }

            System.out.println("running");//TEST
            playerFrame(p, q);

        }


        //determine winner and respond appropriately

    }

    public static Player moveSpin(Player player, Player other) throws MalformedURLException {

        boolean gameGoing = true; //declares if game has been won
        int currPos = player.getPosition();
        int finalPos = currPos;

        //call the spin method, increase position, and determine won
        int movement = spin();
        gameGoing1 = !(player.increasePosition(movement));
        finalPos = player.getPosition(); //update val
        player = buttonActions(player);
        //update position colors
        changeColor(currPos, finalPos, player, other);
        return player;
    }

    public static int spin() {

    }

    public static void changeColor(int currPos, int finalPos, Player player, Player other) throws MalformedURLException {

        //update current position color
        if (currPos == other.getPosition()) {
            map[currPos].setBackground(other.getColor());
        } else {
            map[currPos].setBackground(Color.LIGHT_GRAY);
        }

        //update final position color
        if (finalPos == other.getPosition()) {
            map[finalPos].setBackground(new Color((player.getColor().getRGB() + other.getColor().getRGB()) / 2));
        } else {
            map[finalPos].setBackground(player.getColor());
        }
    }


    public static Player buttonActions(Player player) {
        if (player.getPosition() == 2 || player.getPosition() == 14 || player.getPosition() == 15 ||
                player.getPosition() == 17 || player.getPosition() == 6 || player.getPosition() == 11) {
            player.setHearts(player.getHearts() + 1);
        } else if (player.getPosition() == 3 || player.getPosition() == 19) {
            player.setHearts(player.getHearts() - 1);
        } else if (player.getPosition() == 4) {
            player.setMoney(player.getMoney() + 1000);
        } else if (player.getPosition() == 5) {
            player.setMoney(player.getMoney() + 300);
        } else if (player.getPosition() == 7) {
            player.setMoney(player.getMoney() + 3000);
            player.setHearts(player.getHearts() - 1);
        } else if (player.getPosition() == 8) {
            int x = JOptionPane.showConfirmDialog(null,
                    "Do you want to ask the cutie out?", "Choice", JOptionPane.YES_NO_OPTION);
            if (x == JOptionPane.YES_OPTION) {
                player.setHearts(player.getHearts() + 1);
            }
            if (x == JOptionPane.NO_OPTION) {
                player.setHearts(player.getHearts() - 1);
            }
        } else if (player.getPosition() == 3 || player.getPosition() == 19) {
            player.setHearts(player.getHearts() - 1);
        } else if (player.getPosition() == 4) {
            player.setMoney(player.getMoney() + 1000);
        } else if (player.getPosition() == 5) {
            player.setMoney(player.getMoney() + 300);
        } else if (player.getPosition() == 7) {
            player.setMoney(player.getMoney() + 3000);
            player.setHearts(player.getHearts() - 1);
        } else if (player.getPosition() == 8) {
            int y = JOptionPane.showConfirmDialog(null,
                    "Do you want to ask the cutie out?", "Choice", JOptionPane.YES_NO_OPTION);
            if (y == JOptionPane.YES_OPTION) {
                player.setHearts(player.getHearts() + 1);
                player.setMoney(player.getMoney() - 100);
            }
            if (y == JOptionPane.NO_OPTION) {
                player.setHearts(player.getHearts() - 1);
                player.setMoney(player.getMoney() + 100);
            }

        } else if (player.getPosition() == 9) {
            int y = JOptionPane.showConfirmDialog(null,
                    "Do you want to lease an apartment?", "Choice", JOptionPane.YES_NO_OPTION);
            if (y == JOptionPane.YES_OPTION) {
                player.setHearts(player.getHearts() + 1);
                player.setMoney(player.getMoney() - 2000);
            }
            if (y == JOptionPane.NO_OPTION) {
                player.setHearts(player.getHearts() - 1);
                player.setMoney(player.getMoney() + 2000);
            }
        } else if (player.getPosition() == 10) {
            player.setHearts(player.getHearts() - 1);
        } else if (player.getPosition() == 12) {
            player.setHearts(player.getHearts() + 1);
            player.setMoney(player.getMoney() + 10000);
        } else if (player.getPosition() == 13) {
            player.setHearts(player.getHearts() + 1);
            player.setMoney(player.getMoney() - 200);
        } else if (player.getPosition() == 18) {
            player.setHearts(player.getHearts() + 1);
            player.setMoney(player.getMoney() - 1000);
        }
        return player;
    }

    public static boolean frame2Method() {
        //colors
        Color color1;
        Color color2;

        //JColorChooser panels
        JColorChooser player1 = new JColorChooser();
        JColorChooser player2 = new JColorChooser();

        //show dialogs
        color1 = showDialog(player1, "Player 1 Color", Color.red);
        color2 = showDialog(player1, "Player 1 Color", Color.blue);

        //Instruction Panel
        JButton button = new JButton("Instructions: Finish College before you run out of money and or happiness. Click here to start");
        button.setBackground(Color.white);
        JPanel panelInstruct = new JPanel(new GridLayout(1, 1, 0, 0));
        panelInstruct.add(button);


        JFrame frameInstruct = new JFrame();
        // Function to close the operation of JFrame.
        frameInstruct.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Function to set size of JFrame.
        frameInstruct.setSize(800, 800);
        // Function to get the content of JFrame.
        frameInstruct.getContentPane().add(panelInstruct);
        // Function to set visible status of JFrame.
        frameInstruct.setVisible(true);
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                player1.setVisible(false);
                player2.setVisible(false);
                panelInstruct.setVisible(false);
                frameInstruct.setVisible(false);

                //instantiating the Player objects
                Player player1 = new Player(color1);
                Player player2 = new Player(color2);

                try {
                    boardFrame(player1, player2);
                } catch (MalformedURLException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        return true;
    }
}