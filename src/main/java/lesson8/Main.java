package lesson8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class CounterApp extends JFrame {
    private int value;

    public CounterApp() {
        setBounds(500, 500, 300, 120);
        setTitle("Simple Counter");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        Font font = new Font("Arial", Font.BOLD, 32);
        JTextField jTextField=new JTextField();

        jTextField.setFont(font);
        jTextField.setHorizontalAlignment(SwingConstants.CENTER);
        add(jTextField, BorderLayout.CENTER);
        jTextField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                value = Integer.parseInt(jTextField.getText());
                jTextField.setText(String.valueOf(value));
            }
        });



        JButton decrementButton = new JButton("<");
        decrementButton.setFont(font);
        add(decrementButton, BorderLayout.WEST);

        JButton incrementButton = new JButton(">");
        incrementButton.setFont(font);
        add(incrementButton, BorderLayout.EAST);

        decrementButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                value--;
                jTextField.setText(String.valueOf(value));
            }
        });

        incrementButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                value++;
                jTextField.setText(String.valueOf(value));
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new CounterApp();
    }
}




