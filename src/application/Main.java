package application;
	
import java.io.IOException;
import Vista.VistaPrincipal;
import Vista.VistaEdicion;
import application.Main;
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
            FXMLLoader loader = new FXMLLoader(Main.class.getResource("../Vista/VistaPrincipal.fxml"));
            rootPane=(AnchorPane) loader.load();
            Scene scene = new Scene(rootPane);
            stagePrincipal.setTitle("AGENDA");
            stagePrincipal.setScene(scene);
            /*
             * Añadidos las llamadas del main al Controlador y del controlador al main ***/
            VistaPrincipal controller = loader.getController();
            controller.setProgramaPrincipal(this);

            stagePrincipal.show();
        } catch (IOException e) {
            //tratar la excepción.
        }
   }
	 public void mostrarVentanaSecundaria() {
	        try {
	            FXMLLoader loader = new FXMLLoader(Main.class.getResource("../vista/VistaEdicion.fxml"));
	            AnchorPane ventanaDos = (AnchorPane) loader.load();
	            /* Creamos la segunda ventana como otro stage */
	            Stage ventana = new Stage();
	            ventana.setTitle("CONTACTO");
	            /* Le decimos a la ventana quién es la ventana original */
	            ventana.initOwner(stagePrincipal);
	            Scene scene = new Scene(ventanaDos);
	            ventana.setScene(scene);

	            VistaEdicion controller2 = loader.getController();
	            controller2.setStagePrincipal(ventana);

	            ventana.show();

	        } catch (Exception e) {
	            //tratar la excepción
	        }
	    }
	}