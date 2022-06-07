package src.CreationalPatterns.AbstractFactory.SheetExample;

public class EmberToolkit extends AbstructFactory {

	@Override
	public CPU createCPU() {
		return new EmberCPU();
	}

	@Override
	public MMU createMMU() {
		return new EmberMMU();
	}

}
