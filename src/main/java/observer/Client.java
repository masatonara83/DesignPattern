package observer;

/**
 * インスタンスの変更を監視するクラス
 * 
 * @author naramasato
 *
 */
public class Client implements Observer {

	@Override
	public void update(Subject subject) {
		System.out.println("通知を受信しました");
	}

}
