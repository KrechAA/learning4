package Swing_8HW;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class CounterApp extends JFrame {
    private int value;
    private int saveValue;
    private int pushCount = 0;

    public CounterApp(int initialValue) {
        setBounds(500, 500, 500, 240);
        setTitle("Simple Counter");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        Font font = new Font("Arial", Font.BOLD, 32);

        JLabel counterValueView = new JLabel();
        counterValueView.setFont(font);
        counterValueView.setHorizontalAlignment(SwingConstants.CENTER);
        add(counterValueView, BorderLayout.CENTER);


        value = initialValue;
        counterValueView.setText(String.valueOf(value));


        JButton saveButton = new JButton("Сохранить значение");
        saveButton.setFont(font);
        add(saveButton, BorderLayout.NORTH);

        JButton decrementButton = new JButton("<");
        decrementButton.setFont(font);
        add(decrementButton, BorderLayout.WEST);

        JButton incrementButton = new JButton(">");
        incrementButton.setFont(font);
        add(incrementButton, BorderLayout.EAST);

        JButton skipButton = new JButton("Сбросить значение");
        skipButton.setFont(font);
        add(skipButton, BorderLayout.SOUTH);


        decrementButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                value--;
                counterValueView.setText(String.valueOf(value));
            }
        });

        incrementButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                value++;
                counterValueView.setText(String.valueOf(value));
            }
        });

        skipButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                value = initialValue;
                counterValueView.setText(String.valueOf(value));
            }
        });

        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                pushCount++;
                if (pushCount % 2 != 0) {
                    saveValue = value;
                } else {
                    counterValueView.setText(String.valueOf(saveValue));
                    value = saveValue;
                }
            }


        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new CounterApp(0);
    }
}


