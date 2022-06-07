package src.CreationalPatterns.AbstractFactory.CarExample;

public interface CarFactory {
	public Engine addEngine();

	public Exterior addExterior();

	public Interior addInterior();
}