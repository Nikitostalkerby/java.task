package com.github.union.one.javase10.task01;

import javax.swing.*;
import java.awt.*;
import java.util.Iterator;
import java.util.Vector;

/**
 * Created by Vaas on 16.11.2015.
 */
class GraphPanel extends JPanel {
    private Vector<Double> data;

    public GraphPanel(Vector<Double> data) {
        this.data = data;
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // ������������ ������ ������� - 10
        // ������������ ������ = 1, ����������� = -1
        // ��������� ������������

        double Kx = getWidth() / 11.0;
        double Ky = getHeight() / 12.0;

        double xo = -1.0;
        double yo = -1.5;

        double x = 0;
        for (Iterator<Double> it = data.iterator(); it.hasNext(); ) {
            double y = it.next();

            // ��������� �������� ��� ������ �����
            if (xo >= 0.0) {
                int x1 = (int) ((xo + 1) * Kx);
                int x2 = (int) ((x + 1) * Kx);
                // ���������, ��� ���������� ���� ������ ���� � ������������ ����� = 1
                int y1 = (int) (getHeight() - (yo + 5) * Ky);
                int y2 = (int) (getHeight() - (y + 5) * Ky);
                g.drawLine(x1, y1, x2, y2);
            }
            xo = x;
            yo = y;
            x += 1;
        }
    }
}
