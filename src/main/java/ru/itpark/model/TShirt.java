package ru.itpark.model;

public class TShirt extends Product {
    private int size;
    private Color color;
    private Material material;

    public TShirt(long id, String name, int price, int size, Color color, Material material) {
        super(id, name, price);
        this.size = size;
        this.color = color;
        this.material = material;
    }

    public enum Color {
        WHITE,
        BLACK,
        RED,
        YELLOW,
        OTHER
    }

    public enum Material {
        POLYESTER,
        COTTON,
        VISCOSE,
        OTHER
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }
}
