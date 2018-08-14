package IndovinaNumero;



/**
 * Sample Skeleton for 'IndovinaNumero.fxml' Controller Class
 */



import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;

public class IndovinaNumeroController {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="btnNuova"
    private Button btnNuova; // Value injected by FXMLLoader

    @FXML // fx:id="txtcur"
    private TextField txtcur; // Value injected by FXMLLoader

    @FXML // fx:id="txtmax"
    private TextField txtmax; // Value injected by FXMLLoader

    @FXML // fx:id="hboxgioco"
    private HBox hboxgioco; // Value injected by FXMLLoader

    @FXML // fx:id="txttent"
    private TextField txttent; // Value injected by FXMLLoader

    @FXML // fx:id="btntentativo"
    private Button btntentativo; // Value injected by FXMLLoader

    @FXML // fx:id="txtlog"
    private TextArea txtlog; // Value injected by FXMLLoader

    @FXML
    void handleNuova(ActionEvent event) {

    }

    @FXML
    void handletentativo(ActionEvent event) {

    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert btnNuova != null : "fx:id=\"btnNuova\" was not injected: check your FXML file 'IndovinaNumero.fxml'.";
        assert txtcur != null : "fx:id=\"txtcur\" was not injected: check your FXML file 'IndovinaNumero.fxml'.";
        assert txtmax != null : "fx:id=\"txtmax\" was not injected: check your FXML file 'IndovinaNumero.fxml'.";
        assert hboxgioco != null : "fx:id=\"hboxgioco\" was not injected: check your FXML file 'IndovinaNumero.fxml'.";
        assert txttent != null : "fx:id=\"txttent\" was not injected: check your FXML file 'IndovinaNumero.fxml'.";
        assert btntentativo != null : "fx:id=\"btntentativo\" was not injected: check your FXML file 'IndovinaNumero.fxml'.";
        assert txtlog != null : "fx:id=\"txtlog\" was not injected: check your FXML file 'IndovinaNumero.fxml'.";

    }
}
