public class Artista {
    private int CantidadC, Posicion;
    private String Nombre, Genero;

    public Artista(int CantidadC, int Posicion, String Nombre, String Genero){
        this.CantidadC=CantidadC;
        this.Posicion=Posicion;
        this.Nombre=Nombre;
        this.Genero=Genero;
    }

    public String showMessage() {
        return
                "Artista: " + Nombre +
                        "\nGenero: " + Genero +
                        "\nCanciones: " + CantidadC +
                        "\nPosicion: " + Posicion + "\n";
    }

}
