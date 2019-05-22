package session1;

import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.TextArea;

import java.net.URL;
import java.util.ResourceBundle;

public class StudentList implements Initializable {

    public TextArea txtList;

    //interface bat su kien khoi tao man hinh
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        String str = "";

        for (String s: Main.studentList){
            str += (s + "\n");
        }
        txtList.setText(str);
    }

    public void toAdd() throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("nhapsv.fxml"));
        Main.mainStage.getScene().setRoot(root);
    }


}

