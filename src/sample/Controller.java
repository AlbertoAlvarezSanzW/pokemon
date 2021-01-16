package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;


public class Controller {
    @FXML
    public Button salirButton;

    @FXML
    public VBox poke1;
    @FXML
    public Label pok1name;
    @FXML
    public Label pok1lvl;
    @FXML
    public Label pok1hp;


    @FXML
    public VBox poke2;
    @FXML
    public Label pok2name;
    @FXML
    public Label pok2lvl;
    @FXML
    public Label pok2hp;


    @FXML
    public VBox poke3;
    @FXML
    public Label pok3name;
    @FXML
    public Label pok3lvl;
    @FXML
    public Label pok3hp;


    @FXML
    public VBox poke4;
    @FXML
    public Label pok4name;
    @FXML
    public Label pok4lvl;
    @FXML
    public Label pok4hp;


    @FXML
    public VBox poke5;
    @FXML
    public Label pok5name;
    @FXML
    public Label pok5lvl;
    @FXML
    public Label pok5hp;


    @FXML
    public VBox poke6;
    @FXML
    public Label pok6name;
    @FXML
    public Label pok6lvl;
    @FXML
    public Label pok6hp;

    @FXML
    public GridPane Principal;

    //creación img
    @FXML
    public ImageView img1;
    @FXML
    public ImageView img2;
    @FXML
    public ImageView img3;
    @FXML
    public ImageView img4;
    @FXML
    public ImageView img5;
    @FXML
    public ImageView img6;





    public void salirButton(MouseEvent event){

        Principal.setStyle("-fx-background-color: #ff0000;");
        salirButton.setText("Siguiente");
    }


//  configurar el Cambio de color         ojo con el ActionEvent...
    // ojo que los pokemon no estan ordenados... xq soy un desastre
    public void initialize(){
        caracteristicas atributos = new caracteristicas("Bulbasaur","Nv. 17","65/65", "/img/Bulbasur.gif");
        pok1name.setText(atributos.nombre);
        pok1lvl.setText(atributos.lvl);
        pok1hp.setText(atributos.hp);
        img1.setImage(new Image(atributos.url));


        caracteristicas atributos1 = new caracteristicas("Ductrio","Nv. 17","65/65", "/img/Dugtrio.gif");
        pok2name.setText(atributos1.nombre);
        pok2lvl.setText(atributos1.lvl);
        pok2hp.setText(atributos1.hp);
        img2.setImage(new Image(atributos1.url));


        caracteristicas atributos2 = new caracteristicas("Mew","Nv. 17","65/65", "/img/mew.gif");
        pok3name.setText(atributos2.nombre);
        pok3lvl.setText(atributos2.lvl);
        pok3hp.setText(atributos2.hp);
        img3.setImage(new Image(atributos2.url));

        caracteristicas atributos3 = new caracteristicas("Psyduck","Nv. 17","65/65", "img/Psyduck.gif");
        pok4name.setText(atributos3.nombre);
        pok4lvl.setText(atributos3.lvl);
        pok4hp.setText(atributos3.hp);
        img4.setImage(new Image(atributos3.url));

        caracteristicas atributos4 = new caracteristicas("Charmander","Nv. 17","65/65", "img/Charmander.gif");
        pok5name.setText(atributos4.nombre);
        pok5lvl.setText(atributos4.lvl);
        pok5hp.setText(atributos4.hp);
        img5.setImage(new Image(atributos4.url));

        caracteristicas atributos5 = new caracteristicas("Pikachu","Nv. 17","65/65", "img/Pikachu.gif");
        pok6name.setText(atributos5.nombre);
        pok6lvl.setText(atributos5.lvl);
        pok6hp.setText(atributos5.hp);
        img6.setImage(new Image(atributos5.url));


    }

    @FXML
    // para quitar a los pokeostias la selección
    public void quitaSeleccion(){
        poke1.setStyle("-fx-background-color: #62b51c;");
        poke2.setStyle("-fx-background-color: #9fa0a0;");
        poke3.setStyle("-fx-background-color: #7249d2;");
        poke4.setStyle("-fx-background-color: #48a0b6;");
        poke5.setStyle("-fx-background-color: #ed452e;");
        poke6.setStyle("-fx-background-color: #edb92e;");
        salirButton.setDisable(true);

    }

    @FXML
    public void clickOnPoke1(MouseEvent event){
        quitaSeleccion();
        poke1.setStyle("-fx-background-color: #b1affc;");
        salirButton.setDisable(false);
    }

    @FXML
    public void clickOnPoke2(MouseEvent event){
        quitaSeleccion();
        poke2.setStyle("-fx-background-color: #b1affc;");
        salirButton.setDisable(false);
    }

    @FXML
    public void clickOnPoke3(MouseEvent event){
        quitaSeleccion();
        poke3.setStyle("-fx-background-color: #b1affc;");
        salirButton.setDisable(false);
    }

    @FXML
    public void clickOnPoke4(MouseEvent event){
        quitaSeleccion();
        poke4.setStyle("-fx-background-color: #b1affc;");
        salirButton.setDisable(false);
    }

    @FXML
    public void clickOnPoke5(MouseEvent event){
        quitaSeleccion();
        poke5.setStyle("-fx-background-color: #b1affc;");
        salirButton.setDisable(false);
    }

    @FXML
    public void clickOnPoke6(MouseEvent event){
        quitaSeleccion();
        poke6.setStyle("-fx-background-color: #b1affc;");
        salirButton.setDisable(false);
    }
















}
