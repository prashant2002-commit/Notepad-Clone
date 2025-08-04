package notepad_;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class about extends JFrame implements ActionListener {

    about(){
        setTitle("About Notepad");
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/Windows_11_logo.png"));
        Image i2 = i1.getImage().getScaledInstance(250,60, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel headerIcon = new JLabel(i3);
        headerIcon.setBounds(65,40,350,75);
        add(headerIcon);

        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("icon/icon.png"));
        Image i5 = i4.getImage().getScaledInstance(65,65, Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel Icon = new JLabel(i6);
        Icon.setBounds(45,160,65,65);
        add(Icon);

        JLabel text = new JLabel("<html>Code with prashant<br>Windows Notepad 11.2410.20.0<br>@Prashant. All rights reserved<br><br><br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; project by:- Prashant kumar</html>");
        text.setBounds(120,70,500,300);
        text.setFont(new Font("SAN_SERIF",Font.BOLD,17));
        add(text);

        JButton ok = new JButton("OK");
        ok.setBounds(180,400,100,25);
        ok.addActionListener(this);
        add(ok);

        setBounds(500,150,500,500);
        setResizable(false);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent ae){
        setVisible(false);
    }

    public static void main(String[] args) {
        new about();
    }
}
