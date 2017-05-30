package Vista;
import java.net.URL;
import java.util.ResourceBundle;
import application.Main;
import Controlador.Persona;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class VistaPrincipal implements Initializable {
	 private  Main ProgramaPrincipal;

	    @FXML
	    private Button nuevo;
	    @FXML
	    private Button modificar;
	    @FXML
	    private Button eliminar;
	    @FXML
		private TableView<Persona> Tabla;

		@FXML
		private TableColumn<Persona,String> ColNombre;

		@FXML
		private TableColumn<Persona,String> ColApellido;
		
		@FXML
		private TableColumn<Persona,String> ColTelefono;

	    public void setProgramaPrincipal(Main ProgramaPrincipal) {
	        this.ProgramaPrincipal = ProgramaPrincipal;
	    }
	    
	    private final ObservableList<Persona> data = FXCollections.observableArrayList(
				new Persona("David", "Perez", "655255899"),
				new Persona("Pedro", "Camacho", "688755255"));

		public void initialize(){
			Tabla.setItems(this.data);
			ColNombre.setCellValueFactory(new PropertyValueFactory<Persona,String>("Nombre"));
			ColApellido.setCellValueFactory(new PropertyValueFactory<Persona,String>("Apellido"));
			ColTelefono.setCellValueFactory(new PropertyValueFactory<Persona,String>("Telefono"));
		}

	    @Override
	    public void initialize(URL url, ResourceBundle rb) {
	        // TODO
	    }

	    /* Cuando se pulsa el botón tendrá que abrir ventana nueva
	     * para eso llama al método del main */
	    @FXML
	    private void nuevaVentana() {
	       	this.ProgramaPrincipal.mostrarVentanaSecundaria();
	    }
}
