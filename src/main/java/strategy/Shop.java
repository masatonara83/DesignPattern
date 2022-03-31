package strategy;

public class Shop {

	private Strategy strategy;

	public Shop(Strategy strategy) {
		this.strategy = strategy;
	}

	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}

	public void sell(Book book) {
		this.strategy.discount(book);
	}

	public void returnPraice(Book book) {
		this.strategy.returnAmount(book);
	}

	@Override
	public String toString() {
		return "Shop [strategy=" + strategy + "]";
	}

}
