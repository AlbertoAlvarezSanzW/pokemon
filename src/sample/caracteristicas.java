package sample;

public class caracteristicas {

    String nombre;
    String lvl;
    int vidaTotal;
    int vidaActual;
    String url;
    String espaldasPokemon;
    double barra;

    // creamos un constructor a mano.... VIVA EL ECLIPSE

    // este es nuestro constructor de nuestro principal pokemos (Controller 1) <--
    caracteristicas(String nombre, String lvl, String url, String espaldasPokemon, int vidaActual, int vidaTotal, double barra){
        this.nombre=nombre;
        this.lvl = lvl;
        this.vidaActual = vidaActual;
        this.vidaTotal = vidaTotal;
        this.barra = barra;
        this.url = url;
        this.espaldasPokemon = espaldasPokemon;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLvl() {
        return lvl;
    }

    public void setLvl(String lvl) {
        this.lvl = lvl;
    }

    public int getVidaTotal() {
        return vidaTotal;
    }

    public void setVidaTotal(int vidaTotal) {
        this.vidaTotal = vidaTotal;
    }

    public int getVidaActual() {
        return vidaActual;
    }

    public void setVidaActual(int vidaActual) {
        this.vidaActual = vidaActual;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getEspaldasPokemon() {
        return espaldasPokemon;
    }

    public void setEspaldasPokemon(String espaldasPokemon) {
        this.espaldasPokemon = espaldasPokemon;
    }

    public double getBarra() {
        return barra;
    }

    public void setBarra(double barra) {
        this.barra = barra;
    }
}
