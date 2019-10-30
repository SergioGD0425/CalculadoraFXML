package dad.javafx.calculadoraFXML;


import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.binding.Bindings;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;

public class CalculadoraFXMLController implements Initializable {
	
	@FXML
    private GridPane root;
	
	@FXML
    private TextField operationText;

    @FXML
    private Button sieteButton;

    @FXML
    private Button ochoButton;

    @FXML
    private Button nueveButton;

    @FXML
    private Button ceButton;

    @FXML
    private Button cButton;

    @FXML
    private Button cuatroButton;

    @FXML
    private Button cincoButton;

    @FXML
    private Button seisButton;

    @FXML
    private Button multiButton;

    @FXML
    private Button divButton;

    @FXML
    private Button unoButton;

    @FXML
    private Button dosButton;

    @FXML
    private Button tresButton;

    @FXML
    private Button menosButton;

    @FXML
    private Button equalsButton;

    @FXML
    private Button ceroButton;

    @FXML
    private Button commaButton;

    @FXML
    private Button sumaButton;
	
	Calculadora calc = new Calculadora();
	
	public CalculadoraFXMLController() throws IOException {
		
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/CalculadoraFXML.fxml"));
			loader.setController(this);
			loader.load();	
	}
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		//bindeos
		
		operationText.textProperty().bind(calc.pantallaProperty());
	
	}
	
	public GridPane getView() {
		return root;
	}
	
	@FXML
    void onCAction(ActionEvent event) {
		calc.borrar();
    }

    @FXML
    void onCEAction(ActionEvent event) {
    	calc.borrarTodo();
    }

    @FXML
    void onCeroAction(ActionEvent event) {
    	calc.insertar('0');
    }

    @FXML
    void onCincoAction(ActionEvent event) {
    	calc.insertar('5');
    }

    @FXML
    void onCommaAction(ActionEvent event) {
    	calc.insertarComa();
    }

    @FXML
    void onCuatroAction(ActionEvent event) {
    	calc.insertar('4');
    }

    @FXML
    void onDivAction(ActionEvent event) {
    	calc.operar(calc.DIVIDIR);
    }

    @FXML
    void onDosAction(ActionEvent event) {
    	calc.insertar('2');
    }

    @FXML
    void onEqualsAction(ActionEvent event) {
    	calc.operar(calc.IGUAL);
    }

    @FXML
    void onMenosAction(ActionEvent event) {
    	calc.operar(calc.RESTAR);
    }

    @FXML
    void onMultiAction(ActionEvent event) {
    	calc.operar(calc.MULTIPLICAR);
    }

    @FXML
    void onNueveAction(ActionEvent event) {
    	calc.insertar('9');
    }

    @FXML
    void onOchoAction(ActionEvent event) {
    	calc.insertar('8');
    }

    @FXML
    void onSeisAction(ActionEvent event) {
    	calc.insertar('6');
    }

    @FXML
    void onSieteAction(ActionEvent event) {
    	calc.insertar('7');
    }

    @FXML
    void onSumaAction(ActionEvent event) {
    	calc.operar(calc.SUMAR);
    }

    @FXML
    void onTresAction(ActionEvent event) {
    	calc.insertar('3');
    }

    @FXML
    void onUnoAction(ActionEvent event) {
    	calc.insertar('1');
    }

}
