public class Spiderman {
    private String Nombre, Universo, Sexo, Descripcion;
    int Ataques;

    public Spiderman(String Nombre, String Universo, String Sexo, int Ataques, String Descripcion){
        this.Nombre=Nombre;
        this.Universo=Universo;
        this.Sexo=Sexo;
        this.Ataques=Ataques;
        this.Descripcion=Descripcion;
    }

    public String showMessage(){
        return
                "\nUniverso: "+Universo+
                        "\nNombre: "+Nombre+
                        "\nSexo: "+Sexo+
                        "\nAtaques: "+Ataques+
                        "\nDescripcion: "+Descripcion+"\n";
    }

    public void ShowMessage(){                      //Metodo que contiene el texto
        String msg = "\nNombre: "+Nombre+
                "\nGenero: "+Sexo+
                "\nUniverso: "+Universo+
                "\nHabilidades: "+Ataques+
                "\nDescripcion: "+Descripcion+"\n";
        System.out.println(msg);
    }
}
