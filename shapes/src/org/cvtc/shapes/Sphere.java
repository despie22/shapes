package org.cvtc.shapes;

public class Sphere extends Shape {

	// Attributes
	private float radius = (float) 0.0;
	
	// Getter and setter
	public float getRadius() {
		return radius;
	}

	private void setRadius(float radius) {
		this.radius = radius;
	}

	// Overloaded Constructor
	public Sphere(float radius) {
		
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
