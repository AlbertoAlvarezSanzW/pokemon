package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;



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

    // barras de vida
    @FXML
    public ProgressBar barrapokemon1;
    @FXML
    public ProgressBar barrapokemon2;
    @FXML
    public ProgressBar barrapokemon3;
    @FXML
    public ProgressBar barrapokemon4;
    @FXML
    public ProgressBar barrapokemon5;
    @FXML
    public ProgressBar barrapokemon6;


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

    @FXML
    public Button botonEstadisticas;

    @FXML
    public Button ButtonSiguiente;



    int contro = 0;
    int contro1 = 0;
    int contro2 = 0;
    int contro3 = 0;
    int contro4 = 0;
    int contro5 = 0;

    int option = 0;



    caracteristicas atributos = new caracteristicas("Bulbasaur", "Nv. 17", "/img/Bulbasur.gif", "/img/Bulbasaurespalda.gif", 65, 65, 1.0);
    caracteristicas atributos1 = new caracteristicas("Ductrio", "Nv. 17", "/img/Dugtrio.gif", "/img/Dugtrioespalda.gif", 65, 65, 1.0);
    caracteristicas atributos2 = new caracteristicas("Mew", "Nv. 17", "/img/mew.gif", "/img/Mewespalda.gif", 65, 65, 1.0);
    caracteristicas atributos3 = new caracteristicas("Psyduck", "Nv. 17", "/img/Psyduck.gif", "/img/Psyduckespalda.gif", 65, 65, 1.0);
    caracteristicas atributos4 = new caracteristicas("Charmander", "Nv. 17", "/img/Charmander.gif", "/img/Charmanderespalda.gif", 65, 65, 1.0);
    caracteristicas atributos5 = new caracteristicas("Pikachu", "Nv. 17", "/img/Pikachu.gif", "/img/Pikachuespalda.gif", 65, 65, 1.0);

    //  configurar el Cambio de color         ojo con el ActionEvent...
    // ojo que los pokemon no estan ordenados... xq soy un desastre
    public void initialize() {

        pok1name.setText(atributos.nombre);
        pok1lvl.setText(atributos.lvl);
        pok1hp.setText(atributos.vidaActual + "/" + atributos.vidaTotal);
        img1.setImage(new Image(atributos.url));


        pok2name.setText(atributos1.nombre);
        pok2lvl.setText(atributos1.lvl);
        pok2hp.setText(atributos.vidaActual + "/" + atributos.vidaTotal);
        img2.setImage(new Image(atributos1.url));

        pok3name.setText(atributos2.nombre);
        pok3lvl.setText(atributos2.lvl);
        pok3hp.setText(atributos.vidaActual + "/" + atributos.vidaTotal);
        img3.setImage(new Image(atributos2.url));

        pok4name.setText(atributos3.nombre);
        pok4lvl.setText(atributos3.lvl);
        pok4hp.setText(atributos.vidaActual + "/" + atributos.vidaTotal);
        img4.setImage(new Image(atributos3.url));

        pok5name.setText(atributos4.nombre);
        pok5lvl.setText(atributos4.lvl);
        pok5hp.setText(atributos.vidaActual + "/" + atributos.vidaTotal);
        img5.setImage(new Image(atributos4.url));

        pok6name.setText(atributos5.nombre);
        pok6lvl.setText(atributos5.lvl);
        pok6hp.setText(atributos.vidaActual + "/" + atributos.vidaTotal);
        img6.setImage(new Image(atributos5.url));

    }

    @FXML
    // para quitar a los pokeostias la selección
    // backgrounds por defecto
    public void quitaSeleccion() {
        poke1.setStyle("-fx-background-color: #62b51c;");
        poke2.setStyle("-fx-background-color: #9fa0a0;");
        poke3.setStyle("-fx-background-color: #7249d2;");
        poke4.setStyle("-fx-background-color: #48a0b6;");
        poke5.setStyle("-fx-background-color: #ed452e;");
        poke6.setStyle("-fx-background-color: #edb92e;");
        salirButton.setDisable(true);

    }

    // especificamos cada pokemon con un stylo diferente de background para que este cambie al estar seleccionado
    // vaya cambiando
    // tenemos que tener presente que es un MouseEvent
    @FXML
    public void clickOnPoke1(MouseEvent event) {
        quitaSeleccion();
        poke1.setStyle("-fx-background-color: #b1affc;");
        salirButton.setDisable(false);
        option = 1;

    }

    @FXML
    public void clickOnPoke2(MouseEvent event) {
        quitaSeleccion();
        poke2.setStyle("-fx-background-color: #b1affc;");
        salirButton.setDisable(false);
        option = 2;
    }

    @FXML
    public void clickOnPoke3(MouseEvent event) {
        quitaSeleccion();
        poke3.setStyle("-fx-background-color: #b1affc;");
        salirButton.setDisable(false);
        option = 3;
    }

    @FXML
    public void clickOnPoke4(MouseEvent event) {
        quitaSeleccion();
        poke4.setStyle("-fx-background-color: #b1affc;");
        salirButton.setDisable(false);
        option = 4;
    }

    @FXML
    public void clickOnPoke5(MouseEvent event) {
        quitaSeleccion();
        poke5.setStyle("-fx-background-color: #b1affc;");
        salirButton.setDisable(false);
        option = 5;
    }

    @FXML
    public void clickOnPoke6(MouseEvent event) {
        quitaSeleccion();
        poke6.setStyle("-fx-background-color: #b1affc;");
        salirButton.setDisable(false);
        option = 6;
    }

    @FXML
    private void onButtonAbrirClicked(MouseEvent event) {
        try {
            Stage stage = new Stage();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("sample2.fxml"));
            GridPane root = (GridPane) loader.load();
            Scene scene = new Scene(root, 600, 500);
            stage.setMaxHeight(600);
            stage.setMaxWidth(600);
            stage.setMinHeight(500);
            stage.setMinWidth(500);
            stage.setScene(scene);
            stage.show();

            ControlDos controller = loader.getController();
            controller.mandarInfodesdeVenana1(atributos);
            controller.reenviarinfo(this);


            // menu de pokemons locura
            switch (option) {
                case 1:
                    controller.mandarInfodesdeVenana1(atributos);
                    contro = contro + 1;
                    break;
                case 2:
                    controller.mandarInfodesdeVenana1(atributos1);
                    contro1 = contro1 + 1;
                    break;
                case 3:
                    controller.mandarInfodesdeVenana1(atributos2);
                    contro2 = contro2 + 1;
                    break;
                case 4:
                    controller.mandarInfodesdeVenana1(atributos3);
                    contro3 = contro3 + 1;
                    break;
                case 5:
                    controller.mandarInfodesdeVenana1(atributos4);
                    contro4 = contro4 + 1;
                    break;
                case 6:
                    controller.mandarInfodesdeVenana1(atributos5);
                    contro5 = contro5 + 1;
                    break;
                default:
                    break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void bajarvida(int vidareducida, double progbar) {
        switch (option) {

            case 1:
                if (vidareducida <= 0) {
                    atributos.setVidaActual(0);
                    atributos.setBarra(0);
                    //ButtonSiguiente.setDisable(true);

                } else {
                    atributos.setVidaActual(vidareducida);
                    atributos.setBarra(progbar);
                }

                pok1hp.setText(atributos.vidaActual + "/" + atributos.vidaTotal);
                barrapokemon1.setProgress(atributos.barra);
                break;

            case 2:
                if (vidareducida <= 0) {
                    atributos1.setVidaActual(0);
                    atributos1.setBarra(0);
                    //ButtonSiguiente.setDisable(true);

                } else {
                    atributos1.setVidaActual(vidareducida);
                    atributos1.setBarra(progbar);
                }

                pok2hp.setText(atributos1.vidaActual + "/" + atributos1.vidaTotal);
                barrapokemon2.setProgress(atributos1.barra);
                break;

            case 3:
                if (vidareducida <= 0) {
                    atributos2.setVidaActual(0);
                    atributos2.setBarra(0);
                    //ButtonSiguiente.setDisable(true);

                } else {
                    atributos2.setVidaActual(vidareducida);
                    atributos2.setBarra(progbar);
                }

                pok3hp.setText(atributos2.vidaActual + "/" + atributos2.vidaTotal);
                barrapokemon3.setProgress(atributos2.barra);
                break;

            case 4:
                if (vidareducida <= 0) {
                    atributos3.setVidaActual(0);
                    atributos3.setBarra(0);
                    //ButtonSiguiente.setDisable(true);

                } else {
                    atributos3.setVidaActual(vidareducida);
                    atributos3.setBarra(progbar);
                }

                pok4hp.setText(atributos3.vidaActual + "/" + atributos3.vidaTotal);
                barrapokemon4.setProgress(atributos3.barra);
                break;

            case 5:
                if (vidareducida <= 0) {
                    atributos4.setVidaActual(0);
                    atributos4.setBarra(0);
                    //ButtonSiguiente.setDisable(true);

                } else {
                    atributos4.setVidaActual(vidareducida);
                    atributos4.setBarra(progbar);
                }

                pok5hp.setText(atributos4.vidaActual + "/" + atributos4.vidaTotal);
                barrapokemon5.setProgress(atributos4.barra);
                break;

            case 6:
                if (vidareducida <= 0) {
                    atributos5.setVidaActual(0);
                    atributos5.setBarra(0);
                    //ButtonSiguiente.setDisable(true);

                } else {
                    atributos5.setVidaActual(vidareducida);
                    atributos5.setBarra(progbar);
                }

                pok6hp.setText(atributos5.vidaActual + "/" + atributos5.vidaTotal);
                barrapokemon6.setProgress(atributos5.barra);
                break;
            default:
                break;
        }
    }
    @FXML
    private void botonGraficos(MouseEvent event) {
        try {
            Stage stage = new Stage();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("ControlDaños.fxml"));
            GridPane root = (GridPane) loader.load();
            Scene scene = new Scene(root, 600, 500);
            stage.setMaxHeight(600);
            stage.setMaxWidth(600);
            stage.setMinHeight(500);
            stage.setMinWidth(500);
            stage.setScene(scene);
            stage.show();

            ControlDaño controller3 = loader.getController();

            controller3.controlbarras(this);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }




}

