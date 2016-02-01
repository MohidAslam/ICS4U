package aslam;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.concurrent.TimeUnit;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 * This is the beginning of a simple game. You should expand it into a dodgeball
 * game, where the user controls an object with the mouse or keyboard, and tries
 * to avoid the balls flying around the screen. If they get hit, it's game over.
 * If they survive for 20 seconds (or some other fixed time), they go on to the
 * next level. <br>
 * <br>
 * Should be run at around 500x300 pixels.<br>
 * <br>
 * 
 * @version Nov. 2015
 * 
 * @author Christina Kemp adapted from Sam Scott
 */
@SuppressWarnings("serial")

public class GamePanel extends JPanel implements Runnable, KeyListener, MouseListener, MouseMotionListener {

	int x = -1;
	int y = -1;

	boolean done;
	boolean done2;
	int width = 1400;
	int height = 950;
	int points = 0;
	char key = ' ';

	String win = "YOU WON!!!";

	private Ball myBall;
	public static GamePanel ball1;

	/**
	 * The number of balls on the screen.
	 */
	final int numBalls = 100;
	/**
	 * The pause between repainting (should be set for about 30 frames per
	 * second).
	 */
	final int pauseDuration = 50;
	/**
	 * An array of balls.
	 */
	FlashingBall[] ball = new FlashingBall[numBalls];

	/** main program (entry point) */
	public static void main(String[] args) {

		// Set up main window (using Swing's Jframe)
		ball1 = new GamePanel();
		JFrame frame = new JFrame("PAC-MAN");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(new Dimension(1400, 100));
		frame.setAutoRequestFocus(false);
		frame.setVisible(true);
		Container c = frame.getContentPane();
		c.add(new GamePanel());
		frame.pack();
	}

	public GamePanel() {
		// Start the ball bouncing (in its own thread)
		this.setPreferredSize(new Dimension(width, height));
		this.setBackground(Color.WHITE);

		for (int i = 0; i < numBalls; i++) {
			ball[i] = new FlashingBall(Math.random() * 1399, Math.random() * 899, 0, width, 0, height);
			ball[i].setXSpeed(Math.random() * 40 - 20);
			ball[i].setYSpeed(Math.random() * 40 - 20);
			ball[i].setColor(
					new Color((int) (Math.random() * 256), (int) (Math.random() * 256), (int) (Math.random() * 256)));
		}
		addMouseMotionListener(this);
		Thread gameThread = new Thread(this);
		gameThread.start();
	}

	/**
	 * Repaints the frame periodically.
	 */
	public void run() {
		while (true) {
			repaint();
			try {
				Thread.sleep(pauseDuration);
			} catch (InterruptedException e) {
			}
		}
	}
	 
	public void init()
	{
		addKeyListener (this); 
	}
	/**
	 * Clears the screen and paints the balls.
	 */
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		if (done){
			g.setFont(new Font("Times New Roman", Font.PLAIN, 40));
			g.drawString("YOU WON!!!",500, 300);
			exit();
		}
		for (int i = 0; i < numBalls; i++) {
			ball[i].draw(g);
		}  
		g.setColor(Color.YELLOW);
		g.fillArc((int) (x - 50), (int) (y - 50), 100, 100, 40, 315);		
		/**
		 * try {
			TimeUnit.SECONDS.sleep((long) 0.0001);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		do{
			g.fillArc((int) (x - 50), (int) (y - 50), 100, 100, 40, 335);
			try {
				TimeUnit.SECONDS.sleep((long) 0.0001);
			} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
			}
		
			g.fillArc((int) (x - 50), (int) (y - 50), 100, 100, 40, 355);
			try {
				TimeUnit.SECONDS.sleep((long) 0.0001);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			g.fillArc((int) (x - 50), (int) (y - 50), 100, 100, 40, 365);
			try {
				TimeUnit.SECONDS.sleep((long) 0.0001);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}while(done == false);
		 */
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		key = e.getKeyChar ();
		if(key == 'w'){
			
		}
		else if(key == 'a'){
			
		}
		else if(key == 's'){
			
		}
		else if(key == 'd'){
			
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		key = ' ';
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	/**
	 * called when mouse is moved in the window
	 * 
	 * @param e
	 **/
	public void mouseMoved(MouseEvent e) {
		x = e.getX();
		y = e.getY();
		for (int i = 0; i <= numBalls; i++)
			if (x - 50 <= ball[i].getX() && x + 50 >= ball[i].getX() && y - 50 <= ball[i].getY()
					&& y + 50 >= ball[i].getY()) {
				ball[i].setY(1000000000);
				points++;
				if (points == numBalls) {
					done = true;
					points = 0;
				}
			}
	}

	/**
	 * called when mouse is dragged in the window
	 * 
	 * @param e
	 *            The mouse event
	 **/

	public void mouseDragged(MouseEvent e) {

	}

	public void exit() {
		System.exit(0);
	}

	public void repaint(Graphics g) {
		// TODO Auto-generated method stub

	}
}
