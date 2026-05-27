package gui;

import javax.swing.*;
import dao.UserDAO;

public class LoginFrame extends JFrame {

    JTextField user;
    JPasswordField pass;
    JButton loginBtn;

    public LoginFrame() {

        setTitle("Login System");
        setSize(300, 220);
        setLayout(null);

        JLabel u = new JLabel("Username");
        JLabel p = new JLabel("Password");

        u.setBounds(30, 30, 100, 30);
        p.setBounds(30, 70, 100, 30);

        user = new JTextField();
        pass = new JPasswordField();
        loginBtn = new JButton("Login");

        user.setBounds(120, 30, 120, 30);
        pass.setBounds(120, 70, 120, 30);
        loginBtn.setBounds(90, 130, 100, 30);

        add(u);
        add(p);
        add(user);
        add(pass);
        add(loginBtn);

        loginBtn.addActionListener(e -> {

            String username = user.getText();
            String password = new String(pass.getPassword());

            if (UserDAO.login(username, password)) {
                JOptionPane.showMessageDialog(this, "Login Successful");
                new Dashboard();
                dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Invalid Login");
            }
        });

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
}