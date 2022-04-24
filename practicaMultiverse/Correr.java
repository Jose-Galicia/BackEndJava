public class Correr {
    public static void main(String[] args) {
        funcion();
    }

    private static void funcion(){              //Metodo estatico
        PeterParker Peter = new PeterParker("Peter Parker","Ultimate","Masculino", 3,"Mordido por arana");
        MilesMorales Miles = new MilesMorales("Miles Morales","Ultimate","Masculino",5,"Perteneces al universo Ultimate, es el sucesor de Peter");
        GwenStacy Gwen = new GwenStacy("Gwen Styce","Tierra-65","Femenino",3,"Mordida por una arana");
        Screen screen = new Screen();
        Dialog d = new Dialog();
        String str;


        screen.out("Bienvenido al menu de Spiderman", "Helvetica", 28, Colors.Desire);
        screen.setVisible(true);
        str = d.readString("Selecciona uno para ver su informacion  P/G/M");   //La cadena de texto se almacena en la variable str
        if (str.charAt(0) == 'P' || str.charAt(0) == 'p') {             //Obligatorio el uso de '' en este comando
            Peter.TreparMuros(screen);
            Peter.SentidoAracnido(screen);
            Peter.SuperFuerza(screen);
        }else if (str.charAt(0)=='G'||str.charAt(0)=='g') {
            Gwen.TreparMuros(screen);
            Gwen.SuperFuerza(screen);
            Gwen.SentidoAracnido(screen);
        }else if (str.charAt(0)=='M'||str.charAt(0)=='m') {
            System.out.println("Miles morales");
            Miles.SentidoAracnido(screen);
            Miles.SuperFuerza(screen);
            Miles.TreparMuros(screen);
            Miles.TelaranasElec(screen);
            Miles.Camuflaje(screen);
        }else
            screen.out("Tal vez en otro momento", "Century Schoolbook L", 28, Colors.YELLOW);

        //Peter.ShowMessage();
    }
}
