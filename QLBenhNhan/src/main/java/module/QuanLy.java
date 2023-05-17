
package module;

public class QuanLy {
   private String tenDN, matKhau;

    public QuanLy() {
    }

    public QuanLy(String tenDN, String matKhau) {
        this.tenDN = tenDN;
        this.matKhau = matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public void setTenDN(String tenDN) {
        this.tenDN = tenDN;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public String getTenDN() {
        return tenDN;
    }
   
   
}


