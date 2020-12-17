package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;


public class Controller {

    @FXML
    public VBox poke1;
    @FXML
    public Label pok1name;
    @FXML
    public Label pok1lvl;

// 1º vamos a configurar el Cambio de color         ojo con el ActionEvent...
    public void initialize(){
        caracteristicas atributos = new caracteristicas("name","nivel","100");
        pok1name.setText(atributos.nombre);
        pok1lvl.setText(atributos.lvl);
    }

    public void clickOnPoke1(ActionEvent event){
        poke1.setStyle("-fx-background-color: #e0ff00");
    }






}
