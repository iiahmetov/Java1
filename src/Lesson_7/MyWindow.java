package Lesson_7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyWindow extends JFrame {

    public MyWindow(){

        setTitle ("Персональные данные");
        setBounds(700, 300, 400, 400);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible (true);
        setResizable(true);

        JButton btn1 = new JButton("Задать");
        JTextArea jta = new JTextArea();

        add(jta, BorderLayout.CENTER);
        add(btn1, BorderLayout.SOUTH);
        jta.setEditable(false);

        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new InnerWindow(this);
            }
        });
    }
}

class InnerWindow extends JFrame {

    public InnerWindow(MyWindow window) {

        setTitle("Введите персональные данные");
        setBounds(800, 400, 400, 400);
        setVisible(true);
        setResizable(true);
        JPanel jp = new JPanel(new GridLayout(3, 2));

        JTextField jtf1 = new JTextField();
        JTextField jtf1_1 = new JTextField();
        JTextField jtf2 = new JTextField();
        JTextField jtf2_1 = new JTextField();
        JTextField jtf3 = new JTextField();
        JTextField jtf3_1 = new JTextField();

        JButton btn1 = new JButton("Ok");
        jtf1.setText("Фамилия:");
        jtf1.setEditable(false);
        jtf2.setText("Имя:");
        jtf2.setEditable(false);
        jtf3.setText("Отчество:");
        jtf3.setEditable(false);
        add(btn1, BorderLayout.SOUTH);
        add(jp, BorderLayout.NORTH);
        jp.add(jtf1);
        jp.add(jtf1_1);
        jp.add(jtf2);
        jp.add(jtf2_1);
        jp.add(jtf3);
        jp.add(jtf3_1);
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
}

class MainClassWindow {
    public static void main(String[] args) {
        new MyWindow();
    }
}