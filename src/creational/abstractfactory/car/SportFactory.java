package src.creational.abstractfactory.car;

public class SportFactory implements CarFactory {
	@Override
	public Engine addEngine() {
		return new SportEngine();
	}

	@Override
	public Exterior addExterior() {
		return new SportExterior();
	}

	@Override
	public Interior addInterior() {
		return new SportInterior();
	}
}
