
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controlador {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button Btn_Guardar;

    @FXML
    private Button Btn_Limpiar;

    @FXML
    private TextArea area_resultados;

    @FXML
    private TextField txt_codigo;

    @FXML
    private TextField txt_gmail;

    @FXML
    private TextField txt_nombre;

    private Persona persona;//definiendo la variable atributo a modelo
    @FXML
    void codigo_IN(ActionEvent event) {

    }

    @FXML
    void gmail_IN(ActionEvent event) {

    }

    @FXML
    void guardarDatos(ActionEvent event) {

        area_resultados.setText("HOLA");
    }

    @FXML
    void limpiarDatos(ActionEvent event) {

    }

    @FXML
    void nombre_IN(ActionEvent event) {

    }

    public void startGUI(){
        String nombre = persona.getNombre();
         String codigo = persona.getCodigo();
          String gmail = persona.getGmail();
          
    }
    @FXML
    void initialize() {
        assert Btn_Guardar != null : "fx:id=\"Btn_Guardar\" was not injected: check your FXML file 'Untitled'.";
        assert Btn_Limpiar != null : "fx:id=\"Btn_Limpiar\" was not injected: check your FXML file 'Untitled'.";
        assert area_resultados != null : "fx:id=\"area_resultados\" was not injected: check your FXML file 'Untitled'.";
        assert txt_codigo != null : "fx:id=\"txt_codigo\" was not injected: check your FXML file 'Untitled'.";
        assert txt_gmail != null : "fx:id=\"txt_gmail\" was not injected: check your FXML file 'Untitled'.";
        assert txt_nombre != null : "fx:id=\"txt_nombre\" was not injected: check your FXML file 'Untitled'.";

        Persona persona1 = new Persona();
    }

}
