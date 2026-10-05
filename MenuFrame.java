
package bytebite;

import javax.swing.*;
import java.awt.*;

public class MenuFrame extends JFrame {

    public MenuFrame() {

        setTitle("BYTEBITE - Food Menu");
        setSize(600, 500);
        setLocationRelativeTo(null);

        JLabel title = new JLabel(
                "FOOD MENU",
                SwingConstants.CENTER
        );

        title.setFont(new Font("Arial", Font.BOLD, 28));

        String[] columns = {
                "Food Item",
                "Category",
                "Price"
        };

        Object[][] data = {
                {"Burger", "Fast Food", "Rs. 80"},
                {"Pizza", "Fast Food", "Rs. 120"},
                {"Sandwich", "Snacks", "Rs. 60"},
                {"French Fries", "Snacks", "Rs. 70"},
                {"Tea", "Beverage", "Rs. 20"},
                {"Coffee", "Beverage", "Rs. 30"},
                {"Fresh Juice", "Beverage", "Rs. 40"}
        };

        JTable table = new JTable(data, columns);

        JScrollPane scrollPane = new JScrollPane(table);

        add(title, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);

        setVisible(true);
    }
}