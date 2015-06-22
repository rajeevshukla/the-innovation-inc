package com.theinnovationinc.abstraction;

public class StartDrawing {

	public void draw(Shape shape){
		shape.drawShape();
		shape.getInfo();
	}
	
	
	public static void main(String[] args) {
		
		
		StartDrawing drawing=new StartDrawing();
		
		//Shape  shape=new Shape();
		
		Shape shape=new Rectangle();
		
		drawing.draw(shape);
		
		//shape=new Circle();
		
		
		drawing.draw(shape);
		
		
	}
}
