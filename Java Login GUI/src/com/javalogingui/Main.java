package com.javalogingui;

import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main implements ActionListener {

    private static JLabel  userlabel ;
    private static JTextField userText;
    private static JLabel  passwordLabel;
    private static JPasswordField passwordText;
    private static JButton  button;
    private static JLabel  success;

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        frame.setSize(350,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);

        panel.setLayout(null);

        // username

        userlabel = new JLabel("User");
        userlabel.setBounds(10,20,80,25);
        panel.add(userlabel);

        userText = new JTextField(20);
        userText.setBounds(100,20,165,25);
        panel.add(userText);

        // password

        passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(10,50,80,25);
        panel.add(passwordLabel);

        passwordText = new JPasswordField(20);
        passwordText.setBounds(100,50,165,25);
        panel.add(passwordText);

        // button

        button = new JButton("Login");
        button.setBounds(10,80,80,25);
        button.addActionListener(new Main());
        panel.add(button);

        // Success

        success = new JLabel("");
        success.setBounds(10,110,300,25);
        panel.add(success);


        frame.setVisible(true);

    }

    // this code runs when we click the button
    @Override
    public void actionPerformed(ActionEvent e) {
        // just printing to check if it works
        // System.out.println("Clicked");

        // Printing the name and password
        String user = userText.getText();
        String password = passwordText.getText();

        System.out.println(user + "," + password);

        if (user.equals("Batman") && password.equals("Jokerisbad")){
            success.setText("Login Successful");
        } else {
            success.setText("");
        }
    }

}
