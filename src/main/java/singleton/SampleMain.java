package singleton;

public class SampleMain {

	public static void main(String... args) {
		Configure configure = Configure.getInstance();
		System.out.println(configure);
	}

}
