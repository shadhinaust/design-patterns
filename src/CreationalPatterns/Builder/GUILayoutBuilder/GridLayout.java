package src.CreationalPatterns.Builder.GUILayoutBuilder;

import javax.swing.*;
import java.awt.*;

public class GridLayout {
    private JPanel panel;

    public GridLayout(String[][] matrix) {
        panel = new JPanel();
        panel.setLayout(new java.awt.GridLayout(matrix[0].length, matrix.length));
        panel.setBackground(Color.GRAY);

        for (int i = 0; i < matrix.length; ++i)
            for (int j = 0; j < matrix[0].length; ++j)
                panel.add(new Label(matrix[j][i]));
    }

    public Component getPanel() {
        return panel;
    }
}
