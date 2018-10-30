package com.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.Date;


public class Conn {
    public static void main(String[] args) {
        System.out.println(Conn.s(1,0,"'aads'"));
    }
    public static String s(int id,int sid,String username){
        String hql = "from Persona where 1=1";
        if (id != 0){
            hql += " and id = "+id;
        }
        if (sid != 0){
            hql += " and sid = "+sid;
        }
        if (username !=null && username.length()>0){

            hql += " and username = "+username;
        }
        return hql;
    }
//    public static void main(String[] args) {
//        String driver = "oracle.jdbc.OracleDriver";    //驱动标识符
//        String url = "jdbc:oracle:thin:@localhost:1521:orcl"; //链接字符串
//        // url ="jdbc:oracle:thin:@10.0.30.64:1521:orcl";  // 连接远程的数据库可以这么写
//        String user = "niean";         //数据库的用户名
//        String password = "2526";     //数据库的密码
//        Connection con = null;
//        PreparedStatement pstm = null;
//        ResultSet rs = null;
//        boolean flag = false;
//
//        try {
//            Class.forName(driver);
//            con = DriverManager.getConnection(url,user, password);
//            System.out.println(con);
//            flag = true;
//        } catch(ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//        catch(SQLException e) {
//            e.printStackTrace();
//        }
//        finally {
//            if(rs != null) {
//                try {
//                    rs.close();
//                } catch (SQLException e) {
//                    e.printStackTrace();
//                }
//            }
//
//            // 关闭执行通道
//            if(pstm !=null) {
//                try {
//                    pstm.close();
//                } catch (SQLException e) {
//                    e.printStackTrace();
//                }
//            }
//
//            // 关闭连接通道
//            try {
//                if(con != null &&(!con.isClosed())) {
//                    try {
//                        con.close();
//                    } catch (SQLException e) {
//                        e.printStackTrace();
//                    }
//                }
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//        }
//
//        if(flag) {
//            System.out.println("执行成功！");
//        } else {
//            System.out.println("执行失败！");
//        }
//    }
}
