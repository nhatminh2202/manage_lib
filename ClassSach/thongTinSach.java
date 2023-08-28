package ClassSach;

public class thongTinSach {
    String maSach;
    String tenSach;
    int namXB;
    String nhaXB;
    int gia;
    String tinhTrang;
    
    public thongTinSach(){
        
    }

    public thongTinSach(String maSach, String tenSach, int namXB, String nhaXB, int gia, String tinhTrang) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.namXB = namXB;
        this.nhaXB = nhaXB;
        this.gia = gia;
        this.tinhTrang = tinhTrang;
    }

    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public int getNamXB() {
        return namXB;
    }

    public void setNamXB(int namXB) {
        this.namXB = namXB;
    }

    public String getNhaXB() {
        return nhaXB;
    }

    public void setNhaXB(String nhaXB) {
        this.nhaXB = nhaXB;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public String getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }
    
    
}
