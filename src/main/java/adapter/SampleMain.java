package adapter;

public class SampleMain {
	public static void main(String... args) {
		Target target = new Adapter();
		target.process();

		Target2 target2 = new Adapter2();
		target2.process();
	}
}
