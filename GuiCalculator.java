import javax.swing.*;
import java.awt.event.*;
public class GuiCalculator {
    public static void main(String[] args){
        JFrame f1 = new JFrame("SimpleInterest");
        JLabel l1 = new JLabel("Principle");
        JLabel l2 = new JLabel("Time");
        JLabel l3 = new JLabel("Rate");
        JLabel l4 = new JLabel("Result");
        JTextField t1 = new JTextField();
        JTextField t2 = new JTextField();
        JTextField t3 = new JTextField();
        JTextField t4 = new JTextField();
        JButton cal = new JButton("Calculate");

        f1.setSize(400,400);
        f1.setLayout(null);
        f1.setVisible(true);
        l1.setBounds(20, 50, 60, 40);
        l2.setBounds(20, 100, 60, 40);
        l3.setBounds(20, 150, 60, 40);
        l4.setBounds(20, 200, 60, 40);


        t1.setBounds(100, 50, 60, 40);
        t2.setBounds(100, 100, 60, 40);
        t3.setBounds(100, 150, 60, 40);
        t4.setBounds(100, 200, 60, 40);
        cal.setBounds(50,250,100,40);

        cal.addActionListener(new ActionListener() {
            public void actionPerformed( ActionEvent ae){
                int p,t,r,i;
                p = Integer.parseInt(t1.getText());
                t = Integer.parseInt(t2.getText());
                r = Integer.parseInt(t3.getText());
                i = p*t*r/100;
                t4.setText(""+i);
            }
        });
        f1.add(l1);
        f1.add(l2);
        f1.add(l3);
        f1.add(l4);
        f1.add(t1);
        f1.add(t2);
        f1.add(t3);
        f1.add(t4);
        f1.add(cal);
    }
}
