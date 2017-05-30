package Vista;

import javafx.collections.FXCollections;

import java.awt.Button;
import java.net.URL;
import java.util.ResourceBundle;

import Controlador.Main;
import Controlador.Persona;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class TablaControlador implements Initializable {
	
	private  Main ProgramaPrincipal;
	@FXML
	private TableView<Persona> Tabla;

	@FXML
	private TableColumn<Persona,String> ColName;

	@FXML
	private TableColumn<Persona,String> ColApellido;
	
	@FXML
	private TableColumn<Persona,String> ColTelefono;
	
	@FXML
	private Button nuevo;
	
	@FXML
	private Button editar;
	
	@FXML
	private Button borrar;
	
	public void setTablaControlador(Main ProgramaPrincipal){
		this.ProgramaPrincipal = ProgramaPrincipal;
	}
	
	 @Override
	    public void initialize(URL url, ResourceBundle rb) {
	        // TODO
	    }
	 
	 @FXML
	    private void nuevaVentana() {
	       	this.ProgramaPrincipal.mostrarVentanaSecundaria();
	    }
	}


