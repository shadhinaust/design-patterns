package src.CreationalPatterns.AbstractFactory.CarExample;

public class SedanFactory implements CarFactory {

	@Override
	public Engine addEngine() {
		return new SedanEngine();
	}

	@Override
	public Exterior addExterior() {
		return new SedanExterior();
	}

	@Override
	public Interior addInterior() {
		return new SedanInterior();
	}

}
