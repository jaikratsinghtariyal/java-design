package com.tektutorial.demo;

public class AggregationExample {

	public static void main(String[] args) {
		Engine engine = new Engine();
		Car car1 = new Car();
		car1.setEngine(engine);
		System.out.println(car1.getEngine());
		
		car1 = null;
		// now we can not do getEngine() but We still have that same Engine.
		Car car2 = new Car();
		car2.setEngine(engine);
		System.out.println(car2.getEngine());
	}
}

class Car {
	private Engine engine;

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	
}

class Engine {
	
	@Override
	public String toString() {
		return "I am an Engine. Grrrrr";
	}
}