package command;

public class SpecialMain {

	public static void main(String[] args) {
		// 500円のコミック
		Book comic = new Book(500);

		// 2500円の書籍
		Book technicalBook = new Book(2500);

		// 割引価格計算用コマンド
		Command discountCommand = new DiscountComand();

		// 特別割引価格計算用コマンド
		Command specialDiscountCommand = new SpecialDiscountCommand();

		// コミックに割引価格を与える
		discountCommand.setBook(comic);
		discountCommand.excute();
		System.out.println("割引後価格は" + comic.getAmount() + "円");

		// 技術書に割引価格を与える
		discountCommand.setBook(technicalBook);
		discountCommand.excute();
		System.out.println("割引後価格は" + technicalBook.getAmount() + "円");

		// 技術書にさらに地区別割引を適用
		specialDiscountCommand.setBook(technicalBook);
		specialDiscountCommand.excute();
		System.out.println("割引後価格は" + technicalBook.getAmount() + "円");

	}

}
