package task01;

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

        // максимальная ширина графика - 10
        // максимальная высота = 1, минимальная = -1
        // Вычисляем коэффициенты

        double Kx = getWidth() / 10.0;
        double Ky = getHeight() / 11.0;

        double xo = -1;
        double yo = -1;

        double x = 0;
        for (Iterator<Double> it = data.iterator(); it.hasNext(); ) {
            double y = it.next();

            // Рисование начинаем для второй точки
            if (xo >= 0.0) {
                int x1 = (int) ((xo + 1) * Kx);
                int x2 = (int) ((x + 1) * Kx);
                // Учитываем, что координаты идут сверху вниз и максимальное число = 1
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
