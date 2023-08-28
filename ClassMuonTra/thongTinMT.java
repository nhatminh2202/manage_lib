package ClassMuonTra;

public class thongTinMT {
    int maSV;
    String maSach,ngayMuon,ngayTra;
    int slMuon;
    String thuThu;
    
    public thongTinMT(){
        
    }

    public thongTinMT(int maSV, String maSach, String ngayMuon, String ngayTra, int slMuon, String thuThu) {
        this.maSV = maSV;
        this.maSach = maSach;
        this.ngayMuon = ngayMuon;
        this.ngayTra = ngayTra;
        this.slMuon = slMuon;
        this.thuThu = thuThu;
    }

    public int getMaSV() {
        return maSV;
    }

    public void setMaSV(int maSV) {
        this.maSV = maSV;
    }

    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public String getNgayMuon() {
        return ngayMuon;
    }

    public void setNgayMuon(String ngayMuon) {
        this.ngayMuon = ngayMuon;
    }

    public String getNgayTra() {
        return ngayTra;
    }

    public void setNgayTra(String ngayTra) {
        this.ngayTra = ngayTra;
    }

    public int getSlMuon() {
        return slMuon;
    }

    public void setSlMuon(int slMuon) {
        this.slMuon = slMuon;
    }

    public String getThuThu() {
        return thuThu;
    }

    public void setThuThu(String thuThu) {
        this.thuThu = thuThu;
    }
    
    
}
