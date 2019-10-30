package dad.javafx.calculadoraFXML;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class CalculadoraFXMLApp extends Application {
	
	private CalculadoraFXMLController controller;	
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		controller = new CalculadoraFXMLController();
		
		Scene scene= new Scene(controller.getView(),320,200);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Calculadora");
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
