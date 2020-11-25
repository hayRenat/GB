package Lesson8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame implements ActionListener {
    String s0, s1, s2;
    static JTextField face = new JTextField(20);;

    Calculator() {
        s0 = s1 = s2 = "";
    }

    public static void main(String[] args) {
        JFrame window = new JFrame();
        window.setTitle("Калькулятор");
        window.setVisible(true);
        window.setBounds(100, 100, 300, 500);
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Calculator c = new Calculator();
        JPanel homePanel = new JPanel();
        homePanel.setLayout(new GridLayout(3, 2));
        JPanel center = new JPanel(new GridLayout(1, 2));
        JPanel down1 = new JPanel(new GridLayout(1, 2));
        JPanel nums = new JPanel(new GridLayout(3, 3));
        JButton[] num = new JButton[10];
        for (int i = 1; i < 10; i++) {
            num[i] = new JButton("" + i);
            nums.add(num[i]);
            num[i].addActionListener(c);
        }
        num[0] = new JButton("0");
        num[0].addActionListener(c);
        JButton equally = new JButton("=");
        equally.addActionListener(c);
        JPanel down = new JPanel(new GridLayout(1, 3));
        down.add(num[0]);
        down.add(equally);
        JPanel actions = new JPanel(new GridLayout(3, 2));
        JButton addition = new JButton("+");
        addition.addActionListener(c);
        JButton subtraction = new JButton("-");
        subtraction.addActionListener(c);
        JButton multiplication = new JButton("*");
        multiplication.addActionListener(c);
        JButton division = new JButton("/");
        division.addActionListener(c);
        JButton reset = new JButton("C");
        reset.addActionListener(c);
        JButton dot = new JButton(".");
        dot.addActionListener(c);
        actions.add(addition);
        actions.add(subtraction);
        actions.add(multiplication);
        actions.add(division);
        actions.add(reset);
        actions.add(dot);
        face.setSize(200, 200);
        face.setEditable(false);
        homePanel.add(face);
        homePanel.add(center);
        center.add(nums);
        center.add(actions);
        homePanel.add(down1, BorderLayout.SOUTH);
        down1.add(down, BorderLayout.SOUTH);
        window.add(homePanel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String s = e.getActionCommand();
        if ((s.charAt(0) >= '0' && s.charAt(0)<='9')||s.charAt(0) == '.'){
            if (!s1.equals(""))
                s2 += s;
            else s0 += s;
            face.setText(s0 + s1 + s2);
        }
        else if (s.charAt(0) == 'C'){
            s0 = s1 = s2 = "";
            face.setText(s0 + s1 + s2);
        }
        else if (s.charAt(0) == '='){
            double te;
            if (s1.equals("+"))
                te = (Double.parseDouble(s0) + Double.parseDouble(s2));
            else if (s1.equals("-"))
                te = (Double.parseDouble(s0) - Double.parseDouble(s2));
            else if (s1.equals("/"))
                te = (Double.parseDouble(s0) / Double.parseDouble(s2));
            else
                te = (Double.parseDouble(s0) * Double.parseDouble(s2));
            face.setText(s0 + s1 + s2 + "=" + te);
            s0 = Double.toString(te);
            s1 = s2 = "";
        }
        else {
           if (s1.equals("") || s2.equals(""))
        s1 = s;
           else {
               double te;
               if (s1.equals("+"))
                   te = (Double.parseDouble(s0) + Double.parseDouble(s2));
               else if (s1.equals("-"))
                   te = (Double.parseDouble(s0) - Double.parseDouble(s2));
               else if (s1.equals("/"))
                   te = (Double.parseDouble(s0) / Double.parseDouble(s2));
               else
                   te = (Double.parseDouble(s0) * Double.parseDouble(s2));
               s0 = Double.toString(te);
               s1 = s;
               s2 = "";
           }
           face.setText(s0 + s1 + s2);
        }
    }
}