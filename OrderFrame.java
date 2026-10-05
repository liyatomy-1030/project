
package bytebite;

import javax.swing.*;
import java.awt.*;

public class OrderFrame extends JFrame {

    private JComboBox<String> itemBox;
    private JTextField quantityField;
    private JLabel totalLabel;

    public OrderFrame() {

        setTitle("BYTEBITE - Place Order");
        setSize(550, 500);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(null);

        JLabel title = new JLabel("PLACE ORDER");
        title.setFont(new Font("Arial", Font.BOLD, 28));
        title.setBounds(180, 30, 250, 40);

        JLabel itemLabel = new JLabel("Select Food:");
        itemLabel.setBounds(80, 110, 120, 30);

        String[] items = {
                "Burger - Rs.80",
                "Pizza - Rs.120",
                "Sandwich - Rs.60",
                "French Fries - Rs.70",
                "Tea - Rs.20",
                "Coffee - Rs.30",
                "Fresh Juice - Rs.40"
        };

        itemBox = new JComboBox<>(items);
        itemBox.setBounds(200, 110, 230, 30);

        JLabel quantityLabel = new JLabel("Quantity:");
        quantityLabel.setBounds(80, 170, 120, 30);

        quantityField = new JTextField();
        quantityField.setBounds(200, 170, 230, 30);

        JButton calculateButton = new JButton("Calculate Total");
        calculateButton.setBounds(180, 230, 180, 40);

        totalLabel = new JLabel("Total: Rs. 0");
        totalLabel.setFont(new Font("Arial", Font.BOLD, 22));
        totalLabel.setBounds(200, 290, 200, 40);

        JButton orderButton = new JButton("Confirm Order");
        orderButton.setBounds(180, 360, 180, 40);

        calculateButton.addActionListener(e -> calculateTotal());

        orderButton.addActionListener(e -> confirmOrder());

        panel.add(title);
        panel.add(itemLabel);
        panel.add(itemBox);
        panel.add(quantityLabel);
        panel.add(quantityField);
        panel.add(calculateButton);
        panel.add(totalLabel);
        panel.add(orderButton);

        add(panel);

        setVisible(true);
    }

    private void calculateTotal() {

        try {

            int quantity =
                    Integer.parseInt(quantityField.getText());

            if (quantity <= 0) {

                JOptionPane.showMessageDialog(
                        this,
                        "Quantity must be greater than zero."
                );

                return;
            }

            int price = 0;

            switch (itemBox.getSelectedIndex()) {

                case 0:
                    price = 80;
                    break;

                case 1:
                    price = 120;
                    break;

                case 2:
                    price = 60;
                    break;

                case 3:
                    price = 70;
                    break;

                case 4:
                    price = 20;
                    break;

                case 5:
                    price = 30;
                    break;

                case 6:
                    price = 40;
                    break;
            }

            int total = price * quantity;

            totalLabel.setText("Total: Rs. " + total);

        } catch (NumberFormatException e) {

            JOptionPane.showMessageDialog(
                    this,
                    "Please enter a valid quantity."
            );
        }
    }

    private void confirmOrder() {

        if (quantityField.getText().isEmpty()) {

            JOptionPane.showMessageDialog(
                    this,
                    "Please enter quantity first."
            );

            return;
        }

        JOptionPane.showMessageDialog(
                this,
                "Order placed successfully!\n\n"
                        + "Food: " + itemBox.getSelectedItem()
                        + "\nQuantity: " + quantityField.getText()
                        + "\n" + totalLabel.getText()
        );
    }
}