package quiz.application;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author abhik
 */
public class Rules extends JFrame implements ActionListener{
    String name;
    JButton start, back;
    Rules(String name) {
        
        getContentPane().setBackground(Color.white);
        setLayout(null);
        
        JLabel heading = new JLabel("Welcome " + name + " to QUIZ UP!");
        heading.setBounds(50, 20, 700, 30);
        heading.setFont(new Font("Snap ITC", Font.BOLD, 35));
        heading.setForeground(Color.black);
        add(heading);
        
        JLabel rules = new JLabel();
        rules.setBounds(20, 90, 700, 350);
        rules.setFont(new Font("Tahoma", Font.PLAIN, 16));
        rules.setText(
                 "<html>"+ 
                "1. Do not close the tab without attempting the all the questions." + "<br><br>" +
                "2. All the questions are compulsory." + "<br><br>" +
                "3. All are MCQ pattern questions." + "<br><br>" +
                "4. You can select only one option from each question." + "<br><br>" +
                "5. Each question is of 5 marks." + "<br><br>" +
                "6. Each question has a time limit of 60 secconds." + "<br><br>" +
                "7. Click on Next to move to next question." + "<br><br>" +
                "8. Click on Submit at the end after completing the exam." + "<br><br>" +
            "<html>"
        );
        add(rules);
        
        back = new JButton("Back");
        back.setBounds(250,500,100,30);
        back.setBackground(new Color(30,144,254));
        back.setForeground(Color.white);
        back.addActionListener(this);
        add(back);
        
        start = new JButton("Start Quiz");
        start.setBounds(400,500,100,30);
        start.setBackground(new Color(30,144,254));
        start.setForeground(Color.white);
        start.addActionListener(this);
        add(start);
        
        setSize(800,650);
        setLocation(350,100);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == start) {
            setVisible(false);
            new Quiz(name);
        } else {
            setVisible(false);
            new Login();
        }
    }
    
    public static void main(String[] args) {
        new Rules("User");
    }
}
