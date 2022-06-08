package src.creational.builder.gui;

import javax.swing.*;
import javax.swing.table.TableModel;
import java.awt.*;

public class Table implements Layout {
    private JTable table;
    private TableModel model;
    private int width = 0, height = 0;

    @Override
    public void setHeightAndWidth(int height, int width) {
        table = new JTable(height, width);
        model = table.getModel();
    }

    @Override
    public void buildCell(String value) {
        model.setValueAt(value, height, width++);
    }

    @Override
    public void startRow() {
        width = 0;
        ++height;
    }

    @Override
    public Component getComponent() {
        return table;
    }
}
