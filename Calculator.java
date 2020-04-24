package com.likunpeng.shiyan2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Stack;

public class Calculator {
    public void window() {
        JFrame frame = new JFrame();
        frame.setTitle("GUI计算器");
        frame.setSize(505, 640);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JTextField tf = new JTextField(50);
        tf.setSize(480, 180);
        tf.setBounds(10, 10, 480, 180);
        tf.setFont(new Font("宋体", Font.PLAIN, 50));
        tf.setEditable(false);
        JButton btn1 = new JButton("7");
        btn1.setSize(80, 80);
        btn1.setBounds(10, 210, 80, 80);
        btn1.setFont(new Font("宋体", Font.PLAIN, 50));
        JButton btn2 = new JButton("8");
        btn2.setSize(80, 80);
        btn2.setBounds(110, 210, 80, 80);
        btn2.setFont(new Font("宋体", Font.PLAIN, 50));
        JButton btn3 = new JButton("9");
        btn3.setSize(80, 80);
        btn3.setBounds(210, 210, 80, 80);
        btn3.setFont(new Font("宋体", Font.PLAIN, 50));
        JButton btn4 = new JButton("+");
        btn4.setSize(80, 80);
        btn4.setBounds(310, 210, 80, 80);
        btn4.setFont(new Font("宋体", Font.PLAIN, 50));
        JButton btn5 = new JButton("4");
        btn5.setSize(80, 80);
        btn5.setBounds(10, 310, 80, 80);
        btn5.setFont(new Font("宋体", Font.PLAIN, 50));
        JButton btn6 = new JButton("5");
        btn6.setSize(80, 80);
        btn6.setBounds(110, 310, 80, 80);
        btn6.setFont(new Font("宋体", Font.PLAIN, 50));
        JButton btn7 = new JButton("6");
        btn7.setSize(80, 80);
        btn7.setBounds(210, 310, 80, 80);
        btn7.setFont(new Font("宋体", Font.PLAIN, 50));
        JButton btn8 = new JButton("-");
        btn8.setSize(80, 80);
        btn8.setBounds(310, 310, 80, 80);
        btn8.setFont(new Font("宋体", Font.PLAIN, 50));
        JButton btn9 = new JButton("1");
        btn9.setSize(80, 80);
        btn9.setBounds(10, 410, 80, 80);
        btn9.setFont(new Font("宋体", Font.PLAIN, 50));
        JButton btn10 = new JButton("2");
        btn10.setSize(80, 80);
        btn10.setBounds(110, 410, 80, 80);
        btn10.setFont(new Font("宋体", Font.PLAIN, 50));
        JButton btn11 = new JButton("3");
        btn11.setSize(80, 80);
        btn11.setBounds(210, 410, 80, 80);
        btn11.setFont(new Font("宋体", Font.PLAIN, 50));
        JButton btn12 = new JButton("x");
        btn12.setSize(80, 80);
        btn12.setBounds(310, 410, 80, 80);
        btn12.setFont(new Font("宋体", Font.PLAIN, 50));
        JButton btn13 = new JButton("(");
        btn13.setSize(80, 80);
        btn13.setBounds(10, 510, 80, 80);
        btn13.setFont(new Font("宋体", Font.PLAIN, 50));
        JButton btn14 = new JButton("0");
        btn14.setSize(80, 80);
        btn14.setBounds(110, 510, 80, 80);
        btn14.setFont(new Font("宋体", Font.PLAIN, 50));
        JButton btn15 = new JButton(")");
        btn15.setSize(80, 80);
        btn15.setBounds(210, 510, 80, 80);
        btn15.setFont(new Font("宋体", Font.PLAIN, 50));
        JButton btn16 = new JButton("/");
        btn16.setSize(80, 80);
        btn16.setBounds(310, 510, 80, 80);
        btn16.setFont(new Font("宋体", Font.PLAIN, 50));
        JButton btn17 = new JButton("AC");
        btn17.setSize(80, 80);
        btn17.setBounds(410, 210, 80, 80);
        btn17.setFont(new Font("宋体", Font.PLAIN, 40));
        JButton btn18 = new JButton("Del");
        btn18.setSize(80, 80);
        btn18.setBounds(410, 310, 80, 80);
        btn18.setFont(new Font("宋体", Font.PLAIN, 30));
        JButton btn19 = new JButton(".");
        btn19.setSize(80, 80);
        btn19.setBounds(410, 410, 80, 80);
        btn19.setFont(new Font("宋体", Font.PLAIN, 50));
        JButton btn20 = new JButton("=");
        btn20.setSize(80, 80);
        btn20.setBounds(410, 510, 80, 80);
        btn20.setFont(new Font("宋体", Font.PLAIN, 50));
        btn1.addActionListener(new ButtonHandler(tf));
        btn2.addActionListener(new ButtonHandler(tf));
        btn3.addActionListener(new ButtonHandler(tf));
        btn4.addActionListener(new ButtonHandler(tf));
        btn5.addActionListener(new ButtonHandler(tf));
        btn6.addActionListener(new ButtonHandler(tf));
        btn7.addActionListener(new ButtonHandler(tf));
        btn8.addActionListener(new ButtonHandler(tf));
        btn9.addActionListener(new ButtonHandler(tf));
        btn10.addActionListener(new ButtonHandler(tf));
        btn11.addActionListener(new ButtonHandler(tf));
        btn12.addActionListener(new ButtonHandler(tf));
        btn13.addActionListener(new ButtonHandler(tf));
        btn14.addActionListener(new ButtonHandler(tf));
        btn15.addActionListener(new ButtonHandler(tf));
        btn16.addActionListener(new ButtonHandler(tf));
        btn17.addActionListener(new ButtonHandler(tf));
        btn18.addActionListener(new ButtonHandler(tf));
        btn19.addActionListener(new ButtonHandler(tf));
        btn20.addActionListener(new ButtonHandler(tf));
        frame.add(tf);
        frame.add(btn1);
        frame.add(btn2);
        frame.add(btn3);
        frame.add(btn4);
        frame.add(btn5);
        frame.add(btn6);
        frame.add(btn7);
        frame.add(btn8);
        frame.add(btn9);
        frame.add(btn10);
        frame.add(btn11);
        frame.add(btn12);
        frame.add(btn13);
        frame.add(btn14);
        frame.add(btn15);
        frame.add(btn16);
        frame.add(btn17);
        frame.add(btn18);
        frame.add(btn19);
        frame.add(btn20);
        frame.setVisible(true);
    }

