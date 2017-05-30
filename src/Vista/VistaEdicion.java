package Vista;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;


public class VistaEdicion {
	
	@FXML
	private Button Aceptar;
	
	@FXML
	private Button Cancelar;

	private Stage ventana;

	public void setStagePrincipal(Stage ventana) {
		// TODO Auto-generated method stub
		this.ventana = ventana;
	}

	public void closeWindow(){
		this.ventana.close();
	}
}
