package FactoryAfter;

public class Main {

	//create an instance of the animal classes
	public static void main(String[] args) {
		Factory factory = new Factory();

		Animal Animal1 = factory.get("Kangaroo");
		Animal1.create();
		Animal Animal2 = factory.get("Cheetah");
		Animal2.create();
		Animal Animal3 = factory.get("Lion");
		Animal3.create();
	}
}