package quiz.application;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
/**
 *
 * @author abhik
 */
public class Score extends JFrame implements ActionListener{
    
    Score(String name, int score) {
        setBounds(600,150,950,750);
        getContentPane().setBackground(Color.white);
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/result.jpg"));
        Image i2 = i1.getImage().getScaledInstance(300, 250, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 200, 300, 250);
        add(image);
        
        JLabel heading = new JLabel("Thank you for attempting the Quiz");
        heading.setBounds(40,70,700,50);
        heading.setFont(new Font("Kristen ITC", Font.PLAIN, 35));
        add(heading);
        
        JLabel ascore = new JLabel("Your score is " + score);
        ascore.setBounds(450,300,300,30);
        ascore.setFont(new Font("Tahoma", Font.PLAIN, 30));
        add(ascore);
        
        JButton submit = new JButton("Attempt Again");
        submit.setBounds(490, 370, 120, 40);
        submit.setBackground(new Color(30, 144, 255));
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        add(submit);
        
        setVisible(true);
        
    }
    
    public void actionPerformed(ActionEvent ae) {
        setVisible(false);
        new Login();
    }
    
    public static void main(String[] args) {
        new Score("User", 0);
    }
}
