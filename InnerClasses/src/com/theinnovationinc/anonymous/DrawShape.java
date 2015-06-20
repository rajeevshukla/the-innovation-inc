package com.theinnovationinc.anonymous;

public class DrawShape {

	public void draw(Shape shape){
	
		shape.draw();

	}

	
	
	
	public static void main(String[] args) {

		DrawShape shape=new DrawShape();
       final   int x=30;
		
	 Shape shape2=new  Shape() {
			@Override
			public void draw() {
		     System.out.println("This is draw method implemeted by anonymous inner class"+x);
		     draw(2);
			}
			
			public void draw(int x){
				System.out.println("in parameterized int draw method");
			}
		};
		
		
	
		
shape.draw(new  Shape() {
	@Override
	public void draw() {
     System.out.println("This is draw method implemeted by anonymous inner class"+x);
     draw(2);
	}
	
	public void draw(int x){
		System.out.println("in parameterized int draw method");
	}
}); //???





	}

}

