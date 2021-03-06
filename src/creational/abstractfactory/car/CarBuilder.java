package src.creational.abstractfactory.car;

public abstract class CarBuilder {
	protected abstract Car makeCar(Type type);

	public Car orderCar(Type type) {
		Car car = makeCar(type);
		car.makeCar();
		car.lookExterior();
		car.startEngine();
		car.enjoyInterior();
		return car;
	}
}
