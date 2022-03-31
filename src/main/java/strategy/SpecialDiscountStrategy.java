package strategy;

public class SpecialDiscountStrategy implements Strategy {

	@Override
	public void discount(Book book) {
		double amount = book.getAmount();
		book.setAmount(amount * 0.7);
	}

	@Override
	public void returnAmount(Book book) {
		double amount = book.getAmount();
		book.setAmount(amount / 0.7);
	}

}
