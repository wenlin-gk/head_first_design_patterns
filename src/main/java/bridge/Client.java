package bridge;

public class Client {
	public static void main(String[] args) {
		Computer laptop = new Laptop(new Lenovo());
		laptop.sale();
		Computer desktop = new Desktop(new Shenzhou());
		desktop.sale();
	}
}
