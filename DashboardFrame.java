package bytebite;

import javax.swing.*;
import java.awt.*;

public class DashboardFrame extends JFrame {

    public DashboardFrame() {

        setTitle("BYTEBITE - Dashboard");
        setSize(700, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(null);

        JLabel title = new JLabel("BYTEBITE CANTEEN");
        title.setFont(new Font("Arial", Font.BOLD, 30));
        title.setBounds(220, 40, 300, 40);

        JButton menuButton = new JButton("View Menu");
        menuButton.setBounds(100, 140, 200, 50);

        JButton orderButton = new JButton("Place Order");
        orderButton.setBounds(400, 140, 200, 50);

        JButton paymentButton = new JButton("Payment");
        paymentButton.setBounds(250, 220, 200, 50);

        JButton exitButton = new JButton("Exit");
        exitButton.setBounds(250, 320, 200, 50);

        menuButton.addActionListener(e -> new MenuFrame());

        orderButton.addActionListener(e -> new OrderFrame());

        paymentButton.addActionListener(e -> new PaymentFrame());

        exitButton.addActionListener(e -> System.exit(0));

        panel.add(title);
        panel.add(menuButton);
        panel.add(orderButton);
        panel.add(paymentButton);
        panel.add(exitButton);

        add(panel);

        setVisible(true);
    }
}