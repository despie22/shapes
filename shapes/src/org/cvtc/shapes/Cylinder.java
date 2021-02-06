package org.cvtc.shapes;

public class Cylinder extends Shape {

	// Attributes
	private float radius = (float) 0.0;
	private float height = (float) 0.0;
	
	// Getters and setters
	public float getRadius() {
		return radius;
	}

	private void setRadius(float radius) {
		this.radius = radius;
	}

	public float getHeight() {
		return height;
	}

	private void setHeight(float height) {
		this.height = height;
	}

	// Overloaded Constructor
	public Cylinder(float radius, float height) {
		
	}
	
	// Override methods from superclass
	@Override
	public float surfaceArea() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float volume() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float render() {
		// TODO Auto-generated method stub
		return 0;
	}

}
