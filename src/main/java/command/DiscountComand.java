package command;

public class DiscountComand extends Command {

	@Override
	public void excute() {
		double amount = book.getAmount();
		book.setAmount(amount * 0.9);
	}

}
