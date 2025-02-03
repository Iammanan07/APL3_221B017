public class Test {
	public static void main(String[] args) {
		Arjun arjun = new Arjun("Arjun", true);
		Bheem bheem = new Bheem("Bheem", false);
		Duryodhan duryodhan = new Duryodhan("Duryodhan");
		Vikarn vikarn = new Vikarn("Vikarn");

		arjun.fight();
		arjun.obey();
		arjun.kind();

		bheem.fight();
		bheem.obey();
		bheem.kind();

		duryodhan.fight();
		duryodhan.disobey();
		duryodhan.cruel();

		vikarn.fight();
		vikarn.disobey();
		vikarn.cruel();
	}
}
