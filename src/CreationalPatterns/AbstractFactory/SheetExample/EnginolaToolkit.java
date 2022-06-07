package src.CreationalPatterns.AbstractFactory.SheetExample;

public class EnginolaToolkit extends AbstructFactory {

	@Override
	public CPU createCPU() {
		return new EnginolaCPU();
	}

	@Override
	public MMU createMMU() {
		return new EnginolaMMU();
	}

}
