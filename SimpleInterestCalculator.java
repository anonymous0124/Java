import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleInterestCalculator {

    public static void main(String[] args) {
        // Create a new frame
        JFrame frame = new JFrame("Simple Interest Calculator");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // Create labels and text fields
        JLabel principalLabel = new JLabel("Principal:");
        principalLabel.setBounds(20, 20, 100, 30);
        frame.add(principalLabel);

        JTextField principalField = new JTextField();
        principalField.setBounds(150, 20, 200, 30);
        frame.add(principalField);

        JLabel rateLabel = new JLabel("Rate of Interest (%):");
        rateLabel.setBounds(20, 70, 150, 30);
        frame.add(rateLabel);

        JTextField rateField = new JTextField();
        rateField.setBounds(150, 70, 200, 30);
        frame.add(rateField);

        JLabel timeLabel = new JLabel("Time (years):");
        timeLabel.setBounds(20, 120, 100, 30);
        frame.add(timeLabel);

        JTextField timeField = new JTextField();
        timeField.setBounds(150, 120, 200, 30);
        frame.add(timeField);

        JButton calculateButton = new JButton("Calculate SI");
        calculateButton.setBounds(150, 170, 150, 30);
        frame.add(calculateButton);

        JLabel resultLabel = new JLabel("Simple Interest:");
        resultLabel.setBounds(20, 220, 150, 30);
        frame.add(resultLabel);

        JLabel resultValue = new JLabel("");
        resultValue.setBounds(150, 220, 200, 30);
        frame.add(resultValue);

        // Add action listener to the button
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double principal = Double.parseDouble(principalField.getText());
                    double rate = Double.parseDouble(rateField.getText());
                    double time = Double.parseDouble(timeField.getText());
                    
                    double simpleInterest = (principal * rate * time) / 100;
                    resultValue.setText(String.format("%.2f", simpleInterest));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Please enter valid numbers.");
                }
            }
        });

        // Set frame visibility
        frame.setVisible(true);
    }
}
