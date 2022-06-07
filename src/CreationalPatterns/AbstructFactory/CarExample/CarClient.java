package CreationalPatterns.AbstructFactory.CarExample;

public class CarClient {
	public static void main(String[] args) {
		CarBuilder carBuilder = new BuildACar();
		Car car = carBuilder.orderCar(Type.SEDAN);
		System.out.println(car + "\n");
		car = carBuilder.orderCar(Type.SPORT);
		System.out.println(car + "\n");
	}
}
