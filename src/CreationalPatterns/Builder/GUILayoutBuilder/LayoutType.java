package src.CreationalPatterns.Builder.GUILayoutBuilder;

public enum LayoutType {
    GRID_LAYOUT("Grid"), GRID_BAG_LAYOUT("GridBag"), TABLE_LAYOUT("Table");

    private String className;

    LayoutType(String className) {
        this.className = className;
    }

    public String getClassName() {
        return className;
    }

    public static LayoutType getLayoutType(String className) {
        switch (className) {
            case "GridLayout":
                return GRID_LAYOUT;
            case "GridBagLayout":
                return GRID_BAG_LAYOUT;
            case "TableLayout":
                return TABLE_LAYOUT;
        }
        return TABLE_LAYOUT;
    }
}
