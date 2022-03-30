package abdtarctFactory.PostgrSQL;

import abdtarctFactory.Connection;

public class PostgreSQLConnection extends Connection {

	@Override
	public void say() {
		System.out.println("PostgreSQLです");
	}
}
