/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DBContextTu {

    private static final String USERNAME = "sa";
    private static final String PASSWORD = "123456";
    private static final String SERVER = "LAPTOP-JFP9BPP3";
    private static final String PORT = "1433";
    private static final String DATABASE_NAME = "PRO1014_IT17316_NHOM4";
    private static final boolean USING_SSL = true;

    private static String CONNECT_STRING;

    static {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            StringBuilder connectStringBuilder = new StringBuilder();
            connectStringBuilder.append("jdbc:sqlserver://")
                    .append(SERVER).append(":").append(PORT).append(";")
                    .append("databaseName=").append(DATABASE_NAME).append(";")
                    .append("user=").append(USERNAME).append(";")
                    .append("password=").append(PASSWORD).append(";");
            if (USING_SSL) {
                connectStringBuilder.append("encrypt=true;trustServerCertificate=true;");
            }
            CONNECT_STRING = connectStringBuilder.toString();
            System.out.println("Connect String có dạng: " + CONNECT_STRING);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DBContextTu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(CONNECT_STRING);
    }

    public static void main(String[] args) throws SQLException {
        Connection conn = getConnection();
        String dbpn = conn.getMetaData().getDatabaseProductName();
        System.out.println(dbpn);
    }

}
