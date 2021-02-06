package org.cvtc.shapes;

public class Cuboid extends Shape {

	// Attributes
	private float width = (float) 0.0;
	private float height = (float) 0.0;
	private float depth = (float) 0.0;
	
	// Getters and setters
	public float getWidth() {
		return width;
	}

	private void setWidth(float width) {
		this.width = width;
	}

	public float getHeight() {
		return height;
	}

	private void setHeight(float height) {
		this.height = height;
	}

	public float getDepth() {
		return depth;
	}

	private void setDepth(float depth) {
		this.depth = depth;
	}

	// Overloaded Constructor
	public Cuboid(float width, float height, float depth) {
		
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
