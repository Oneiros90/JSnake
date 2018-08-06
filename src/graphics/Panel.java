package graphics;

import jsnake.Position;

public class Panel extends javax.swing.JPanel {

    protected Position point;

    public Panel(Position pPos) {
        this.point = pPos;
        this.setLayout(null);
        this.setBounds(this.point.x * Screen.CELL, this.point.y * Screen.CELL, Screen.CELL, Screen.CELL);
        this.setBackground(this.point.getColor());
        this.setVisible(true);
    }

    @Override
        protected void paintComponent(java.awt.Graphics g) {
            super.paintComponent(g);
            g.setColor(java.awt.Color.black);
            g.drawRect(0, 0, Screen.CELL, Screen.CELL);
        }

    public void updateLocation() {
        this.setLocation(this.point.x * Screen.CELL, this.point.y * Screen.CELL);
    }
}
