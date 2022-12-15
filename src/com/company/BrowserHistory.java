package com.company;

import javax.swing.*;
import java.util.ArrayDeque;
import java.util.Deque;

public class BrowserHistory extends JFrame {
    private final String[] urls = {" google.com ", " youtube.com ", " facebook.com ", " github.com ", " wikipedia.org ", " yahoo.com ", " gmail.com ", " yandex.ru ", " javarush.ru ", " instagram.com "};
    private Deque<String> history = new ArrayDeque<>();

    BrowserHistory() {
        setVisible(true);
        setTitle("Browser History");
        setSize(600, 400);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        DefaultListModel<String> model = new DefaultListModel<>();
        JList<String> list = new JList<String>(model);

        for (int i = 0; i < urls.length; i++) {
            JButton button = new JButton();
            button.setText(urls[i]);
            button.setBounds(10, 20 + i * 30, 200, 25);
            add(button);
            setLayout(null);
        }
    }

    public static void main(String[] args) {
        BrowserHistory main = new BrowserHistory();
        main.setVisible(true);
    }
}
