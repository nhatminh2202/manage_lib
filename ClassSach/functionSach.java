package ClassSach;

import java.util.ArrayList;
import java.util.List;
import java.sql.*;

public class functionSach {
    public static List<thongTinSach> findAll(){
        //Lấy ra danh sách 
        List<thongTinSach> list = new ArrayList<>();
        String sql = "jdbc:sqlserver://localhost:1433;databaseName=QLTV;encrypt=true;trustServerCertificate=true";
        String user = "sa";
        String pass = "minh1234";
        Connection conn = null;
        Statement st = null;
        try{
            conn = DriverManager.getConnection(sql,user,pass);
            String dt = "select*from SACH";
            st = conn.createStatement();
            ResultSet rs = st.executeQuery(dt);
            while(rs.next()){
                thongTinSach tts = new thongTinSach(rs.getString("MASACH"),rs.getString("TENSACH"),rs.getInt("NAMXB"),rs.getString("NHAXB"),rs.getInt("GIA"),rs.getString("TINHTRANG"));
                list.add(tts);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return list;
    }
    
    public static void insert(thongTinSach tts){
        Connection conn = null;
        PreparedStatement ps = null;
        try{
            String sql = "jdbc:sqlserver://localhost:1433;databaseName=QLTV;encrypt=true;trustServerCertificate=true";
            String user = "sa";
            String pass = "minh1234";
            conn = DriverManager.getConnection(sql,user,pass);
            String dt = "insert into SACH(MASACH,TENSACH,NAMXB,NHAXB,GIA,TINHTRANG) values (?,?,?,?,?,?)";
            ps = conn.prepareCall(dt);
            
            ps.setString(1,tts.getMaSach());
            ps.setString(2,tts.getTenSach());
            ps.setInt(3,tts.getNamXB());
            ps.setString(4,tts.getNhaXB());
            ps.setInt(5,tts.getGia());
            ps.setString(6,tts.getTinhTrang());
            
            ps.execute();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public static void delete(String MASACH){
        Connection conn = null;
        PreparedStatement ps = null;
        try{
            String sql = "jdbc:sqlserver://localhost:1433;databaseName=QLTV;encrypt=true;trustServerCertificate=true";
            String user = "sa";
            String pass = "minh1234";
            conn = DriverManager.getConnection(sql,user,pass);
            String dt = "delete from SACH where MASACH = ?";
            ps = conn.prepareCall(dt);
            ps.setString(1,MASACH);
            ps.execute();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public static void edit(thongTinSach tts){
        Connection conn = null;
        PreparedStatement ps = null;
        try{
            String sql = "jdbc:sqlserver://localhost:1433;databaseName=QLTV;encrypt=true;trustServerCertificate=true";
            String user = "sa";
            String pass = "minh1234";
            conn = DriverManager.getConnection(sql,user,pass);
            String dt = "update SACH set TENSACH=?,NAMXB=?,NHAXB=?,GIA=?,TINHTRANG=? where MASACH=?";
            ps = conn.prepareCall(dt);
            ps.setString(6,tts.getMaSach());
            ps.setString(1,tts.getTenSach());
            ps.setInt(2,tts.getNamXB());
            ps.setString(3,tts.getNhaXB());
            ps.setInt(4,tts.getGia());
            ps.setString(5,tts.getTinhTrang());
            ps.execute();
        } catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public static List<thongTinSach> findMaSach(String maSach){
        List<thongTinSach> list = new ArrayList<>();
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            String sql = "jdbc:sqlserver://localhost:1433;databaseName=QLTV;encrypt=true;trustServerCertificate=true";
            String user = "sa";
            String pass = "minh1234";
            conn = DriverManager.getConnection(sql, user, pass);
            String dt = "SELECT * FROM SACH WHERE MASACH LIKE ?";
            ps = conn.prepareStatement(dt);
            ps.setString(1, "%" + maSach + "%");
            rs = ps.executeQuery();
        while(rs.next()) {
            thongTinSach tts = new thongTinSach(rs.getString("MASACH"), rs.getString("TENSACH"), rs.getInt("NAMXB"), rs.getString("NHAXB"), rs.getInt("GIA"), rs.getString("TINHTRANG"));
            list.add(tts);
            }
        }catch (Exception e){  
            e.printStackTrace();
        }
        return list;
    }
}
