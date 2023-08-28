package ClassMuonTra;

import java.util.ArrayList;
import java.util.List;
import java.sql.*;

public class functionMT {
    public static List<thongTinMT> findAll(){
        List<thongTinMT> list = new ArrayList<>();
        String sql = "jdbc:sqlserver://localhost:1433;databaseName=MUONTRA;encrypt=true;trustServerCertificate=true";
        String user = "sa";
        String pass = "minh1234";
        Connection conn = null;
        Statement st = null;
        try{
            conn = DriverManager.getConnection(sql,user,pass);
            String dt = "select*from INFOR";
            st = conn.createStatement();
            ResultSet rs = st.executeQuery(dt);
            while(rs.next()){
                thongTinMT mt = new thongTinMT(rs.getInt("MASV"),rs.getString("MASACH"),rs.getString("NGAYMUON"),rs.getString("NGAYTRA"),rs.getInt("SLMUON"),rs.getString("THUTHU"));
                list.add(mt);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return list;
    }
    
    public static void insert(thongTinMT ttmt){
        Connection conn = null;
        PreparedStatement ps = null;
        try{
            String sql = "jdbc:sqlserver://localhost:1433;databaseName=MUONTRA;encrypt=true;trustServerCertificate=true";
            String user = "sa";
            String pass = "minh1234";
            conn = DriverManager.getConnection(sql,user,pass);
            String dt = "insert into INFOR(MASV,MASACH,NGAYMUON,NGAYTRA,SLMUON,THUTHU) values (?,?,?,?,?,?)";
            ps = conn.prepareCall(dt);
            
            ps.setInt(1,ttmt.getMaSV());
            ps.setString(2,ttmt.getMaSach());
            ps.setString(3,ttmt.getNgayMuon());
            ps.setString(4,ttmt.getNgayTra());
            ps.setInt(5,ttmt.getSlMuon());
            ps.setString(6,ttmt.getThuThu());
            
            ps.execute();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public static void delete(int MASV){
        Connection conn = null;
        PreparedStatement ps = null;
        try{
            String sql = "jdbc:sqlserver://localhost:1433;databaseName=MUONTRA;encrypt=true;trustServerCertificate=true";
            String user = "sa";
            String pass = "minh1234";
            conn = DriverManager.getConnection(sql,user,pass);
            String dt = "delete from INFOR where MASV = ?";
            ps = conn.prepareCall(dt);
            ps.setInt(1,MASV);
            ps.execute();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public static List<thongTinMT> findMaSV(int maSV){
        List<thongTinMT> list = new ArrayList<>();
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            String sql = "jdbc:sqlserver://localhost:1433;databaseName=MUONTRA;encrypt=true;trustServerCertificate=true";
            String user = "sa";
            String pass = "minh1234";
            conn = DriverManager.getConnection(sql, user, pass);
            String dt = "SELECT * FROM INFOR WHERE MASV LIKE ?";
            ps = conn.prepareStatement(dt);
            ps.setString(1, "%" + maSV + "%");
            rs = ps.executeQuery();
        while(rs.next()) {
            thongTinMT tts = new thongTinMT(rs.getInt("MASV"),rs.getString("MASACH"),rs.getString("NGAYMUON"),rs.getString("NGAYTRA"),rs.getInt("SLMUON"),rs.getString("THUTHU"));
            list.add(tts);
            }
        }catch (Exception e){  
            e.printStackTrace();
        }
        return list;
    }
}
