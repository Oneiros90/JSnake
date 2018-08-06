/**
 * @author Lorenzo Valente (Oneiros) - https://code.google.com/p/oneirosjava/
 * @version 1.1
 * @changelog 1.0: Prima versione stabile
 *            1.1: Riscritta gran parte del codice per rendere il gioco più estendibile, aggiunto il multiplayer,
 *                 risolti bug grafici, migliorato il pannello delle opzioni
 */
package jsnake;

import java.util.ArrayList;

public class Field {

    public int WIDTH_UNIT;
    public int HEIGHT_UNIT;
    protected java.util.ArrayList<Snake> snakes;
    protected Position[] foods;
    protected Position[] walls;

    public enum wallLayouts {

        NO_WALLS, PATTERN1, PATTERN2
    };

    public Field() {
        this.snakes = new ArrayList<Snake>();
        this.setWalls(wallLayouts.NO_WALLS);
    }

    public void setSize(int pWidth, int pHeight) {
        this.WIDTH_UNIT = pWidth;
        this.HEIGHT_UNIT = pHeight;
    }

    public void setWalls(wallLayouts pWallLayout) {
        System.gc();
        switch (pWallLayout) {
            case NO_WALLS:
                this.walls = new Position[0];
                break;
            case PATTERN1:
                this.walls = new Position[(WIDTH_UNIT + HEIGHT_UNIT) * 2 - 4];

                //Creo i muri in basso e in alto
                for (int i = 0; i < WIDTH_UNIT; i++) {
                    this.walls[i] = new jsnake.Position(i, 0, java.awt.Color.gray);
                    this.walls[i + WIDTH_UNIT] = new jsnake.Position(i, HEIGHT_UNIT - 1, java.awt.Color.gray);
                }

                //Creo i muri a sinistra e a destra
                for (int i = 0; i < HEIGHT_UNIT - 2; i++) {
                    this.walls[WIDTH_UNIT * 2 + i] = new jsnake.Position(0, i + 1, java.awt.Color.gray);
                    this.walls[WIDTH_UNIT * 2 + i + HEIGHT_UNIT - 2] = new jsnake.Position(WIDTH_UNIT - 1, i + 1, java.awt.Color.gray);
                }
                break;
            case PATTERN2:
                this.walls = new Position[0];
                break;
        }
    }

    public void addSnake(Snake pSnake) {
        this.snakes.add(pSnake);
        /*switch (this.snakes.size()) {
            case 0:
                this.snakes.add(new Snake(respawn.LEFT.getLocation(), pColor, pDir));
                break;
            case 1:
                this.snakes.add(new Snake(respawn.RIGHT.getLocation(), pColor, pDir));
                break;
            case 2:
                this.snakes.add(new Snake(respawn.UP.getLocation(), pColor, pDir));
                break;
            case 3:
                this.snakes.add(new Snake(respawn.DOWN.getLocation(), pColor, pDir));
                break;
            default:
                this.snakes.add(new Snake(this.newFoodLocation(), pColor, pDir));
        }*/
    }

    public void setFoods(int pNumber) {
        System.gc();
        this.foods = new Position[pNumber];
        for (int i = 0; i < pNumber; i++) {
            this.foods[i] = new Position(java.awt.Color.RED);
            this.foods[i].setLocation(newFoodLocation());
        }
    }

    public boolean wallBang() {
        //Controllo se il serpente ha sbattuto su un muro
        for (Position w : walls) {
            for (Snake s : snakes) {
                if (s.head().getLocation().equals(w.getLocation())) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean snakeBang() {
        //Controllo se il serpente ha sbattuto su un altro
        for (int i = 0; i < snakes.size(); i++) {
            for (int j = i + 1; j < snakes.size(); j++) {
                if (snakes.get(i).thereIsBody(snakes.get(j).head().getLocation()) || snakes.get(i).head().getLocation().equals(snakes.get(j).head().getLocation())) {
                    return true;
                }
            }
        }
        return false;
    }

    public void checkTeleport(Snake pSnake) {
        if (pSnake.head().getLocation().x < 0) {
            pSnake.head().setLocation(WIDTH_UNIT - 1, pSnake.head().getLocation().y);
        } //Teletrasporto a destra
        else if (pSnake.head().getLocation().x >= WIDTH_UNIT) {
            pSnake.head().setLocation(0, pSnake.head().getLocation().y);
        } //Teletrasporto su
        else if (pSnake.head().getLocation().y < 0) {
            pSnake.head().setLocation(pSnake.head().getLocation().x, HEIGHT_UNIT - 1);
        } //Teletrasporto giu
        else if (pSnake.head().getLocation().y >= HEIGHT_UNIT) {
            pSnake.head().setLocation(pSnake.head().getLocation().x, 0);
        }
    }

    public java.awt.Point newFoodLocation() {
        java.awt.Point newPoint = new java.awt.Point();
        boolean onASnake, onAWall;

        //Cerco un punto adatto per il cibo
        do {
            onASnake = false;
            onAWall = false;

            //Prendo un punto random nel pannello
            newPoint.setLocation((int) (Math.random() * this.WIDTH_UNIT), (int) (Math.random() * this.HEIGHT_UNIT));

            //Controllo che il punto non sia su un serpente
            for (Snake s : this.snakes) {
                if (s.thereIsBody(newPoint.getLocation()) || s.head().getLocation().equals(newPoint.getLocation())) {
                    onASnake = true;
                }
            }

            //Controllo che il punto non sia su un muro
            for (Position w : this.walls) {
                if (newPoint.getLocation().equals(w.getLocation())) {
                    onAWall = true;
                }
            }

        } while (onASnake || onAWall);
        return newPoint;
    }

    public Position[] getFoods() {
        return this.foods;
    }

    public ArrayList<Snake> getSnakes() {
        return this.snakes;
    }

    public Position[] getWalls() {
        return this.walls;
    }
}
