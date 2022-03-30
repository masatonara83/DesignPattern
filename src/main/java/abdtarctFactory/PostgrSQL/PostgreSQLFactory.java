package abdtarctFactory.PostgrSQL;

import abdtarctFactory.Configuration;
import abdtarctFactory.Connection;
import abdtarctFactory.Factory;

public class PostgreSQLFactory implements Factory {

	@Override
	public Connection getConnection() {
		return new PostgreSQLConnection();
	}

	@Override
	public Configuration getConfiguration() {
		return new PostgresSQLConfiguration();
	}

}
