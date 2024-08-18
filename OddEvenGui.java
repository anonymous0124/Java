import javax.swing.*;
import java.awt.event.*;
public class OddEvenGui {
    public static void main(String[]args){
        JFrame f = new JFrame("EvenOdd Calculator");
        JLabel l1 = new JLabel("Enter Number:");
        JTextField t1 = new JTextField();
        JTextField t2 = new JTextField();
        JButton cal = new JButton("Calculate");

        f.setLayout(null);
        f.setVisible(true);
        f.setSize(400,400);

        l1.setBounds(50,40,80,30);

        t1.setBounds(150,40,80,30);
        t2.setBounds(150,80,80,30);
        cal.setBounds(150,120,150,30);

        cal.addActionListener( new ActionListener(){
            public void actionPerformed( ActionEvent ae){
                int num;
                String Result;
                num = Integer.parseInt(t1.getText());
                Result = (num % 2 ==0 ) ?  "even" : " odd ";
                t2.setText(" "+Result); 
            }
        });
        f.add(l1);
        f.add(cal);
        f.add(t1);
        f.add(t2);
    }
}