    public static class ButtonHandler implements ActionListener {
        public JTextField tf = new JTextField();
        private Stack<Double> numberStack = null;
        private Stack<Character> symbolStack = null;
        public static boolean flag_symbol = false;
        public static boolean flag_comma = true;
        public static boolean flag_bracket = false;

        public double calculate(String numStr) {
            if (numStr.length() > 1 && !"=".equals(numStr.charAt(numStr.length() - 1) + "")) {
                numStr += "=";
            }
            numberStack = new Stack<Double>();
            symbolStack = new Stack<Character>();
            StringBuffer temp = new StringBuffer();
            for (int i = 0; i < numStr.length(); i++) {
                char ch = numStr.charAt(i);
                if (isNumber(ch)) temp.append(ch);
                else {
                    String tempStr = temp.toString();
                    if (!tempStr.isEmpty()) {
                        double num = Double.parseDouble(tempStr);
                        numberStack.push(num);
                        temp = new StringBuffer();
                    }
                    while (!comparePri(ch) && !symbolStack.empty()) {
                        double b = numberStack.pop();
                        double a = numberStack.pop();
                        switch ((char) symbolStack.pop()) {
                            case '+':
                                numberStack.push(a + b);
                                break;
                            case '-':
                                numberStack.push(a - b);
                                break;
                            case 'x':
                                numberStack.push(a * b);
                                break;
                            case '/':
                                numberStack.push(a / b);
                                break;
                            default:
                                break;
                        }
                    }
                    if (ch != '=') {
                        symbolStack.push(new Character(ch));
                        if (ch == ')') {
                            symbolStack.pop();
                            symbolStack.pop();
                        }
                    }
                }
            }
            return numberStack.pop();
        }

