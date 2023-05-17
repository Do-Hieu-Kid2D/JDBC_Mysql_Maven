package module;
import java.util.Date;

public class BenhAn {
    private String maBA, maBN, tenBA, khoa, phong;
    private Date  ngayVao, ngayRa;
    private boolean isNamVien;
    private String moTaBenhAn;
    private long vienPhi;

    public BenhAn(String maBA, String maBN, String tenBA, String khoa, String phong, 
            Date ngayVao, Date ngayRa, boolean isNamVien, String moTaBenhAn, long vienPhi) {
        this.maBA = maBA;
        this.maBN = maBN;
        this.tenBA = tenBA;
        this.khoa = khoa;
        this.phong = phong;
        this.ngayVao = ngayVao;
        this.ngayRa = ngayRa;
        this.isNamVien = isNamVien;
        this.moTaBenhAn = moTaBenhAn;
        this.vienPhi = vienPhi;
    }

    public String getMaBA() {
        return maBA;
    }

    public void setMaBA(String maBA) {
        this.maBA = maBA;
    }

    public String getMaBN() {
        return maBN;
    }

    public void setMaBN(String maBN) {
        this.maBN = maBN;
    }

    public String getTenBA() {
        return tenBA;
    }

    public void setTenBA(String tenBA) {
        this.tenBA = tenBA;
    }

    public String getKhoa() {
        return khoa;
    }

    public void setKhoa(String khoa) {
        this.khoa = khoa;
    }

    public String getPhong() {
        return phong;
    }

    public void setPhong(String phong) {
        this.phong = phong;
    }

    public Date getNgayVao() {
        return ngayVao;
    }

    public void setNgayVao(Date ngayVao) {
        this.ngayVao = ngayVao;
    }

    public Date getNgayRa() {
        return ngayRa;
    }

    public void setNgayRa(Date ngayRa) {
        this.ngayRa = ngayRa;
    }

    public boolean isIsNamVien() {
        return isNamVien;
    }

    public void setIsNamVien(boolean isNamVien) {
        this.isNamVien = isNamVien;
    }

    public String getMoTaBenhAn() {
        return moTaBenhAn;
    }

    public void setMoTaBenhAn(String moTaBenhAn) {
        this.moTaBenhAn = moTaBenhAn;
    }

    public long getVienPhi() {
        return vienPhi;
    }

    public void setVienPhi(long vienPhi) {
        this.vienPhi = vienPhi;
    }
        
}