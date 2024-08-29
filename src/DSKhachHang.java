import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Comparator;
import java.util.Optional;
public class DSKhachHang {
    private List<KhachHang> arr;
    public DSKhachHang() {
        this.arr = new ArrayList<>();
    }

    public void nhap() {
        int flag;
        int n;
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("vui lòng chọn loại khách hàng");
            System.out.println("1. khách hàng bình thuong");
            System.out.println("2. khach hàng kinh doanh");
            System.out.println("0. để thoát");
            flag = sc.nextInt();
            if (flag == 0) {
                break;
            }
            System.out.println("nhập số khách hàng: ");
            n = sc.nextInt();

            if (flag == 1) {
                for (int i =0; i < n; i++) {
                    System.out.println("khách hàng :"+ (i+1));
                    KhachHangBT kh = new KhachHangBT();
                    kh.nhap();
                    arr.add(kh);
                }
            } else if (flag == 2) {
                for (int i =0; i < n; i++) {
                    System.out.println("khách hàng :"+ (i+1));
                    KhachHangKD kh = new KhachHangKD();
                    kh.nhap();
                    arr.add(kh);
                }
            }
        }
    }

    public void xuat() {
        for (KhachHang kh : arr) {
            kh.xuat();
        }
    }

    public double tinhTongSoTienDien() {
        double tong = 0;
        for (KhachHang kh : arr) {
            tong += kh.tienThanhToan();
        }

        return tong;
    }
//    public KhachHang tinhTienDienNhieuNhat() {
//        double lonNhat = 0;
//        for (KhachHang kh : arr) {
//            if(kh instanceof KhachHangKD){
//                if(((KhachHangKD) kh).soKwTieuThu() > lonNhat) {
//                    lonNhat = ((KhachHangKD) kh).soKwTieuThu();
//                }
//            }
//        }
//        for (KhachHang kh : arr) {
//            if (kh instanceof KhachHangKD && lonNhat == ((KhachHangKD) kh).soKwTieuThu()) {
//                return kh;
//            }
//        }
//        return null;
//    }
//    public KhachHang tinhTienDienNhieuNhat() {
//        KhachHangKD khachHangTieuThuNhieuNhat = null;
//        double maxKw = -1;
//
//        for (KhachHang kh : arr) {
//            if (kh instanceof KhachHangKD) {
//                KhachHangKD khKD = (KhachHangKD) kh;
//                double soKw = khKD.soKwTieuThu();
//                if (soKw > maxKw) {
//                    maxKw = soKw;
//                    khachHangTieuThuNhieuNhat = khKD;
//                }
//            }
//        }
//        return khachHangTieuThuNhieuNhat;
//    }



    public KhachHang tinhTienDienNhieuNhat() {
        Optional<KhachHangKD> khachHangTieuThuNhieuNhat = arr.stream()
                .filter(kh -> kh instanceof KhachHangKD)
                .map(kh -> (KhachHangKD) kh)
                .max(Comparator.comparingDouble(KhachHangKD::soKwTieuThu));

        return khachHangTieuThuNhieuNhat.orElse(null);
    }

}
