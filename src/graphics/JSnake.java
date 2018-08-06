package graphics;

import java.awt.event.KeyEvent;
import jsnake.*;

public class JSnake {

    protected enum keyConfiguration {

        ARROWS(KeyEvent.VK_UP, KeyEvent.VK_DOWN, KeyEvent.VK_RIGHT, KeyEvent.VK_LEFT),
        WASD(KeyEvent.VK_W, KeyEvent.VK_S, KeyEvent.VK_D, KeyEvent.VK_A),
        IJKL(KeyEvent.VK_I, KeyEvent.VK_K, KeyEvent.VK_L, KeyEvent.VK_J),
        KP(KeyEvent.VK_KP_UP, KeyEvent.VK_KP_DOWN, KeyEvent.VK_KP_RIGHT, KeyEvent.VK_KP_LEFT);
        protected int upCode, downCode, rightCode, leftCode;

        private keyConfiguration(int pUpCode, int pDownCode, int pRightCode, int pLeftCode) {
            this.upCode = pUpCode;
            this.downCode = pDownCode;
            this.rightCode = pRightCode;
            this.leftCode = pLeftCode;
        }
    }

    protected class ArrowKeyListener extends java.awt.event.KeyAdapter {

        private keyConfiguration keys;

        public ArrowKeyListener(keyConfiguration keyConf) {
            this.keys = keyConf;
        }

        @Override
        public void keyPressed(java.awt.event.KeyEvent evt) {
            if (evt.getKeyCode() == this.keys.upCode) {
                snake.setDirection(Head.direction.UP);
            } else if (evt.getKeyCode() == this.keys.downCode) {
                snake.setDirection(Head.direction.DOWN);
            } else if (evt.getKeyCode() == this.keys.rightCode) {
                snake.setDirection(Head.direction.RIGHT);
            } else if (evt.getKeyCode() == this.keys.leftCode) {
                snake.setDirection(Head.direction.LEFT);
            }
        }
    }
    protected Screen.respawn respawn;
    protected java.awt.Color color;
    protected Head.direction direction;
    protected ArrowKeyListener keyListener;
    protected Snake snake;

    public JSnake(Screen.respawn pRespawn, java.awt.Color pColor, jsnake.Head.direction pDirection, keyConfiguration pKey) {
        this.color = pColor;
        this.direction = pDirection;
        this.respawn = pRespawn;
        setKeyListener(pKey);
    }

    public void setKeyListener(keyConfiguration pKey) {
        this.keyListener = new ArrowKeyListener(pKey);
    }

    public void setSnake(int pFieldWidth, int pFieldHeight) {
        switch (this.respawn) {
            case UP:
                this.snake = new Snake(new java.awt.Point(pFieldWidth / 2, 2), this.color, this.direction);
                break;
            case DOWN:
                this.snake = new Snake(new java.awt.Point(pFieldWidth / 2, pFieldHeight - 2), this.color, this.direction);
                break;
            case RIGHT:
                this.snake = new Snake(new java.awt.Point(pFieldWidth - 2, pFieldHeight / 2), this.color, this.direction);
                break;
            case LEFT:
                this.snake = new Snake(new java.awt.Point(2, pFieldHeight / 2), this.color, this.direction);
                break;
        }
    }
}
