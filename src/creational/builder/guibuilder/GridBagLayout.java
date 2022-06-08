package src.creational.builder.guibuilder;

import javax.swing.*;
import java.awt.*;

public class GridBagLayout {
    private JPanel panel;

    public GridBagLayout(String[][] matrix) {
        GridBagConstraints constraints = new GridBagConstraints();
        panel = new JPanel();
        panel.setLayout(new java.awt.GridBagLayout());
        panel.setBackground(Color.BLUE);
        for (int i = 0; i < matrix.length; ++i)
            for (int j = 0; j < matrix[0].length; ++j) {
                constraints.gridx = i;
                constraints.gridy = j;
                panel.add(new Label(matrix[i][j]), constraints);
            }
    }

    public Component getPanel() {
        return panel;
    }
}
