package com.demo.encapsulation;

public class Divide {

	private int x,y;

	public float divide(){
		return getX()/getY();
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	
	public void setY(int y) {
		if(y==0){
			y=1;
		}
		this.y = y;
	}
		

}
