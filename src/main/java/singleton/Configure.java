package singleton;

public class Configure {

	private static Configure instance = new Configure();

	private Configure() {
		// 設定情報の読み込み処理

	}

	public static Configure getInstance() {
		return instance;
	}

	// 設定情報を変更する処理等
}
