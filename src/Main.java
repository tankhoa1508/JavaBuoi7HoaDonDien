//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        DSKhachHang dsKhachHang = new DSKhachHang();
        dsKhachHang.nhap();
        dsKhachHang.xuat();
        System.out.println("Tong số tiền điện các ho đã sử dụng: "+ dsKhachHang.tinhTongSoTienDien());
        System.out.println("Hộ kinh doanh sử dụngddienj niều nhất là: "+ dsKhachHang.tinhTienDienNhieuNhat().tenKH);
    }
}