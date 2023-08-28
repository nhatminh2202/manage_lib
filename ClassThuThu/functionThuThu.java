package ClassThuThu;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class functionThuThu {
    public static List<thongTinThuThu> findAll(){
        List<thongTinThuThu> list = new ArrayList<>();
        String sql = "jdbc:sqlserver://localhost:1433;databaseName=DANGNHAP;encrypt=true;trustServerCertificate=true";
        String user = "sa";
        String pass = "minh1234";
        Connection conn = null;
        Statement st = null;
        try{
            conn = DriverManager.getConnection(sql,user,pass);
            String dt = "select*from ACCOUNT";
            st = conn.createStatement();
            ResultSet rs = st.executeQuery(dt);
            while(rs.next()){
                thongTinThuThu tttt = new thongTinThuThu(rs.getString("USERNAME"),rs.getString("NAME"),rs.getString("GMAIL"),rs.getString("GENDER"),rs.getInt("PHONENUMBER"));
                list.add(tttt);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return list;
    }
    
    public static void delete(String UserName){
        Connection conn = null;
        PreparedStatement ps = null;
        try{
            String sql = "jdbc:sqlserver://localhost:1433;databaseName=DANGNHAP;encrypt=true;trustServerCertificate=true";
            String user = "sa";
            String pass = "minh1234";
            conn = DriverManager.getConnection(sql,user,pass);
            String dt = "delete from ACCOUNT where USERNAME = ?";
            ps = conn.prepareCall(dt);
            ps.setString(1,UserName);
            ps.execute();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public static List<thongTinThuThu> findName(String name){
        List<thongTinThuThu> list = new ArrayList<>();
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            String sql = "jdbc:sqlserver://localhost:1433;databaseName=DANGNHAP;encrypt=true;trustServerCertificate=true";
            String user = "sa";
            String pass = "minh1234";
            conn = DriverManager.getConnection(sql, user, pass);
            String dt = "SELECT * FROM ACCOUNT WHERE NAME LIKE ?";
            ps = conn.prepareStatement(dt);
            ps.setString(1, "%" + name + "%");
            rs = ps.executeQuery();
        while(rs.next()) {
            thongTinThuThu tts = new thongTinThuThu(rs.getString("USERNAME"), rs.getString("NAME"), rs.getString("GMAIL"), rs.getString("GENDER"), rs.getInt("PHONENUMBER"));
            list.add(tts);
            }
        }catch (Exception e){  
            e.printStackTrace();
        }
        return list;
    }
}
