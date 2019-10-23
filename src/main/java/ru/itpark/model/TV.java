package ru.itpark.model;

public class TV extends Product {
    private int diagonalInCm;
    private Color color;
    private DigitalTelevisionStandard digitalTelevisionStandard;

    public TV(long id, String name, int price, int diagonalInCm, Color color, DigitalTelevisionStandard digitalTelevisionStandard) {
        super(id, name, price);
        this.diagonalInCm = diagonalInCm;
        this.color = color;
        this.digitalTelevisionStandard = digitalTelevisionStandard;
    }

    public enum Color {
        BLACK,
        WHITE,
        OTHER
    }

    public enum DigitalTelevisionStandard {
        DVB_T,
        DVB_C,
        DVB_S,
        DVB_S2,
        DVB_T2
    }

    public int getDiagonalInCm() {
        return diagonalInCm;
    }

    public void setDiagonalInCm(int diagonalInCm) {
        this.diagonalInCm = diagonalInCm;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public DigitalTelevisionStandard getDigitalTelevisionStandard() {
        return digitalTelevisionStandard;
    }

    public void setDigitalTelevisionStandard(DigitalTelevisionStandard digitalTelevisionStandard) {
        this.digitalTelevisionStandard = digitalTelevisionStandard;
    }
}
