
import Domen.Product;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import javax.swing.*;

public class MainFrame extends JFrame {


    final public Font mainFont = new Font("Segoe print", Font.BOLD, 18);
    JTextField tfProductName;


    JLabel buyApprovement;

    public void initialize(List<Product> list) {

        JLabel lbBoxList = new JLabel("Products list", SwingConstants.CENTER);
        lbBoxList.setFont(mainFont);
        JLabel lbChooseProduct = new JLabel("Choose product");
        lbChooseProduct.setFont(mainFont);
        JTextField tfMonyeInput = new JTextField();
        lbBoxList.setFont(mainFont);
        JLabel blank = new JLabel("");

        JPanel formPanel = new JPanel();
        formPanel.setLayout(new GridLayout(50, 1, 25, 5));
        formPanel.add(lbBoxList);
        formPanel.add(blank);
        String[] productsList = new String[list.size()];

        //вывод всех товаров
        for (Product product : list) {
            JLabel lbProductNames = new JLabel(product.getProductName() + " " + product.getPrice() + " ₽", SwingConstants.LEADING);
            lbProductNames.setFont(mainFont);
            formPanel.add(lbProductNames);
        }



        for (int i = 0; i < list.size(); i++) {
            productsList[i] = list.get(i).getProductName();
        }

        JComboBox<String> popUpList = new JComboBox<>(productsList);



        formPanel.add(blank);
        formPanel.add(lbChooseProduct);
        formPanel.add(popUpList);

        JLabel lbChoice = new JLabel();
        lbChoice.setFont(mainFont);
        formPanel.add(lbChoice);
        popUpList.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String productBuy = (String) popUpList.getSelectedItem();
                Double productPrice = 0.0;
                for (Product product : list) {
                    if (Objects.equals(productBuy, product.getProductName())) productPrice = product.getPrice();
                    lbChoice.setText("Selected product - " + productBuy + ", please deposit " + productPrice + " ₽");
                }
            }
        });


        JLabel lbProductName = new JLabel("Product name");
        lbProductName.setFont(mainFont);


        formPanel.add(tfMonyeInput);
        tfProductName = new JTextField();
        tfProductName.setFont(mainFont);


        buyApprovement = new JLabel();
        buyApprovement.setFont(mainFont);


        JButton btnOk = new JButton("Buy product");
        btnOk.setFont(mainFont);
        btnOk.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                Double byuersMoney = Double.parseDouble(tfMonyeInput.getText());
                Map<String, Double> prices = HashMap.newHashMap(list.size());
                for (Product product : list) {
                    prices.put(product.getProductName(), product.getPrice());
                }
                String selectedProduct = (String) popUpList.getSelectedItem();
                if (Objects.equals(prices.get(selectedProduct), byuersMoney)) {
                    buyApprovement.setText("Success! Thank you!");
                } else if (prices.get(selectedProduct) > byuersMoney) {
                    buyApprovement.setText("Not enough money, try again");
                } else {
                    double change = byuersMoney - prices.get(selectedProduct);
                    buyApprovement.setText("Success! Please don't forget your change " + change + " ₽");
                }

            }

        });


        JButton btnCancel = new JButton("Cancel");
        btnCancel.setFont(mainFont);
        btnCancel.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                tfProductName.setText("");
                tfProductName.setText("");
                buyApprovement.setText("");
                lbChoice.setText("");

            }

        });


        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(1, 2, 5, 5));
        buttonPanel.add(btnOk);
        buttonPanel.add(btnCancel);


        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.setBackground(new Color(128, 128, 255));

        mainPanel.add(formPanel, BorderLayout.NORTH);


        mainPanel.add(buyApprovement, BorderLayout.CENTER);


        mainPanel.add(buttonPanel, BorderLayout.SOUTH);


        add(mainPanel);


        mainPanel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        formPanel.setOpaque(false);
        buttonPanel.setOpaque(false);


        setTitle("VendingMachines");
        setSize(700, 600);
        setMaximumSize(new Dimension(300, 400));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

}