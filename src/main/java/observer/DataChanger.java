package observer;

public class DataChanger extends Subject {

	private int status;

	/**
	 * {@link #notifyObServers()}
	 */
	@Override
	public void execute() {
		status++;
		System.out.println("ステータスが" + status + "に変わりました");
		notifyObServers();
	}

}
