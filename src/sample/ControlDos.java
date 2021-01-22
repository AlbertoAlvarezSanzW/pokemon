package sample;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

import java.awt.event.ActionEvent;
import java.util.Optional;
import java.util.Random;


public class ControlDos {

    Controller contro;

    @FXML
    public ImageView img7;
    @FXML
    public ImageView img8;

    // definir los nuevos label
    @FXML
    public Label nombrePokemon;
    @FXML
    public Label nivelPokemon;
    @FXML
    public Label nombreRival;
    @FXML
    public Label lvlRival;

    //definimos las barras
    @FXML
    public ProgressBar barrarival;
    @FXML
    public ProgressBar barravida;

    //definimos los botones
    @FXML
    public Button cancel;
    @FXML
    public Button atacar;
    @FXML
    public Button muyarriesgado;
    @FXML
    public Button arriesgado;
    @FXML
    public Button seguro;
    @FXML
    public Button curar;

    @FXML
    public Label controldevidas;


    @FXML
    public GridPane botonesAtaque;

    // vamos a crear 1 auxiliar
    caracteristicas aux;


    caracteristicas pokemonRival = new caracteristicas("Onix", "Nv. 67", "/img/Onix.gif","",160,160,1.0);

    public void initialize() {


        nombreRival.setText(pokemonRival.nombre);
        lvlRival.setText(pokemonRival.lvl);
        img7.setImage(new Image(pokemonRival.url));
        funcionCancel();

    }

    public void funcionAtacar(){
        botonesAtaque.setDisable(false);
        botonesAtaque.setVisible(true);

    }

    public void funcionCancel(){
        botonesAtaque.setDisable(true);
        botonesAtaque.setVisible(false);
    }






    public void mandarInfodesdeVenana1(caracteristicas pasarInfo){

        barravida.setProgress(pasarInfo.barra);
        nombrePokemon.setText(pasarInfo.nombre);
        nivelPokemon.setText(pasarInfo.lvl);
        img8.setImage(new Image(pasarInfo.espaldasPokemon));
        controldevidas.setText(pasarInfo.vidaActual+"/"+ pasarInfo.vidaTotal);
        aux=pasarInfo;



    }
    // callback j3j3
    public void reenviarinfo(Controller contro){
        this.contro=contro;
    }

    // aqui viene lo bueno...
    public void ataqueSeguro(){
        int vidaAuxiliar = aux.getVidaActual()-20;
        double barraAuxiliar = (vidaAuxiliar*100/aux.getVidaTotal());
        aux.setVidaActual(vidaAuxiliar);
        controldevidas.setText(aux.vidaActual+"/"+aux.vidaTotal);
        barravida.setProgress(barraAuxiliar/100);
        int vidaAuxiliarRival = pokemonRival.getVidaActual()-20;
        double barraAuxiliarRival = (vidaAuxiliarRival*100/pokemonRival.getVidaTotal());
        pokemonRival.setVidaActual(vidaAuxiliarRival);
        barrarival.setProgress(barraAuxiliarRival/100);

        if(aux.getVidaActual()<=0){
            controldevidas.setText("0 / "+aux.vidaTotal);
            aux.setVidaActual(0);
            barravida.setProgress(0);
        }
        if(pokemonRival.getVidaActual()<=0){
            pokemonRival.setVidaActual(0);
            barrarival.setProgress(0);
        }
        contro.bajarvida(aux.getVidaActual(),barraAuxiliar/100);
        muerto(pokemonRival,aux);
    }

    public void Curar(){
        Random curar = new Random();
        int vidaAuxiliar = aux.getVidaActual()+(curar.nextInt(75-25+1)+25);
        double barraAuxiliar = (vidaAuxiliar*100/aux.getVidaTotal());
        aux.setVidaActual(vidaAuxiliar);
        controldevidas.setText(aux.vidaActual+"/"+aux.vidaTotal);
        barravida.setProgress(barraAuxiliar/100);
        int vidaAuxiliarRival = pokemonRival.getVidaActual()+ (curar.nextInt(75-25+1)+25);
        double barraAuxiliarRival = (vidaAuxiliarRival*100/pokemonRival.getVidaTotal());
        pokemonRival.setVidaActual(vidaAuxiliarRival);
        barrarival.setProgress(barraAuxiliarRival/100);

        if(aux.getVidaActual()>aux.getVidaTotal()){
            controldevidas.setText(aux.getVidaTotal()+" / "+aux.vidaTotal);
            aux.setVidaActual(aux.getVidaTotal());
            barravida.setProgress(1.0);
            barraAuxiliar = 100;
        }
        if(pokemonRival.getVidaActual()>pokemonRival.getVidaTotal()){
            pokemonRival.setVidaActual(pokemonRival.getVidaTotal());
            barrarival.setProgress(1.0);
        }
        contro.bajarvida(aux.getVidaActual(),barraAuxiliar/100);
    }