        private boolean isNumber(char num) {
            if (num >= '0' && num <= '9' || num == '.') return true;
            else return false;
        }

        private boolean comparePri(char symbol) {
            if (symbolStack.empty()) return true;
            char top = (char) symbolStack.peek();
            if (top == '(') return true;
            switch (symbol) {
                case '(':
                    return true;
                case 'x': {
                    if (top == '+' || top == '-') return true;
                    else return false;
                }
                case '/': {
                    if (top == '+' || top == '-') return true;
                    else return false;
                }
                case '+':
                    return false;
                case '-':
                    return false;
                case ')':
                    return false;
                case '=':
                    return false;
                default:
                    break;
            }
            return true;
        }

        ButtonHandler(JTextField tf) {
            this.tf = tf;
        }

        public void actionPerformed(ActionEvent e) {
            if (e.getActionCommand() == "7") {
                tf.setText(tf.getText() + "7");
                flag_symbol = true;
            } else if (e.getActionCommand() == "8") {
                tf.setText(tf.getText() + "8");
                flag_symbol = true;
            } else if (e.getActionCommand() == "9") {
                tf.setText(tf.getText() + "9");
                flag_symbol = true;
            } else if (e.getActionCommand() == "4") {
                tf.setText(tf.getText() + "4");
                flag_symbol = true;
            } else if (e.getActionCommand() == "5") {
                tf.setText(tf.getText() + "5");
                flag_symbol = true;
            } else if (e.getActionCommand() == "6") {
                tf.setText(tf.getText() + "6");
                flag_symbol = true;
            } else if (e.getActionCommand() == "1") {
                tf.setText(tf.getText() + "1");
                flag_symbol = true;
            } else if (e.getActionCommand() == "2") {
                tf.setText(tf.getText() + "2");
                flag_symbol = true;
            } else if (e.getActionCommand() == "3") {
                tf.setText(tf.getText() + "3");
                flag_symbol = true;
            } else if (e.getActionCommand() == "0") {
                tf.setText(tf.getText() + "0");
                flag_symbol = true;
            } else if (e.getActionCommand() == ")" && flag_bracket) {
                tf.setText(tf.getText() + ")");
                flag_bracket = false;
            } else if (e.getActionCommand() == "+" && flag_symbol) {
                tf.setText(tf.getText() + "+");
                flag_symbol = false;
                flag_comma = true;
            } else if (e.getActionCommand() == "-" && flag_symbol) {
                tf.setText(tf.getText() + "-");
                flag_symbol = false;
                flag_comma = true;
            } else if (e.getActionCommand() == "x" && flag_symbol) {
                tf.setText(tf.getText() + "x");
                flag_symbol = false;
                flag_comma = true;
            } else if (e.getActionCommand() == "/" && flag_symbol) {
                tf.setText(tf.getText() + "/");
                flag_symbol = false;
                flag_comma = true;
            } else if (e.getActionCommand() == "(" && !flag_bracket) {
                tf.setText(tf.getText() + "(");
                flag_bracket = true;
            } else if (e.getActionCommand() == "." && flag_comma) {
                tf.setText(tf.getText() + ".");
                flag_comma = false;
            } else if (e.getActionCommand() == "AC") tf.setText("");
            else if (e.getActionCommand() == "Del") {
                String str = tf.getText();
                str = str.substring(0, str.length() - 1);
                tf.setText(str);
            } else if (e.getActionCommand() == "=") {
                String str = tf.getText();
                str = str + "=";
                double result = calculate(str);
                if (result == (int) result || Math.abs(result - (int) result) < 1e-8) tf.setText((int) result + "");
                else tf.setText(result + "");
            }
        }
    }

    public static void main(String args[]) {
        Calculator window = new Calculator();
        window.window();
    }
}
