package strategy;

public class SampleMain {
	public static void main(String... args) {
		// 500円のコミック
		Book comic = new Book(500);

		// 2500円の書籍
		Book technicalBook = new Book(2500);

		Strategy discountStrategy = new DiscountStrategy();

		Strategy specialDiscountStrategy = new SpecialDiscountStrategy();

		Shop shop = new Shop(discountStrategy);
		shop.sell(comic);
		System.out.println("割引後金額は" + comic.getAmount() + "円");

		shop.setStrategy(specialDiscountStrategy);
		shop.sell(technicalBook);
		System.out.println("割引後金額は" + technicalBook.getAmount() + "円");

		shop.returnPraice(technicalBook);
		System.out.println("定価は" + technicalBook.getAmount() + "円");
	}
}
