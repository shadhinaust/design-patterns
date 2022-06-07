package src.CreationalPatterns.AbstractFactory.SheetExample;

public class Client {

	public static void main(String[] args) {
		AbstructFactory factory = AbstructFactory.getFactory(Architecture.EMBER);
		CPU cpu = factory.createCPU();
	}
}
