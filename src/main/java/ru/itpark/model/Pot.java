package ru.itpark.model;

public class Pot extends Product {
    private Color color;

    public Pot(long id, String name, int price, Color color) {
        super(id, name, price);
        this.color = color;
    }

    public enum Color {
        WHITE,
        BLACK,
        RED,
        GREEN,
        YELLOW,
        PURPLE,
        PINK,
        BLUE,
        CYAN,
        MAGENTA,
        OTHER
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
