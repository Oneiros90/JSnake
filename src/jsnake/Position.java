package jsnake;

public class Position extends java.awt.Point{

    protected java.awt.Color color;

    public Position(java.awt.Color pColor) {
        this.color = pColor;
    }

    public Position(int pX, int pY, java.awt.Color pColor) {
        this(pColor);
        this.setLocation(pX, pY);
    }

    public Position(java.awt.Point pPoint, java.awt.Color pColor) {
        this(pColor);
        this.setLocation(pPoint);
    }

    public java.awt.Color getColor(){
        return this.color;
    }
}
