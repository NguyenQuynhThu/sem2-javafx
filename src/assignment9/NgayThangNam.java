package assignment9;

import java.time.LocalDate;
import javafx.scene.control.TextField;
import javafx.scene.control.TextArea;


public class NgayThangNam {

    public TextField ngay;
    public TextField thang;
    public TextField nam;
    public TextArea ketqua;

    public void submit(){

        try {
            String sngay = ngay.getText();
            String sthang = thang.getText();
            String snam = nam.getText();

            String ngaythangnam = snam + "-" + sthang + "-" + sngay;

            LocalDate localDate = LocalDate.parse(ngaythangnam);

            ketqua.setText("Ngay thu " + localDate.getDayOfWeek()+ " trong tuan." + "\n" +
                    "Ngay thu " + localDate.getDayOfMonth()+ " trong thang." +"\n" +
                    "Ngay thu " + localDate.getDayOfYear() + " trong nam.");
        } catch (Exception e) {
            ketqua.setText("Dinh dang khong dung, vui long nhap lai.\nNgay trong khoang 01 den 30.\nThang trong khoang 01 den 12.\nNgay va thang co 1 chu so thi phai co so 0 dang truoc.");
        }

    }
}
