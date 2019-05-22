package sample;

import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class UCLN {
    public TextField txtSTN;
    public TextField txtSTH;
    public TextArea txtKQ;

    public void submit() {
        try {
            int a = Integer.parseInt(txtSTN.getText());
            int b = Integer.parseInt(txtSTH.getText());
            int ucln = 1;

            for (int i = 1; i <= Math.min(a, b); i++) {
                if (a % i == 0 && b % i == 0) {
                    ucln = i;
                }
            }

            txtKQ.setText("" + ucln);
        } catch (Exception e) {
            txtKQ.setText("Invalid Number");
        }
    }
}

