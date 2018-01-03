package persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Dao {

	Connection con;
	PreparedStatement stmt;
	ResultSet rs;

	public void open(Integer exercicio) throws Exception {
		String dataBaseName = null;
		if (exercicio == null) { // null representa o ano corrente
			dataBaseName = "NCASP_PREFJAPERI16_CONSOLIDADO";
		} else if (exercicio == 2016) {
			dataBaseName = "NCASP_PREFJAPERI16_CONSOLIDADO";
		} else if (exercicio == 2015) {
			dataBaseName = "NCASP_PrefJaperi15";
		}
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=" + dataBaseName, "sa",
				"123");

	}

	public void close() throws Exception {
		stmt.close();
		con.close();
	}
}