package database;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import database.JDBCUtil;

public class TesJDBC {

    public static void main(String[] args) {
        //1. tạo kết nối - qua hàm static thì lấy tên class mà gọi 
        // hàm thôi. 
        Connection connection = JDBCUtil.getconConnection();

        JDBCUtil.Info(connection);
        // 5. hàm hủy kết nối. viết bên kia rồi 
        JDBCUtil.closeconnection(connection);

    }
}
