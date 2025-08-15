import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        LopHoc lop1 = new LopHoc("L01", "CNTT 1");
        LopHoc lop2 = new LopHoc("L02", "CNTT 2");

        ArrayList<SinhVien> dsSV = new ArrayList<>();
        dsSV.add(new SinhVien("SV001", "Nguyen Van A", 8.5, lop1));
        dsSV.add(new SinhVien("SV002", "Tran Thi B", 7.8, lop2));
        dsSV.add(new SinhVien("SV003", "Le Van C", 9.2, lop1));
        dsSV.add(new SinhVien("SV004", "Pham Thi D", 8.9, lop2));

        System.out.println("=== Danh sách sinh viên ===");
        for (SinhVien sv : dsSV) {
            sv.inThongTin();
            System.out.println("--------------------");
        }

        SinhVien svMax = dsSV.get(0);
        for (SinhVien sv : dsSV) {
            if (sv.getDiemTB() > svMax.getDiemTB()) {
                svMax = sv;
            }
        }

        System.out.println("=== Sinh viên có điểm TB cao nhất ===");
        svMax.inThongTin();
    }
}
