package sample;




import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.chart.*;


public class ControlDaño {

    /*
    basicamente la misma cantinella de siempre, especificamos dentro de un grid las siguientes id's
    BarChart
    CategoryAxis
    3NumberAxis
    PieChart

    que son los graficos de barras que vamos a implementar.
     */

    @FXML
    public BarChart idbarchart;

    @FXML
    public CategoryAxis EjeX;

    @FXML
    public NumberAxis ejeY;

    @FXML
    public PieChart idchart;

    // creamos 2 variables estaticas las cuales vamos a jugar con sus valores, dependiendo de la elección

    public static int dañorecibido = 0;

    public static int dañoinfligido = 0;

    @FXML
    public void initialize() {


        //(dañomio/dañototal)*100
        ObservableList<PieChart.Data> pieData
                = FXCollections.observableArrayList(
                new PieChart.Data("DañoMio",dañorecibido),
                new PieChart.Data("DañoSuyo",dañoinfligido)
        );

        idchart.setData(pieData);
    }
    @FXML
    public static void dañito(int dañometido, int dañopillado){

        dañoinfligido = dañoinfligido + dañometido;
        dañorecibido = dañorecibido + dañopillado;
        ObservableList<PieChart.Data> pieData
                = FXCollections.observableArrayList(
                new PieChart.Data("DañoMio",dañorecibido),
                new PieChart.Data("DañoSuyo",dañoinfligido)
        );
    }

    // XYChart.Series pokemon1 = new XYChart.Series<>(); esto es para crear una barra de eje X y eje Y

    public void controlbarras(Controller controlito1){
        XYChart.Series pokemon1 = new XYChart.Series<>();
        pokemon1.setName(controlito1.atributos.nombre);
        pokemon1.getData().add(new XYChart.Data("",controlito1.contro));
        idbarchart.getData().addAll(pokemon1);

        XYChart.Series pokemon2 = new XYChart.Series<>();
        pokemon2.setName(controlito1.atributos1.nombre);
        pokemon2.getData().add(new XYChart.Data("",controlito1.contro1));
        idbarchart.getData().addAll(pokemon2);

        XYChart.Series pokemon3 = new XYChart.Series<>();
        pokemon3.setName(controlito1.atributos2.nombre);
        pokemon3.getData().add(new XYChart.Data("",controlito1.contro2));
        idbarchart.getData().addAll(pokemon3);

        XYChart.Series pokemon4 = new XYChart.Series<>();
        pokemon4.setName(controlito1.atributos3.nombre);
        pokemon4.getData().add(new XYChart.Data("",controlito1.contro3));
        idbarchart.getData().addAll(pokemon4);

        XYChart.Series pokemon5 = new XYChart.Series<>();
        pokemon5.setName(controlito1.atributos4.nombre);
        pokemon5.getData().add(new XYChart.Data("",controlito1.contro4));
        idbarchart.getData().addAll(pokemon5);

        XYChart.Series pokemon6 = new XYChart.Series<>();
        pokemon6.setName(controlito1.atributos5.nombre);
        pokemon6.getData().add(new XYChart.Data("",controlito1.contro5));
        idbarchart.getData().addAll(pokemon6);
    }



}
