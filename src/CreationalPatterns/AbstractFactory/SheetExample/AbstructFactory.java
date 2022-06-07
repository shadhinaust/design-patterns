package src.CreationalPatterns.AbstractFactory.SheetExample;

public abstract class AbstructFactory {
	private static final EmberToolkit EMBER_TOOLKIT = new EmberToolkit();
	private static final EnginolaToolkit ENGINOLA_TOOLKIT = new EnginolaToolkit();

	static AbstructFactory getFactory(Architecture architecture) {
		AbstructFactory factory = null;
		switch (architecture) {
		case EMBER:
			factory = EMBER_TOOLKIT;
			break;
		case ENGINOLA:
			factory = ENGINOLA_TOOLKIT;
			break;
		}

		return factory;
	}

	public abstract CPU createCPU();

	public abstract MMU createMMU();
}
