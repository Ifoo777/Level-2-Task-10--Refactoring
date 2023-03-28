package FactoryAfter;

public class Factory {

	public Animal get(String type) {
		if (type == null) {
			return null;
		}
		if (type.equalsIgnoreCase("Kangaroo")) {
			return new Animal1();
		} else if (type.equalsIgnoreCase("Cheetah")) {
			return new Animal2();
		} else if (type.equalsIgnoreCase("Lion")) {
			return new Animal3();
		}
		return null;
	}
}