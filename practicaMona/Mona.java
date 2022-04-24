package practicaMona;

public class Mona {

    private String colorCu, Ropa, ColorCa, orejasGato, actividad, Sexo;
    private int NoPatas;

    public Mona (int NoPatas, String colorCu, String Ropa, String ColorCa, String orejasGato, String actividad, String Sexo){
        this.Sexo=Sexo;
        this.NoPatas=NoPatas;
        this.colorCu=colorCu;
        this.Ropa=Ropa;
        this.actividad=actividad;
        this.ColorCa=ColorCa;
        this.orejasGato=orejasGato;
    }

    //Metodo que muestra un texto de las caracteristicas de los personajes
    public void ShowMessage(){                      //Metodo que contiene el texto
        String msg = "Actividad: "+actividad+
                "\nGenero: "+Sexo+
                "\nNumero de patas: "+NoPatas+
                "\nColor del cuerpo: "+colorCu+
                "\nColor de cara : "+ColorCa+
                "\nRopa: "+Ropa+
                "\nMuestra las orejas: "+orejasGato;
        System.out.println(msg);
    }

}
