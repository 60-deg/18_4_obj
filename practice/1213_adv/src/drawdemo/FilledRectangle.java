package drawdemo;

import java.awt.Graphics;

public class FilledRectangle extends Rectangle{
	void draw(Graphics g) {
		g.fillPolygon(xs, ys, xs.length);
	}
}