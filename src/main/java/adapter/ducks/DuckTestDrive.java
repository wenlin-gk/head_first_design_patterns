package adapter.ducks;

import adapter.ducks.adaptee.WildTurkey;
import adapter.ducks.adapter.TurkeyAdapter;
import adapter.ducks.target.Duck;

/**
 * 对象适配器测试
 */
public class DuckTestDrive {
	public static void main(String[] args) {
		WildTurkey turkey = new WildTurkey();
		Duck turkeyAdapter = new TurkeyAdapter(turkey);

		System.out.println("The Turkey says...");
		turkey.gobble();
		turkey.fly();

		System.out.println("\nThe TurkeyAdapter says...");
		testDuck(turkeyAdapter);
	}

	static void testDuck(Duck duck) {
		duck.quack();
		duck.fly();
	}
}
