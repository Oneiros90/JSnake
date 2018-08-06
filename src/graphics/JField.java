package graphics;

import jsnake.*;
import jsnake.Field.wallLayouts;

public class JaField extends javax.swing.JPanel {

    private class TimerAction implements java.awt.event.ActionListener {

        @Override
        public void actionPerformed(java.awt.event.ActionEvent e) {
            for (Snake s : field.getSnakes()) {
                if (s.eatItself() || field.wallBang() || field.snakeBang()) {
                    timer.stop();
                } else {
                    field.checkTeleport(s);
                    //Controllo se il serpente ha preso il cibo
                    for (Position f : field.getFoods()) {
                        if (s.head().getLocation().equals(f.getLocation())) {
                            f.setLocation(field.newFoodLocation());
                            s.eat();
                            Panel tail = new Panel(s.tail());
                            panels.add(tail);
                            add(tail);
                        }
                    }
                    s.move();
                }
            }
            for (int i = 0; i < panels.size(); i++) {
                panels.get(i).updateLocation();
            }
        }
    }

    private class TimerAction2 implements java.awt.event.ActionListener {

        @Override
        public void actionPerformed(java.awt.event.ActionEvent e) {
            for (Snake s : field.getSnakes()) {
                if (s.eatItself() || field.wallBang() || field.snakeBang()) {
                    s.reset();
                    for (Panel p : panels) {
                        if (p == null) {
                            remove(p);
                        }
                    }
                } else {
                    field.checkTeleport(s);
                    //Controllo se il serpente ha preso il cibo
                    for (Position f : field.getFoods()) {
                        if (s.head().getLocation().equals(f.getLocation())) {
                            f.setLocation(field.newFoodLocation());
                            s.eat();
                            Panel tail = new Panel(s.tail());
                            panels.add(tail);
                            add(tail);
                        }
                    }
                    s.move();
                }
            }
            for (int i = 0; i < panels.size(); i++) {
                panels.get(i).updateLocation();
            }
        }
    }
    protected static int CELL;
    private javax.swing.Timer timer;
    private Field field;
    private java.util.ArrayList<Panel> panels;
    private java.util.ArrayList<JSnake> snakes;
    private wallLayouts wallLayout;
    private int timerMilliseconds;

    public JField(int pWidth, int pHeight) {
        this.setLayout(null);
        this.setBounds(0, 0, pWidth, pHeight);
        this.setBackground(java.awt.Color.black);
        this.field = new Field();
        this.setWallLayout(wallLayouts.NO_WALLS);
        this.setTimer(100);
        this.panels = new java.util.ArrayList<Panel>();
        this.snakes = new java.util.ArrayList<JSnake>();
        this.timer = new javax.swing.Timer(100, new TimerAction());
    }

    protected enum gameMode {

        SINGLE, MULTI
    }

    public void setMode(gameMode mode) {
        if (mode == gameMode.SINGLE) {
            this.field.setSize(30, 20);
        } else {
            this.field.setSize(60, 40);
        }
        JField.CELL = this.getWidth() / this.field.WIDTH_UNIT;
        this.timer.removeActionListener(this.timer.getActionListeners()[0]);
        this.timer.addActionListener(new TimerAction2());
    }

    protected enum respawn {

        UP, DOWN, RIGHT, LEFT;
    }

    public void gameStart() {
        for (JSnake j : this.snakes) {
            j.setSnake(this.field.WIDTH_UNIT, this.field.HEIGHT_UNIT);
            this.field.addSnake(j.snake);
            this.addKeyListener(j.keyListener);
        }
        this.field.setFoods(this.snakes.size());
        this.field.setWalls(this.wallLayout);
        this.timer.setDelay(this.timerMilliseconds);
        for (int i = 0; i < this.field.getSnakes().size(); i++) {
            Snake s = this.field.getSnakes().get(i);
            Panel heads = new Panel(s.head());
            this.panels.add(heads);
            this.add(heads);
        }
        for (Position f : this.field.getFoods()) {
            Panel foods = new Panel(f);
            this.panels.add(foods);
            this.add(foods);
        }
        for (Position w : this.field.getWalls()) {
            this.add(new Panel(w));
        }
        this.timer.start();
        requestFocus();
    }

    public void addSnake(JSnake pJSnake) {
        this.snakes.add(pJSnake);
    }

    public void setTimer(int timerMilliseconds) {
        this.timerMilliseconds = timerMilliseconds;
    }

    public void setWallLayout(wallLayouts wallLayout) {
        this.wallLayout = wallLayout;
    }
}
