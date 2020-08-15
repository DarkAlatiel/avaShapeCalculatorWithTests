package model;

// геометрическая фигура
public abstract class ShapeBase {

    protected ShapeBase(String name) {
        this.name = name;
    }

    // название фигуры
    private String name;

    public String getName() {
        return name;
    }
}
