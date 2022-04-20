package com.company.lesson8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Window extends JFrame {

    private int counter = 0;

    public Window() {
        setTitle("Counter");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println("Окно закрывается");
            }
        });

        setLayout(new GridLayout(2, 3));
        setBounds(500, 500, 500, 200);
        Font font = new Font("Arial", Font.BOLD, 30);

        JLabel counterView = new JLabel(String.valueOf(counter));
        counterView.setHorizontalAlignment(SwingConstants.CENTER);
        counterView.setFont(font);

        JButton decrementButton = new JButton("<");
        add(decrementButton);
        decrementButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                counter--;
                counterView.setText(String.valueOf(counter));
            }
        });

        add(counterView);

        JButton incrementButton = new JButton(">");
        add(incrementButton);
        incrementButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                counter++;
                counterView.setText(String.valueOf(counter));
            }
        });

        JButton minusTenButton = new JButton("-10");
        add(minusTenButton);
        minusTenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                counter -= 10;
                counterView.setText(String.valueOf(counter));
            }
        });

        JButton zeroButton = new JButton("Сбросить счетчик");
        add(zeroButton);
        zeroButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                counter = 0;
                counterView.setText(String.valueOf(counter));
            }
        });

        JButton plusTenButton = new JButton("+10");
        add(plusTenButton);
        plusTenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                counter += 10;
                counterView.setText(String.valueOf(counter));
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new Window();
    }
}