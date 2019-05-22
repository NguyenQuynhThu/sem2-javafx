package session1;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.TextField;

public class Student {

    public TextField txtName;

    public void themSV(){
        String x = txtName.getText();
        Main.studentList.add(x);

        txtName.setText("");
    }

    public void toListPane() throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("dssv.fxml"));
        Main.mainStage.getScene().setRoot(root);
    }

}
