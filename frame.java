import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class frame {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
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
            @Override
            public void actionPerformed(ActionEvent e) {
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
            }
        });
            frame.add(button9); 
        frame.setVisible(true);
    }
    static void printStatement() {
        System.out.println("Button pressed !"); 
    }
}