    public void arriesgado(){
        Random curar = new Random();
        int vidaAuxiliar = aux.getVidaActual()-(curar.nextInt(25-10+1)+10);
        double barraAuxiliar = (vidaAuxiliar*100/aux.getVidaTotal());
        aux.setVidaActual(vidaAuxiliar);
        controldevidas.setText(aux.vidaActual+"/"+aux.vidaTotal);
        barravida.setProgress(barraAuxiliar/100);
        int vidaAuxiliarRival = pokemonRival.getVidaActual()-(curar.nextInt(25-10+1)+10);
        double barraAuxiliarRival = (vidaAuxiliarRival*100/pokemonRival.getVidaTotal());
        pokemonRival.setVidaActual(vidaAuxiliarRival);
        barrarival.setProgress(barraAuxiliarRival/100);

        if(aux.getVidaActual()<=0){
            controldevidas.setText("0 / "+aux.vidaTotal);
            aux.setVidaActual(0);
            barravida.setProgress(0);
        }
        if(pokemonRival.getVidaActual()<=0){
            pokemonRival.setVidaActual(0);
            barrarival.setProgress(0);
        }
        contro.bajarvida(aux.getVidaActual(),barraAuxiliar/100);
        muerto(pokemonRival,aux);
    }

    public void muyarriesgado(){
        Random curar = new Random();
        int vidaAuxiliar = aux.getVidaActual()-(curar.nextInt(50-0+1)+0);
        double barraAuxiliar = (vidaAuxiliar*100/aux.getVidaTotal());
        aux.setVidaActual(vidaAuxiliar);
        controldevidas.setText(aux.vidaActual+"/"+aux.vidaTotal);
        barravida.setProgress(barraAuxiliar/100);
        int vidaAuxiliarRival = pokemonRival.getVidaActual()-(curar.nextInt(50-0+1)+0);
        double barraAuxiliarRival = (vidaAuxiliarRival*100/pokemonRival.getVidaTotal());
        pokemonRival.setVidaActual(vidaAuxiliarRival);
        barrarival.setProgress(barraAuxiliarRival/100);

        if(aux.getVidaActual()<=0){
            controldevidas.setText("0 / "+aux.vidaTotal);
            aux.setVidaActual(0);
            barravida.setProgress(0);
        }
        if(pokemonRival.getVidaActual()<=0){
            pokemonRival.setVidaActual(0);
            barrarival.setProgress(0);
        }
        contro.bajarvida(aux.getVidaActual(),barraAuxiliar/100);
        muerto(pokemonRival,aux);
    }

    public void muerto(caracteristicas pokemonrival, caracteristicas aux) {
        if (pokemonrival.vidaActual==0){
            Alert alerta = new Alert(Alert.AlertType.CONFIRMATION);
            alerta.setTitle("¡¡¡¡¡¡¡¡ La batalla ha finalizado !!!!!!!");
            alerta.setContentText("El pokemon rival esta destrozado!");
            alerta.setHeaderText("¡ YOU WON !");
            alerta.setGraphic(new ImageView (this.getClass().getResource(pokemonrival.url).toString()));
            Optional<ButtonType> resultado = alerta.showAndWait();
            if(resultado.isEmpty()){
                System.out.println("Lo ha cerrado");
            }else{
                if (resultado.get() == ButtonType.OK){
                    System.out.println("¿Continuar?");

                }
            }
        }
        if (aux.vidaActual==0){
            Alert alerta2 = new Alert(Alert.AlertType.CONFIRMATION);
            alerta2.setTitle("Battle Finished");
            alerta2.setContentText("El pokemon te ha reventado... lo mismo es que eres malo con ganas !");
            alerta2.setHeaderText("You loose...");
            alerta2.setGraphic(new ImageView (this.getClass().getResource(aux.url).toString()));
            Optional<ButtonType> resultado = alerta2.showAndWait();
            if(resultado.isEmpty()){
                System.out.println("Lo ha cerrado");
            }else{
                if (resultado.get() == ButtonType.OK){
                    System.out.println("¿Continuar?");

                }
            }
        }
    }
}



