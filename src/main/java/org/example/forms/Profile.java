package org.example.forms;

import javax.swing.*;
import java.awt.*;

public class Profile extends JFrame {

    private JPanel personalInfoPanel;
    private JPanel testResultsPanel;
    private JTable testResultsTable;
    private JButton deleteAccountButton;
    private JButton editPersonalInfoButton;

    public Profile() {
        // настройка окна
        setTitle("Личный кабинет");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);

        // создание панели для личной информации
        personalInfoPanel = new JPanel();
        personalInfoPanel.setBorder(BorderFactory.createTitledBorder("Личная информация"));
        personalInfoPanel.setLayout(new BoxLayout(personalInfoPanel, BoxLayout.Y_AXIS));

        // добавление элементов на панель личной информации
        personalInfoPanel.add(new JLabel("Имя:"));
        personalInfoPanel.add(new JTextField());
        personalInfoPanel.add(new JLabel("Фамилия:"));
        personalInfoPanel.add(new JTextField());
        personalInfoPanel.add(new JLabel("Отчество"));
        personalInfoPanel.add(new JTextField());
        personalInfoPanel.add(new JLabel("Email:"));
        personalInfoPanel.add(new JTextField());

        // добавление кнопки для редактирования личной информации
        editPersonalInfoButton = new JButton("Редактировать");
        personalInfoPanel.add(editPersonalInfoButton);

        // добавление кнопки для удаления аккаунта
        deleteAccountButton = new JButton("Удалить аккаунт");
        personalInfoPanel.add(deleteAccountButton);

        // создание панели для результатов тестирования
        testResultsPanel = new JPanel();
        testResultsPanel.setBorder(BorderFactory.createTitledBorder("Результаты тестирования"));
        testResultsPanel.setLayout(new BoxLayout(testResultsPanel, BoxLayout.Y_AXIS));

        // создание таблицы для отображения результатов тестирования
        testResultsTable = new JTable();
        JScrollPane scrollPane = new JScrollPane(testResultsTable);
        testResultsPanel.add(scrollPane);

        // добавление панелей на окно
        getContentPane().add(personalInfoPanel, BorderLayout.WEST);
        getContentPane().add(testResultsPanel, BorderLayout.CENTER);

        // отображение окна
        setVisible(true);
    }

    public static void main(String[] args) {
        Profile personalAccountUI = new Profile();
    }
}
