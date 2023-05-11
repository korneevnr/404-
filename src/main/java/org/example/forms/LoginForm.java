package org.example.forms;

import javax.swing.*;

public class LoginForm {
    private JTextField loginField;
    private JPasswordField passwordField;
    private JButton singIn;



    public LoginForm(){
        JFrame frame = new JFrame();
        frame.setTitle("Логин");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200,200);

        loginField = new JTextField();
        passwordField = new JPasswordField();
        singIn = new JButton("Войти");

        JPanel panelLogin = new JPanel();
        panelLogin.setLayout(new BoxLayout(panelLogin, BoxLayout.Y_AXIS));

        panelLogin.add(new JLabel("Логин"));
        panelLogin.add(loginField);

        panelLogin.add(new JLabel("Пароль"));
        panelLogin.add(passwordField);

        panelLogin.add(singIn);

        frame.add(panelLogin);

        singIn.addActionListener(e -> {
            // логика для входа в систему
        });

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new LoginForm();
    }
}
