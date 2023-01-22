
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StartWindow extends JComponent {
    /*JFrame frame;
    ImageIcon image;
    JLabel label;*/
    static JButton startButton;

    static JButton aboutButton;
    static JFrame frame;

    static Graphics2D g;


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
        //StartWindow w = new StartWindow();
        /*frame = new JFrame("Purdue Life");
        Container contentPane = frame.getContentPane();
        contentPane.add(new JLabel(new ImageIcon ("IMG_1843.jpeg")));
        frame.setSize(780, 500);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setVisible(true);*/
        frame = new JFrame();
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
        label.setLayout(new GridBagLayout());
        label.setIcon(scaleIcon);
        startButton = new JButton("Start");
        startButton.addActionListener(buttons);
        //startButton.setBounds(100, 100, 100, 100);
        aboutButton = new JButton("About Us");
        aboutButton.addActionListener(buttons);
        //aboutButton.setBounds(100, 100, 100, 100);
        JPanel inLabel = new JPanel();
        label.add(inLabel);
        inLabel.setBackground(new Color (222, 246, 255));
        inLabel.add(startButton);
        startButton.setBounds(100, 100, 100, 100);
        inLabel.add(aboutButton);
        aboutButton.setBounds(100, 100, 100, 100);
        /*GridBagConstraints start = new GridBagConstraints();
        start.fill = GridBagConstraints.HORIZONTAL;
        start.gridx = 3;
        start.gridy = 0;
        start.anchor = GridBagConstraints.LINE_START;
        label.add(startButton, start);
        label.add(aboutButton, start);*/
        c.add(label);
        frame.setVisible(true);


    }
    static ActionListener buttons = new ActionListener(){
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == startButton) {
                frame.setVisible(false);
                // Add frame
            } else if (e.getSource() == aboutButton) {
                JFrame about = new JFrame ("About");
                about.setSize(500, 400);
                Container c = about.getContentPane();
                JLabel label = new JLabel();
                label.setSize(500, 400);
                ImageIcon icon = new ImageIcon("about_us.jpg");
                Image img = icon.getImage();
                Image imageScale = img.getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH);
                ImageIcon scaleIcon = new ImageIcon(imageScale);
                label.setIcon(scaleIcon);
                c.add(label);
                about.setVisible(true);
                about.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
            }
        }
    };
    protected void paint(Image img) {
        super.paintComponent(g);
        g.drawImage(img, 0, 0, frame.getWidth(), frame.getHeight(), frame);
    }


}


