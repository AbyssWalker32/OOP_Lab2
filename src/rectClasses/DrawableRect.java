package rectClasses;

import java.awt.*;

public class DrawableRect extends Rectangle {
    protected Color outColor = Color.blue;

    public DrawableRect(int x1, int y1, int x2, int y2) {
        super(x1, y1, x2, y2);
    }

    public DrawableRect(int x, int y) {
        super(x, y);
    }

    public DrawableRect() {
        super();
    }

    public void setOutColor(Color newColor) {
        outColor = newColor;
    }

    public void draw(Graphics g) {
        g.setColor(outColor);
        g.drawRect(x1, y1, x2 - x1, y2 - y1);
    }
}
