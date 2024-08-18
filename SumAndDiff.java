import javax.swing.*;
import java.awt.event.*;
public class SumAndDiff {
    public static void main(String[] args) {
        JFrame f1 = new JFrame("sum-sub calculator");
        JLabel l1 = new JLabel("Enter first number:");
        JLabel l2 = new JLabel("Enter Second number:");
        JLabel l3 = new JLabel("Output:");
        JButton sum = new JButton("Add");
        JButton sub = new JButton("Subtract");
        JTextField t1 = new JTextField();
        JTextField t2 = new JTextField();
        JTextField t3 = new JTextField();

        f1.setSize(400, 400);
        f1.setLayout(null);
        f1.setVisible(true);

        l1.setBounds(40, 40, 200, 20);
        l2.setBounds(40, 80, 200, 20);
        l3.setBounds(40, 120, 200, 20);

        t1.setBounds(200, 40, 100, 20);
        t2.setBounds(200, 80, 100, 20);
        t3.setBounds(200, 120, 100, 20);
        sum.setBounds(200, 160, 100, 40);
        sub.setBounds(200, 210, 100, 40);

        sum.addActionListener(new ActionListener() {
            public void actionPerformed (ActionEvent ae){
                int a,b,result;
                a=Integer.parseInt(t1.getText());
                b=Integer.parseInt(t2.getText());
                result=a+b;
                t3.setText(" "+result);
            }
        });
        sub.addActionListener(new ActionListener() {
            public void actionPerformed (ActionEvent ae){
                int a,b,result;
                a=Integer.parseInt(t1.getText());
                b=Integer.parseInt(t2.getText());
                result=a-b;
                t3.setText(" "+result);
            }
        });
        f1.add(l1);
        f1.add(l2);
        f1.add(l3);
        f1.add(t1);
        f1.add(t2);
        f1.add(t3);
        f1.add(sum);
        f1.add(sub);
    }
}
