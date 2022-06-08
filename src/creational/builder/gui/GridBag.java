package src.creational.builder.gui;

import javax.swing.*;
import java.awt.*;

public class GridBag implements Layout {
    private JPanel panel;
    private GridBagConstraints constraints = new GridBagConstraints();
    private int height = 0, width = 0;

    @Override
    public void setHeightAndWidth(int height, int width) {
        panel = new JPanel(new GridBagLayout());
        panel.setBackground(Color.GRAY);
    }

    @Override
    public void buildCell(String value) {
        constraints.gridx = width++;
        constraints.gridy = height;
        panel.add(new Label(value));
    }

    @Override
    public Component getComponent() {
        return panel;
    }

    public void startRow() {
        width = 0;
        ++height;
    }
}
