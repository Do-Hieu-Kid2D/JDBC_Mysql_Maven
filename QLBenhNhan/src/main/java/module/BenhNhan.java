package module;

import java.util.Date;

public class BenhNhan {
    private String maBN, tenBN, diaChi, dienThoai, gioiTinh;
    private Date ngaySinh;
    private String baoHiem;

    public BenhNhan(String maBN, String tenBN, String diaChi, String dienThoai, String gioiTinh, Date ngaySinh, String baoHiem) {
        this.maBN = maBN;
        this.tenBN = tenBN;
        this.diaChi = diaChi;
        this.dienThoai = dienThoai;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.baoHiem = baoHiem;
    }

    public String getMaBN() {
        return maBN;
    }

    public String getTenBN() {
        return tenBN;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public String getDienThoai() {
        return dienThoai;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public String getBaoHiem() {
        return baoHiem;
    }

    public void setMaBN(String maBN) {
        this.maBN = maBN;
    }

    public void setTenBN(String tenBN) {
        this.tenBN = tenBN;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void setDienThoai(String dienThoai) {
        this.dienThoai = dienThoai;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public void setBaoHiem(String baoHiem) {
        this.baoHiem = baoHiem;
    }
}
