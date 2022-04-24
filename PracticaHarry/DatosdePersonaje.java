package PracticaHarry;

import java.util.Scanner;

public class DatosdePersonaje {
    public static void main(String[] args) {
        funcion();
    }

    public static void funcion(){
        Personaje Harry = new Personaje("Masculino", "Harry Potter", "Dementor", "Ciervo", 25);     //Por el constructor parametrizado debemos ingresar los parametros del objeto aqui
        Personaje Hermione = new Personaje("Femenino", "Hermione Granger", "Fracaso","Nutria", 24);
        Personaje Ron = new Personaje("Masculino", "Ron Wesley", "Arana", "Terrier", 26);
        Personaje Snape = new Personaje("Maculino", "Severus Snape","Voldemort", "Cierva",38);
        Personaje Dumbledore = new Personaje("Masculino", "Albus Dumbledore","Hermana", "Fenix", 116);



        Scanner leer = new Scanner(System.in);
        //Menu para escoger los datos de los personajes
        int opcion;
        do {                    //Este do while nos permite que al escoger un personaje no salga del programa hasta que se seleccione salir
            do {
                System.out.println("Elige que personaje quieres ver sus caracteristicas");
                System.out.println("1. Harry");
                System.out.println("2. Hermione");
                System.out.println("3. Ron");
                System.out.println("4. Snape");
                System.out.println("5. Dumbledore");
                System.out.println("6. Salir");
                opcion = leer.nextInt();
            } while (opcion < 1 || opcion > 6);
            switch (opcion) {
                case 1:
                    Harry.ShowMessage();
                    break;
                case 2:
                    Hermione.ShowMessage();
                    break;
                case 3:
                    Ron.ShowMessage();
                    break;
                case 4:
                    Snape.ShowMessage();
                    break;
                case 5:
                    Dumbledore.ShowMessage();
                    break;
                case 6:
                    System.exit(0);
                    break;
            }
        }while (opcion!=6);




    }
}
