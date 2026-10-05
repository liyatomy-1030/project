package bytebite;

import javax.swing.*;
import java.awt.*;

public class PaymentFrame extends JFrame {

    public PaymentFrame() {

        setTitle("BYTEBITE - Payment");
        setSize(500, 400);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(null);

        JLabel title = new JLabel("PAYMENT");
        title.setFont(new Font("Arial", Font.BOLD, 28));
        title.setBounds(190, 40, 200, 40);

        JLabel amountLabel = new JLabel("Amount:");
        amountLabel.setBounds(80, 120, 100, 30);

        JTextField amountField = new JTextField();
        amountField.setBounds(190, 120, 220, 30);

        JLabel methodLabel = new JLabel("Payment Method:");
        methodLabel.setBounds(80, 180, 120, 30);

        String[] methods = {
                "Cash",
                "UPI",
                "Debit Card",
                "Credit Card"
        };

        JComboBox<String> methodBox =
                new JComboBox<>(methods);

        methodBox.setBounds(210, 180, 200, 30);

        JButton payButton = new JButton("Pay Now");
        payButton.setBounds(180, 250, 140, 40);

        payButton.addActionListener(e -> {

            if (amountField.getText().isEmpty()) {

                JOptionPane.showMessageDialog(
                        this,
                        "Please enter amount."
                );

                return;
            }

            JOptionPane.showMessageDialog(
                    this,
                    "Payment Successful!\n"
                            + "Amount: Rs. "
                            + amountField.getText()
                            + "\nMethod: "
                            + methodBox.getSelectedItem()
            );
        });

        panel.add(title);
        panel.add(amountLabel);
        panel.add(amountField);
        panel.add(methodLabel);
        panel.add(methodBox);
        panel.add(payButton);

        add(panel);

        setVisible(true);
    }
}
