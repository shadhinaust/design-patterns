package src.creational.builder.gui;

import javax.swing.*;
import java.awt.*;

public class Grid implements Layout {
    private JPanel panel;

    @Override
    public void setHeightAndWidth(int height, int width) {
        panel = new JPanel(new GridLayout(height, width));
        panel.setBackground(Color.GRAY);
    }

    @Override
    public void buildCell(String value) {
        panel.add(new Label(value));
    }

    @Override
    public Component getComponent() {
        return panel;
    }

    public void startRow() {

    }
}
