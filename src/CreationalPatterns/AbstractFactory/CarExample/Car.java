package src.CreationalPatterns.AbstractFactory.CarExample;

public abstract class Car {
	private String name;
	Engine engine;
	Exterior exterior;
	Interior interior;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	abstract void makeCar();

	public void startEngine() {
		System.out.println("Car started with the following features: " + engine);
	}

	public void lookExterior() {
		System.out.println("Exterior features: " + exterior);
	}

	public void enjoyInterior() {
		System.out.println("Interior features: " + interior);
	}

	public String toString() {
		String info = "The " + name + " car has the engine with " + engine + " with beautiful exterior(" + exterior
				+ ") and a confortable interior(" + interior + ")";
		return info;
	}
}
