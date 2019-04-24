package Lesson_8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWindow extends JFrame {

    private static int Win_Height = 500;
    private static int Win_Width = 450;
    private static int Pos_X = 600;
    private static int Pos_Y = 300;

    private static Settings SettingsWindow;
    private static Map GameField;

    public MainWindow(){
        setTitle("Крестики vs. Нолики");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(Pos_X, Pos_Y, Win_Width, Win_Height);
        setVisible(true);
        setResizable(false);

        JButton StartNewGameButton = new JButton("Начать новую игру");
        JButton ExitButton = new JButton("Выход");
        JPanel jPanel = new JPanel(new GridLayout(1,2));

        add(jPanel, BorderLayout.SOUTH);
        jPanel.add(StartNewGameButton);
        jPanel.add(ExitButton);

        SettingsWindow = new Settings(this);
        GameField = new Map();
//        add(GameField, BorderLayout.CENTER);

        ExitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        StartNewGameButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SettingsWindow.setVisible(true);
            }
        });
    }
}
