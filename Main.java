import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Main extends JFrame {
    public Main() {
        setTitle("Simple Clock");
        setSize(400, 150);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        JButton bt = new JButton("button");
       JTextField tp= new JTextField();
        tp.setBounds(50,70,100,30);
        bt.setBounds(250,70,100,30);
        add(bt);
        add(tp);
        Clock clock = new Clock();
        add(clock);
        clock.Start();
        bt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("clicked");
            }
        });
    }

    public static void main(String[] args) {
        new Main();
    }
}