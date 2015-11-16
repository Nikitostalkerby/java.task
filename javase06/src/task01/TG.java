package task01;

import javax.swing.*;
import java.util.Vector;

public class TG extends JFrame {
    public TG() {
        Vector<Double> vector = new Vector<>();

        // Заполняем вектор данными - например для функции
        for (int x = -50; x <= 50; x++) {
            vector.add((2.0 * Math.sin(x) * Math.pow(2.7, 4.0)) / 5);
        }

        GraphPanel graphPanel = new GraphPanel(vector);
        getContentPane().add(graphPanel);
        setBounds(100, 100, 300, 300);
    }
}
