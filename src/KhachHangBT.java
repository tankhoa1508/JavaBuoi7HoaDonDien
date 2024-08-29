public class KhachHangBT extends KhachHang {
    private static final int DON_GIA_MUC_1 = 1500;
    private static final int DON_GIA_MUC_2 = 2000;
    private static final int DON_GIA_MUC_3 = 2800;

    @Override
    public double tienThanhToan() {
        int soKwTieuThu = chiSoMoi - chiSoCu;
        double tienDien;

        if (soKwTieuThu <= 50) {
            tienDien = soKwTieuThu * DON_GIA_MUC_1;
        } else if (soKwTieuThu <= 100) {
            tienDien = 50 * DON_GIA_MUC_1 + (soKwTieuThu - 50) * DON_GIA_MUC_2;
        } else {
            tienDien = 50 * DON_GIA_MUC_1 + 50 * DON_GIA_MUC_2 + (soKwTieuThu - 100) * DON_GIA_MUC_3;
        }

        double thueGTGT = 0.1 * tienDien;
        return tienDien + thueGTGT;
    }
}
