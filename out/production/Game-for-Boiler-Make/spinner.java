import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Arc2D;
import java.util.Random;
import javax.swing.*;
import java.awt.geom.Arc2D;
public class spinner extends JComponent implements Runnable {
    JButton buttonOne;
    JButton buttonTwo;
    JButton buttonThree;
    JButton buttonFour;
    int rand = 1;

    int finalRandomNum;

    public static void main(String[] args) {
        spinner gui = new spinner();
        gui.run();
    }

    public void run() {
        JFrame frame = new JFrame();

        //setting up buttons
        buttonFour = new JButton("4");
        buttonFour.setBackground(Color.white);
        buttonFour.setBounds(100, 100, 100, 100);
        frame.add(buttonFour);
        buttonOne = new JButton("1");
        buttonOne.setBackground(Color.white);
        buttonOne.setBounds(200, 100, 100, 100);
        frame.add(buttonOne);
        buttonThree = new JButton("3");
        buttonThree.setBackground(Color.white);
        buttonThree.setBounds(100, 200, 100, 100);
        frame.add(buttonThree);
        buttonTwo = new JButton("2");
        buttonTwo.setBackground(Color.white);
        buttonTwo.setBounds(200, 200, 100, 100);
        frame.add(buttonTwo);

        //spin button
        JButton buttonSpin = new JButton("SPIN!");
        buttonSpin.setBounds(150, 300, 90, 40);
        frame.add(buttonSpin);

        //setting up frame
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);

        //action listeners
        buttonSpin.addActionListener(new spinListener());
    }

    public void changeColor1() {

    }

    public void changeColor2() {

    }

    private class spinListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            final JButton button = (JButton) event.getSource();

            Thread r = new Thread() {
                public void run() {
                    //reset buttons back to white again
                    buttonOne.setBackground(Color.white);
                    buttonTwo.setBackground(Color.white);
                    buttonThree.setBackground(Color.white);
                    buttonFour.setBackground(Color.white);
                    //generate random number
                    Random random = new Random();
                    while (true) {
                        rand = random.nextInt(13);
                        if (rand != 0) break;
                    }
                    System.out.println(rand); //debug

                    //spinning animation
                    for (int x = 1; x <= rand; x++) {
                        if(x == rand){
                            if ((x == 1) || (x == 5) || (x == 9)) {
                                buttonOne.setBackground(Color.yellow);
                                finalRandomNum = 1;
                            } else if ((x == 2) || (x == 6) || (x == 10)) {
                                buttonTwo.setBackground(Color.yellow);
                                finalRandomNum = 2;
                            } else if ((x == 3) || (x == 7) || (x == 11)) {
                                buttonThree.setBackground(Color.yellow);
                                finalRandomNum = 3;
                            } else if ((x == 4) || (x == 8) || (x == 12)) {
                                buttonFour.setBackground(Color.yellow);
                                finalRandomNum = 4;
                            }
                        } else if ((x == 1) || (x == 5) || (x == 9)) {
                            buttonOne.setBackground(Color.yellow);
                            pause(200);
                            buttonOne.setBackground(Color.white);
                        } else if ((x == 2) || (x == 6) || (x == 10)) {
                            buttonTwo.setBackground(Color.yellow);
                            pause(200);
                            buttonTwo.setBackground(Color.white);
                        } else if ((x == 3) || (x == 7) || (x == 11)) {
                            buttonThree.setBackground(Color.yellow);
                            pause(200);
                            buttonThree.setBackground(Color.white);
                        } else if ((x == 4) || (x == 8) || (x == 12)) {
                            buttonFour.setBackground(Color.yellow);
                            pause(200);
                            buttonFour.setBackground(Color.white);
                        } else {
                            System.out.println("yikes something went wrong :(");
                        }
                    }
                }
            };

            r.start();

        }
        private void pause(int time) {
            try {
                Thread.sleep(time);
            } catch (InterruptedException ie) {
            }
        }
    }
}
