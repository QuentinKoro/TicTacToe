import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.Color;

public class frame {
    JFrame frame = new JFrame();

    class theFrame {
        void createAndShowFrame() {
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(500, 500);
            frame.setLayout(new GridLayout(3,3,0,0));

            JButton button1 = new JButton();
            button1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    printStatement();
                }
            });
            frame.add(button1);

    JButton button2 = new JButton();
    button2.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            printStatement();
        }
    });
    frame.add(button2);

    // Add action listeners to the rest of the buttons
    JButton button3 = new JButton();
    button3.addActionListener(new ActionListener() {
        //@Override
        boolean toRemove = true;
        public void actionPerformed(ActionEvent e) {
            if(toRemove) {
                System.out.println("is true !\n");
                toRemove = false;
            }
            else {
                System.out.println("is false !\n");
                toRemove = true;
            }
            printStatement();
        }
    });
    frame.add(button3);

    JButton button4 = new JButton();
    button4.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            printStatement();
        }
    });
    frame.add(button4);

    JButton button5 = new JButton();
    button5.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            printStatement();
        }
    });
    frame.add(button5);

    JButton button6 = new JButton();
    button6.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            printStatement();
        }
    });
    frame.add(button6);

    JButton button7 = new JButton();
    button7.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            printStatement();
        }
    });
    frame.add(button7);

    JButton button8 = new JButton();
    button8.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            printStatement();
        }
    });
    frame.add(button8);

    JButton button9 = new JButton();
    button9.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            printStatement();
            changeColor(button9, 'B');
        }
    });
    frame.add(button9); 
            frame.setVisible(true);
        }
    
    }
    static void printStatement() {
        System.out.println("Button pressed !"); 
    }
    /**
     * @param a button
     * @param a color that is a char or blue or red (B/R)
     * Changes the color of the button to the color that is in parameters
     */
    static void changeColor(JButton button, char color) {
        if (color == 'B') { 
            button.setBackground(Color.BLUE);
        }
        if (color == 'R') { 
            button.setBackground(Color.RED);
        }
        else {
            System.out.println("Error, color not defined in function changeColor\n");
        }
    }
}
