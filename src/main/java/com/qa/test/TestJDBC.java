package com.qa.test;

import java.sql.*;

/**
 * @ Motto：No pains, no gains！
 * @ Project：JavaStudy
 * @ Author：duzhengjun
 * @ dateTime：2019/9/4 4:09 下午
 */
public class TestJDBC {
    public static void main(String[] args) {
        Connection con;
        //jdbc驱动
        String driver="com.mysql.jdbc.Driver";
        //这里我的数据库是cxxt
        String url="jdbc:mysql://localhost:3306/test?&useSSL=false&serverTimezone=UTC";
        String user="root";
        String password="940927";
        try {
            //注册JDBC驱动程序
            Class.forName(driver);
            //建立连接
            con = DriverManager.getConnection(url, user, password);
            if (!con.isClosed()) {
                System.out.println("数据库连接成功");
            }
            String sql ="select * from score";
            PreparedStatement preparedStatement=con.prepareStatement(sql);
            ResultSet resultSet=preparedStatement.executeQuery();
            while (resultSet.next()){
                System.out.println(resultSet.getString("Sno"));
            }
            con.close();
        } catch (ClassNotFoundException e) {
            System.out.println("数据库驱动没有安装");

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("数据库连接失败");
        }
    }
}
