package src.creational.abstractfactory.car;

public interface CarFactory {
	public Engine addEngine();

	public Exterior addExterior();

	public Interior addInterior();
}