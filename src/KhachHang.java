import java.util.Scanner;

public abstract class KhachHang {
    protected String makh;
    protected String tenKH;
    protected int chiSoCu;
    protected int chiSoMoi;

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap makh khách hàng");
        this.makh = sc.nextLine();
        System.out.println("Nhap ten KH");
        this.tenKH = sc.nextLine();
        System.out.println("Nhap chi so củ");
        this.chiSoCu = sc.nextInt();
        System.out.println("nhap chi so mới");
        this.chiSoMoi = sc.nextInt();
    }

    public void xuat() {
        System.out.println("ma kh: "+ this.makh);
        System.out.println("Tên KH: "+ this.tenKH);
        System.out.println("Chi so củ:"+ this.chiSoCu);
        System.out.println("Chỉ số mới"+ this.chiSoMoi);
    }
    public abstract double tienThanhToan();

    public String getMakh() {
        return makh;
    }

    public void setMakh(String makh) {
        this.makh = makh;
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public int getChiSoCu() {
        return chiSoCu;
    }

    public void setChiSoCu(int chiSoCu) {
        this.chiSoCu = chiSoCu;
    }

    public int getChiSoMoi() {
        return chiSoMoi;
    }

    public void setChiSoMoi(int chiSoMoi) {
        this.chiSoMoi = chiSoMoi;
    }
}
