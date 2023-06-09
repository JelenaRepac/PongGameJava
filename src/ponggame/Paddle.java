package ponggame;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class Paddle extends Rectangle{

	int id; // identifikator koja palica je u pitanju
	int yVelocity; //brzina kretanja palice
	int xVelocity;
	int speed=7;
	
	Paddle(int x, int y, int PADDLE_WIDTH, int PADDLE_HEIGHT, int id){
		super(x,y,PADDLE_WIDTH,PADDLE_HEIGHT);
		this.id=id;
	}
	
	public void keyPressed(KeyEvent e) {
		switch(id) {
		case 1:
			if(e.getKeyCode()==KeyEvent.VK_W) {
				setYDirection(-speed);
				move();
			}
			if(e.getKeyCode()==KeyEvent.VK_S) {
				setYDirection(speed);
				move();
			}
//			if(e.getKeyCode()==KeyEvent.VK_D) {
//				setXDirection(speed);
//				move();
//			}
//			if(e.getKeyCode()==KeyEvent.VK_A) {
//				setXDirection(-speed);
//				move();
//			}
			break;
		case 2:
			if(e.getKeyCode()==KeyEvent.VK_UP) {
				setYDirection(-speed);
				move();
			}
			if(e.getKeyCode()==KeyEvent.VK_DOWN) {
				setYDirection(speed);
				move();
			}
//			if(e.getKeyCode()==KeyEvent.VK_RIGHT) {
//				setXDirection(speed);
//				move();
//			}
//			if(e.getKeyCode()==KeyEvent.VK_LEFT) {
//				setXDirection(-speed);
//			}
			break;
		}
	}
	public void keyReleased(KeyEvent e) {
		switch(id) {
		case 1:
			if(e.getKeyCode()==KeyEvent.VK_W) {
				setYDirection(0);
				move();
			}
			if(e.getKeyCode()==KeyEvent.VK_S) {
				setYDirection(0);
				move();
			}
//			if(e.getKeyCode()==KeyEvent.VK_D) {
//				setXDirection(0);
//				move();
//			}
//			if(e.getKeyCode()==KeyEvent.VK_A) {
//				setXDirection(0);
//				move();
//			}
			break;
		case 2:
			if(e.getKeyCode()==KeyEvent.VK_UP) {
				setYDirection(0);
				move();
			}
			if(e.getKeyCode()==KeyEvent.VK_DOWN) {
				setYDirection(0);
				move();
			}
//			if(e.getKeyCode()==KeyEvent.VK_RIGHT) {
//				setXDirection(0);
//				move();
//			}
//			if(e.getKeyCode()==KeyEvent.VK_LEFT) {
//				setXDirection(0);
//			}
			break;
		}
	}
	public void setYDirection(int yDirection) {
		yVelocity= yDirection;
	}
//	public void setXDirection(int xDirection) {
//		xVelocity= xDirection;
//	}
	public void move() {
		y= y + yVelocity;
//		x= x + xVelocity;
	}
	public void draw(Graphics g) {
		if(id==1) {
			g.setColor(Color.white);
		}
		else {
			g.setColor(Color.white);
		}
		g.fillRect(x, y, width, height);
		
	}
}
