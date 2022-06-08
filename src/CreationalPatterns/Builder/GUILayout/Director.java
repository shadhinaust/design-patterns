package src.CreationalPatterns.Builder.GUILayout;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Director {
    private Layout layout;

    public Director(Layout layout) {
        this.layout = layout;
    }

    public void construct(String filename) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            String line;
            String[] cells;
            if ((line = reader.readLine()) != null) {
                cells = line.split(",");
                int width = Integer.parseInt(cells[0]);
                int height = Integer.parseInt(cells[1]);
                layout.setHeightAndWidth(height, width);
            }
            while ((line = reader.readLine()) != null) {
                cells = line.split(",");
                for (String cell : cells) layout.buildCell(cell);
                layout.startRow();
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
