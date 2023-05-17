package database;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCUtil {

    public static Connection getconConnection() {
        // Thằng này kết nối với DB thôi
        Connection c = null;
        try {
            // tạo kết nối com.mysql.cj.jdbc.Driver
            // Đăng ký driver nhưng bây giờ nó đăng ký tự động rồi nên k cần dòng dưới
            //DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            String url_database = "jdbc:mySQL://localhost:3306/quanlybenhnhan";
            // tk - mk 
            String user_Namne = "root";
            String mk = "";
            c = DriverManager.getConnection(url_database, user_Namne, mk);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return c; // tra ve 1 ket noi!

    }

    // hàm ngắt kết nối:
    public static void closeconnection(Connection c) {
        try {
            if (c != null) {
                c.close();
                System.out.println("Đã đóng kết nối!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void Info(Connection c) {
        if (c != null) {
            try {
                DatabaseMetaData mydata = c.getMetaData();
                System.out.println(mydata.getDatabaseProductName());
                System.out.println(mydata.getDatabaseProductVersion());
                System.out.println(mydata.getDatabaseMajorVersion());
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }

}
