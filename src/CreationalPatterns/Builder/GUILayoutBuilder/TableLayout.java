package src.CreationalPatterns.Builder.GUILayoutBuilder;

import javax.swing.*;
import javax.swing.table.TableModel;
import java.awt.*;

public class TableLayout {
    private JTable table;

    public TableLayout(String[][] matrix) {
        table = new JTable(matrix[0].length, matrix.length);
        TableModel model = table.getModel();
        for (int i = 0; i < matrix.length; ++i)
            for (int j = 0; j < matrix[i].length; ++j)
                model.setValueAt(matrix[i][j], j, i);
    }

    public Component getTable() {
        return table;
    }
}
