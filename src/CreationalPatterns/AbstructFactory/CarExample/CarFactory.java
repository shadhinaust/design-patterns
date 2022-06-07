package CreationalPatterns.AbstructFactory.CarExample;

public interface CarFactory {
	public Engine addEngine();

	public Exterior addExterior();

	public Interior addInterior();
}