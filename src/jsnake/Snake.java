package jsnake;

import java.util.ArrayList;

public class Snake {

    private java.util.ArrayList<Position> body;
    private java.awt.Point firstPosition;
    public java.awt.Color color;

    public Snake(java.awt.Point pLocation, java.awt.Color pColor, Head.direction pDirection) {
        this.body = new ArrayList<Position>();
        this.body.add(new Head(pLocation, pColor, pDirection));
        this.firstPosition = pLocation;
        this.color = pColor;
    }

    public void move() {
        //Sposto ogni quadratino costituente il corpo nella posizione di quello precedente, così da simulare il movimento
        for (int i = this.body.size() - 1; i >= 1; i--) {
            this.body.get(i).setLocation(this.body.get(i - 1).getLocation());
        }
        head().move();
    }

    public void eat() {
        this.body.add(new Position(this.body.get(this.body.size() - 1).getLocation(), this.color));
    }

    public void setDirection(Head.direction pDir) {
        this.head().setDirection(pDir);
    }

    public Head head() {
        return (Head) this.body.get(0);
    }

    public Position tail() {
        return this.body.get(this.body.size() - 1);
    }

    public boolean thereIsBody(java.awt.Point pPoint) {
        //Verifico se in pPoint c'è il corpo del serpente
        for (int i = 1; i < this.body.size(); i++) {
            if (pPoint.equals(this.body.get(i).getLocation())) {
                return true;
            }
        }
        return false;
    }

    public boolean eatItself() {
        return this.thereIsBody(this.head().getLocation());
    }

    public void reset() {
        while (this.body.size() > 1) {
            Position tail = this.tail();
            this.body.remove(tail);
            tail = null;
        }
        this.head().setLocation(this.firstPosition);
        System.gc();
    }
}
