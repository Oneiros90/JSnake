package jsnake;

public class Head extends Position {

    private direction dir;
    private direction nextDir;

    public enum direction {

        UP, RIGHT, DOWN, LEFT
    }

    public Head(java.awt.Point pLocation, java.awt.Color pColor, direction pDir) {
        super(pLocation, pColor);
        this.dir = pDir;
        this.nextDir = pDir;
    }

    public void setDirection(direction pDir) {
        switch (pDir) {
            case UP:
                if (this.dir != direction.DOWN) {
                    this.nextDir = pDir;
                }
                break;
            case RIGHT:
                if (this.dir != direction.LEFT) {
                    this.nextDir = pDir;
                }
                break;
            case LEFT:
                if (this.dir != direction.RIGHT) {
                    this.nextDir = pDir;
                }
                break;
            case DOWN:
                if (this.dir != direction.UP) {
                    this.nextDir = pDir;
                }
        }
    }

    public void move() {
        this.dir = this.nextDir;
        this.setLocation(this.getNextLocation());
    }

    public java.awt.Point getNextLocation() {
        switch (this.nextDir) {
            case UP:
                return new java.awt.Point(this.getLocation().x, this.getLocation().y - 1);
            case RIGHT:
                return new java.awt.Point(this.getLocation().x + 1, this.getLocation().y);
            case LEFT:
                return new java.awt.Point(this.getLocation().x - 1, this.getLocation().y);
            default:
                return new java.awt.Point(this.getLocation().x, this.getLocation().y + 1);
        }
    }
}
