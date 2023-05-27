package org.example.forms;


import javax.swing.*;

public class TestGUI extends JFrame {
    private JLabel questionLabel;
    private JRadioButton[] answerButtons;
    private JButton nextButton;
    private ButtonGroup buttonGroup;
    private int currentQuestion = 0;
    private String[] questions = {"Вопрос 1", "Вопрос 2", "Вопрос 3", "Вопрос 4", "Вопрос 5"};
    private String[][] answers = {
            {"Ответ 1.1", "Ответ 1.2", "Ответ 1.3", "Ответ 1.4", "Ответ 1.5"},
            {"Ответ 2.1", "Ответ 2.2", "Ответ 2.3", "Ответ 2.4", "Ответ 2.5"},
            {"Ответ 3.1", "Ответ 3.2", "Ответ 3.3", "Ответ 3.4", "Ответ 3.5"},
            {"Ответ 4.1", "Ответ 4.2", "Ответ 4.3", "Ответ 4.4", "Ответ 4.5"},
            {"Ответ 5.1", "Ответ 5.2", "Ответ 5.3", "Ответ 5.4", "Ответ 5.5"}
    };

    public TestGUI() {
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));

        questionLabel = new JLabel(questions[currentQuestion]);
        panel.add(questionLabel);

        answerButtons = new JRadioButton[answers[currentQuestion].length];
        buttonGroup = new ButtonGroup();
        for (int i = 0; i < answerButtons.length; i++) {
            answerButtons[i] = new JRadioButton(answers[currentQuestion][i]);
            buttonGroup.add(answerButtons[i]);
            panel.add(answerButtons[i]);
        }

        nextButton = new JButton("Ответить");
        nextButton.addActionListener(e -> {
            // Обработка ответа
            currentQuestion++;
            if (currentQuestion < questions.length) {
                questionLabel.setText(questions[currentQuestion]);
                for (int i = 0; i < answerButtons.length; i++) {
                    answerButtons[i].setText(answers[currentQuestion][i]);
                    answerButtons[i].setSelected(false);
                }
            } else {
                // Закончились вопросы
                JOptionPane.showMessageDialog(this, "Тест завершен");
                dispose();
            }
        });
        panel.add(nextButton);

        add(panel);
        setVisible(true);
    }

    public static void main(String[] args) {
        new TestGUI();
    }
}