package mediator;

import mediator.department.Development;
import mediator.department.Finacial;
import mediator.department.Market;

public class Client {
	public static void main(String[] args) {
		Mediator m = new President();
		
		Market market = new Market(m);
		Development devp = new Development(m);
		Finacial f = new Finacial(m);
		
		market.selfAction();
		market.outAction();
	}
}
