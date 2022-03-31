package adapter;

public class Adapter2 extends Target2 {

	private OldSystem oldSystem;

	public Adapter2() {
		this.oldSystem = new OldSystem();
	}

	@Override
	public void process() {
		this.oldSystem.oldProcess();
	}
}
