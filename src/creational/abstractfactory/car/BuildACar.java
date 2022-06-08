package src.creational.abstractfactory.car;

public class BuildACar extends CarBuilder {

	@Override
	protected Car makeCar(Type type) {
		Car car = null;
		switch (type) {
		case SEDAN:
			CarFactory factory = new SedanFactory();
			car = new SedanCar(factory);
			car.setName("Toyota Corolla 2023");
			break;
		case SPORT:
			factory = new SportFactory();
			car = new SportCar(factory);
			car.setName("Toyota GR86 2023");
			break;

		}
		return car;
	}

}
