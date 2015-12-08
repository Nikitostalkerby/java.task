package com.github.union.one.javase10.task01;

import javax.swing.*;
import java.util.Vector;

public class TG extends JFrame {
    public TG() {
        Vector<Double> vector = new Vector<>();

        // ��������� ������ ������� - �������� ��� �������
        for (int x = -50; x <= 50; x++) {
            vector.add((2.0 * Math.sin(x) * Math.pow(2.7, 4.0)) / 5);
        }

        GraphPanel graphPanel = new GraphPanel(vector);
        getContentPane().add(graphPanel);
        setBounds(640, 640, 400, 400);
    }
}
