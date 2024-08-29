import java.util.Scanner;

public class KhachHangKD extends KhachHang {
    protected String linhVucKD;

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.println("nhap linh vuc kd");
        this.linhVucKD = sc.nextLine();
    }

    public void xuat() {
        super.xuat();
        System.out.println("linh vực kinh doanh: " + this.linhVucKD);
    }



    @Override
    public double tienThanhToan() {
        double tienDien =  soKwTieuThu() * 3000;
        double thueGTGT = (10/100) * tienDien;
        return tienDien + thueGTGT - (this.linhVucKD.equals("công ty nhà nước") ? 5/100: 0);
    }
    public double soKwTieuThu() {
        return this.chiSoMoi - this.chiSoCu;
    }
    public String getLinhVucKD() {
        return linhVucKD;
    }

    public void setLinhVucKD(String linhVucKD) {
        this.linhVucKD = linhVucKD;
    }
}
