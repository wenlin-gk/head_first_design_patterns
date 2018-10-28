package builder;

public class Client {
	public static void main(String[] args) {
		AirShipDirector director = new MyAirshipDirector(new MyAirShipBuilder());
		AirShip ship = director.directAirShip();
		ship.launch();
	}
}
