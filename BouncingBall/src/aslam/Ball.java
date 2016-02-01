/**
 * 
 */
package aslam;

import java.awt.Color;
import java.awt.Graphics;

/**
 * @author Mohid Aslam
 *
 */
public class Ball extends MovingObject {

	public Ball(int x, int y, int left, int right, int top, int bottom) {
		super(x, y, left, right, top, bottom);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(Color.YELLOW);
		g.fillArc((int) (x - 50), (int) (y - 50), 100, 100, 40, 315);
	}
	@Override
	public void animateOneStep() {
		// TODO Auto-generated method stub
		x += xSpeed;
		y += ySpeed;
	}
}
