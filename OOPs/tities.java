import java.awt.*;
import java.applet.*;

public class tities extends Applet {
    public void paint(Graphics g) {
        g.setColor(Color.CYAN);
        int x[] = { 500, 600, 500 };
        int y[] = { 500, 500, 600 };// coorinates
        g.fillPolygon(x, y, 3);
        g.fillRect(100, 100, 400, 400);
        g.drawRect(100, 100, 400, 400);
        g.setColor(Color.YELLOW);
        g.drawLine(100, 100, 500, 500);
        g.drawArc(100, 100, 800, 810, 180, -90);
    }
}
/*
 * <applet code="kite.class" width="1000" height="1000">
 * </applet>
 */