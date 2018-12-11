
public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MallardDuck duck=new MallardDuck();
		WildTurkey turkey=new WildTurkey();
		Turkey spyTurkey=new DuckAdapter(duck);
		System.out.println("The turkey can do this:");
		turkey.spasm();
		turkey.gobble();
		System.out.println("And the duck can do this:");
		duck.quack();
		duck.fly();
		System.out.println("but, the spy turkey can...?");
		System.out.println();
		spyTurkey.gobble();
		spyTurkey.spasm();
	}

}
