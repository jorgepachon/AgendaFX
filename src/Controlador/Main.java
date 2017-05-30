package Controlador;
	
import java.io.IOException;
import Vista.TablaControlador;
import Vista.VistaVentanaDos;
import Vista.VistaVentanaDos;
import Controlador.Main;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	
	private static Stage stagePrincipal;
    private AnchorPane rootPane;
	
	
	 @Override
	    public void start(Stage stagePrincipal) throws Exception {
	        Main.stagePrincipal = stagePrincipal;
	        mostrarVentanaPrincipal();

	    }
	
	public static void main(String[] args) {
		launch(args);
	}
	
	public void mostrarVentanaPrincipal() {
        try {
            FXMLLoader loader = new FXMLLoader(Main.class.getResource("../Vista/Tabla.fxml"));
            rootPane=(AnchorPane) loader.load();
            Scene scene = new Scene(rootPane);
            stagePrincipal.setTitle("Ventana Principal");
            stagePrincipal.setScene(scene);
            /*
             * Añadidos las llamadas del main al Controlador y del controlador al main ***/
            TablaControlador controller = loader.getController();
            controller.setTablaControlador(this);

            stagePrincipal.show();
        } catch (IOException e) {
            //tratar la excepción.
        }
   }
	 public void mostrarVentanaSecundaria() {
	        try {
	            FXMLLoader loader = new FXMLLoader(Main.class.getResource("../vista/VistaVentanaDos.fxml"));
	            AnchorPane ventanaDos = (AnchorPane) loader.load();
	            /* Creamos la segunda ventana como otro stage */
	            Stage ventana = new Stage();
	            ventana.setTitle("Ventana Dos");
	            /* Le decimos a la ventana quién es la ventana original */
	            ventana.initOwner(stagePrincipal);
	            Scene scene = new Scene(ventanaDos);
	            ventana.setScene(scene);

	            VistaVentanaDos controller2 = loader.getController();
	            controller2.setStagePrincipal(ventana);

	            ventana.show();

	        } catch (Exception e) {
	            //tratar la excepción
	        }
	    }
	}