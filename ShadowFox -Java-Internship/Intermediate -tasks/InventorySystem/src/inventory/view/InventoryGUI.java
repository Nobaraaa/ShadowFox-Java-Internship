package inventory.view;

import inventory.controller.InventoryController;
import inventory.model.Product;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;

public class InventoryGUI extends JFrame {
    private InventoryController controller;
    private JTable table;
    private DefaultTableModel tableModel;

    public InventoryGUI(InventoryController controller) {
        this.controller = controller;
        setTitle("Inventory Management");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Table setup
        tableModel = new DefaultTableModel(new String[]{"Name", "Barcode", "Price", "Quantity"}, 0);
        table = new JTable(tableModel);
        add(new JScrollPane(table), BorderLayout.CENTER);

        // Form
        JPanel form = new JPanel(new GridLayout(5, 2));
        JTextField nameField = new JTextField();
        JTextField barcodeField = new JTextField();
        JTextField priceField = new JTextField();
        JTextField quantityField = new JTextField();
        JButton addButton = new JButton("Add Product");
        JButton totalButton = new JButton("Total Stock Value");

        form.add(new JLabel("Name:"));
        form.add(nameField);
        form.add(new JLabel("Barcode:"));
        form.add(barcodeField);
        form.add(new JLabel("Price:"));
        form.add(priceField);
        form.add(new JLabel("Quantity:"));
        form.add(quantityField);
        form.add(addButton);
        form.add(totalButton);

        add(form, BorderLayout.SOUTH);

        // Button Actions
        addButton.addActionListener((ActionEvent e) -> {
            String name = nameField.getText();
            String barcode = barcodeField.getText();
            double price = Double.parseDouble(priceField.getText());
            int quantity = Integer.parseInt(quantityField.getText());

            Product p = new Product(name, barcode, price, quantity);
            controller.addProduct(p);
            tableModel.addRow(new Object[]{name, barcode, price, quantity});

            nameField.setText("");
            barcodeField.setText("");
            priceField.setText("");
            quantityField.setText("");
        });

        totalButton.addActionListener((ActionEvent e) -> {
            double total = controller.getTotalStockValue();
            JOptionPane.showMessageDialog(this, "Total Stock Value: " + total);
        });

        setVisible(true);
    }
}