package quiz.application;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/**
 *
 * @author abhik
 */
public class Login extends JFrame implements ActionListener{
    JButton rules, back;
    JTextField tfname;
    
    Login() {
        getContentPane().setBackground(Color.white);
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/quizpic.jpg"));
        JLabel image = new JLabel(i1);
        image.setBounds(0, 0,600,700);
        add(image);
        
        JLabel heading = new JLabel("Quiz UP!");
        heading.setBounds(800, 60, 300, 45);
        heading.setFont(new Font("Snap ITC", Font.BOLD, 35));
        heading.setForeground(Color.black);
        add(heading);
        
        JLabel name = new JLabel("Enter your name");
        name.setBounds(810,150,300,30);
        name.setFont(new Font("Mongolian Baiti", Font.BOLD, 25));
        name.setForeground(Color.black);
        add(name);
        
        rules = new JButton("Instructions");
        rules.setBounds(745,270,120,35);
        rules.setBackground(new Color(30,144,254));
        rules.setForeground(Color.white);
        rules.addActionListener(this);
        add(rules);
        
        back = new JButton("Back");
        back.setBounds(935,270,120,35);
        back.setBackground(new Color(30,144,254));
        back.setForeground(Color.white);
        back.addActionListener(this);
        add(back);
        
        tfname = new JTextField();
        tfname.setBounds(700,200,425,30);
        tfname.setFont(new Font("Times New Roman", Font.BOLD,20));
        add(tfname);
        
        setSize(1200,650);
        setLocation(400,200);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == rules) {
            String name = tfname.getText();
            setVisible(false);
            new Rules(name);
        } else if (ae.getSource() == back) {
            setVisible(false);
        }
    }
    
    public static void main(String[] args) {
        new Login();
    }
}
