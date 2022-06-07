package src.CreationalPatterns.AbstractFactory.CarExample;

public class SedanCar extends Car {
	CarFactory factory;

	public SedanCar(CarFactory factory) {
		this.factory = factory;
	}

	@Override
	void makeCar() {
		System.out.println("Making car " + getName());
		exterior = factory.addExterior();
		engine = factory.addEngine();
		interior = factory.addInterior();
	}
}
