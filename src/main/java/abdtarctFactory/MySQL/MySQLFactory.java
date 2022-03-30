package abdtarctFactory.MySQL;

import abdtarctFactory.Configuration;
import abdtarctFactory.Connection;
import abdtarctFactory.Factory;

public class MySQLFactory implements Factory {

	@Override
	public Connection getConnection() {
		return new MySQLConnection();
	}

	@Override
	public Configuration getConfiguration() {
		return new MySQLConfiguration();
	}

}
