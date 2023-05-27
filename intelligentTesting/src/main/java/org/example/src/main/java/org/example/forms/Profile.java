package org.example.forms;

import javax.swing.*;
import java.awt.*;

public class Profile extends JFrame {

    private JPanel personalInfoPanel;
    private JPanel testResultsPanel;
    private JTable testResultsTable;
    private JButton deleteAccountButton;
    private JButton editPersonalInfoButton;

    private JButton buttonToTest;
    private JButton buttonToItogTest;

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

        buttonToTest = new JButton("Пройти тест");
        personalInfoPanel.add(buttonToTest);

        buttonToItogTest = new JButton("Пройти итоговый тест");
        personalInfoPanel.add(buttonToItogTest);

        // создание панели для результатов тестирования
        testResultsPanel = new JPanel();
        testResultsPanel.setBorder(BorderFactory.createTitledBorder("Результаты тестирования"));
        testResultsPanel.setLayout(new BoxLayout(testResultsPanel, BoxLayout.Y_AXIS));

        // создание таблицы для отображения результатов тестирования
        testResultsTable = new JTable();
        JScrollPane scrollPane = new JScrollPane(testResultsTable);
        testResultsPanel.add(scrollPane);
        personalInfoPanel.add(testResultsPanel);

        JPanel panelForAdmin = new JPanel();
        panelForAdmin.add(new JTable());

        JPanel panelForAnalyst = new JPanel();

        JTabbedPane jTabbedPane = new JTabbedPane();
        jTabbedPane.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
        jTabbedPane.add("Личная информация",personalInfoPanel);
        jTabbedPane.add("Меню администратора",panelForAdmin);
        jTabbedPane.add("Аналитика", panelForAnalyst);
        // добавление панелей на окно
        //getContentPane().add(personalInfoPanel, BorderLayout.WEST);
        //getContentPane().add(testResultsPanel, BorderLayout.CENTER);
        add(jTabbedPane);
        // отображение окна
        setVisible(true);
    }

    public static void main(String[] args) {
        Profile personalAccountUI = new Profile();
    }
}
