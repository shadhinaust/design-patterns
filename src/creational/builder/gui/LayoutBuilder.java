package src.creational.builder.gui;

import javax.swing.*;
import java.awt.*;
import java.lang.reflect.InvocationTargetException;
import java.util.Objects;

import static src.creational.builder.guibuilder.LayoutType.TABLE_LAYOUT;

public class LayoutBuilder {
    public void demo(String[] args) {
        String className = args.length > 0 ? args[0] : TABLE_LAYOUT.getClassName();
        Layout layout;
        try {
            layout = (Layout) Class.forName(getClass().getPackage().getName() + "." + className).getDeclaredConstructor().newInstance();
        } catch (ClassNotFoundException | InvocationTargetException | InstantiationException | IllegalAccessException |
                 NoSuchMethodException e) {
            throw new RuntimeException(e);
        }

        String filename = Objects.requireNonNull(getClass().getResource("./../BuilderDemo.dat")).getFile();
        Director director = new Director(layout);
        director.construct(filename);
        Component component = layout.getComponent();

        JFrame frame = new JFrame("Builder pattern - " + className);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(component);
        frame.pack();
        frame.setVisible(true);
    }
}
