package observer;

public class SampleMain {

	public static void main(String... args) {
		Observer observer = new Client();
		Subject dataChenger = new DataChanger();

		dataChenger.addObserver(observer);
		for (int count = 0; count < 10; count++) {
			dataChenger.execute();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}