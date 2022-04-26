public class Main {
    private int Paginas;
    private String Descripcion, Titulo, Genero, Autor;

    public Main (int Paginas, String Descripcion, String Titulo, String Genero, String Autor){
        this.Paginas=Paginas;
        this.Descripcion=Descripcion;
        this.Titulo=Titulo;
        this.Genero=Genero;
        this.Autor=Autor;
    }

    public String showMessage(){
        return
                "Titulo: "+Titulo+
                        "\nGenero: "+Genero+
                        "\nPaginas: "+Paginas+
                        "\nAutor: "+Autor+
                        "\nDescripcion: "+Descripcion+"\n";
    }

    public String showText(){
        return
                "Suceso: "+Descripcion + "\n";
    }


}
