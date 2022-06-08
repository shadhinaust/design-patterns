package src.CreationalPatterns.Builder.GUILayout;

import java.awt.*;

public interface Layout {
    void setHeightAndWidth(int height, int width);

    void buildCell(String value);

    void startRow();

    Component getComponent();
}
