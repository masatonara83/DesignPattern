package strategy;

public interface Strategy {

	void discount(Book book);

	void returnAmount(Book book);
}
