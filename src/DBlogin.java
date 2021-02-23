import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBlogin {
    private static Statement stmt;
    Connection conn;

    public DBlogin(Connection conn, Statement stmt) {
        this.conn = conn;
        this.stmt = stmt;
    }

    public Connection getConn() {
        return conn;
    }

    public static Statement getStmt() {
        return stmt;
    }

    public DBlogin() throws SQLException {

        conn = DriverManager.getConnection(
                "jdbc:mysql://" + DatabaseLoginData.DBURL + ":" + DatabaseLoginData.port + "/" + DatabaseLoginData.DBname +
                        "? allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                DatabaseLoginData.user, DatabaseLoginData.password);


        stmt = conn.createStatement();
    }
}



