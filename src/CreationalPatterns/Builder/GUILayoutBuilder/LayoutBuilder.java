package src.CreationalPatterns.Builder.GUILayoutBuilder;

import javax.swing.*;
import java.awt.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Objects;

import static src.CreationalPatterns.Builder.GUILayoutBuilder.LayoutType.*;

public class LayoutBuilder {
    public void demo(String[] args) {
        String className = args.length > 0 ? args[0] : TABLE_LAYOUT.getClassName();
        String fileName = Objects.requireNonNull(getClass().getResource("./../BuilderDemo.dat")).getFile();
        String[][] matrix = readDataFile(fileName);

        Component component = null;
        switch (LayoutType.getLayoutType(className)) {
            case GRID_LAYOUT:
                component = new GridLayout(matrix).getPanel();
                break;
            case GRID_BAG_LAYOUT:
                component = new GridBagLayout(matrix).getPanel();
                break;
            case TABLE_LAYOUT:
                component = new TableLayout(matrix).getTable();
                break;
        }

        JFrame frame = new JFrame("Builder pattern - " + className);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(component);
        frame.pack();
        frame.setVisible(true);
    }

    private String[][] readDataFile(String fileName) {
        String[][] matrix = null;
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line;
            String[] cells;
            if ((line = reader.readLine()) != null) {
                cells = line.split(",");
                int width = Integer.parseInt(cells[0]);
                int height = Integer.parseInt(cells[1]);
                matrix = new String[width][height];
            }
            int row = 0;
            while ((line = reader.readLine()) != null) {
                cells = line.split(",");
                for (int i = 0; i < cells.length; ++i) {
                    assert matrix != null;
                    matrix[i][row] = cells[i];
                }
                row++;
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return matrix;
    }
}
