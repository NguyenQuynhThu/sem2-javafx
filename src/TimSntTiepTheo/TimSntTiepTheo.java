package TimSntTiepTheo;

import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class TimSntTiepTheo {

    public TextField txtSoA;
    public TextArea txtKQ;

    public boolean isSoNguyenTo(int x){
        if (x < 2) {
            return false;
        }
        int CanBacHai = (int) Math.sqrt(x);
        for (int i = 2; i <= CanBacHai; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }

    public void submit(){
        try{
            int a = Integer.parseInt(txtSoA.getText());
            int snt = 1;

            for (int i=a+1; ; i++){
                if(isSoNguyenTo(i)){
                    snt = i;
                    break;
                }
            } txtKQ.setText(""+snt);
        } catch (Exception e){
            txtKQ.setText("Invalid Number");
        }


    }




}

