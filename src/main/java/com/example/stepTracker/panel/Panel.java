package com.example.stepTracker.panel;

import javax.swing.*;

public class Panel {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Step Tracker");
        JLabel b1;
        b1 = new JLabel("edureka");
        b1.setBounds(40,40,90,20);
        frame.add(b1);
        frame.setSize(400,400);
        frame.setLayout(null);
        frame.setVisible(true);
    }


}