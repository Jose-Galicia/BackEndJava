package practicaMona;

import java.util.Scanner;

public class Correr {
    public static void main(String[] args) {
        funcion();
    }

    private static void funcion(){
        Normal octo1= new Normal(8,"Negro","Sin ropa","Crema","Las muestra", "Sin actividad", "No definido");
        PirataEspacial octo2= new PirataEspacial(8,"Negro","Traje espacial","Gris claro","No muestra las orejas", "Piarata espacial", "No definido");
        Cantante octo3= new Cantante(8,"Gris oscuro","Traje","Crema","Tiene pelo y muestra las orejas","Cantante","Masculino");
        Playera octo4= new Playera(8,"Azul","Tipo playero","Crema","Tiene pelo y muestra las orejas","Octacat Playera","Femenino");
        Empresarial octo5=new Empresarial(8,"Negro","Formal","Crema","Tiene pelo y muestra las orejas","Empresario","Masculino");
        Super octo6=new Super(8,"Negro","Superheroina","Crema","Tiene pelo y muestra las orejas","Heroina","Femenino");

        //octo2.Message();
        //octo2.ShowMessage();
        //octo3.ShowMessage();
        //octo4.ShowMessage();
        //octo5.ShowMessage();
        //octo6.ShowMessage();

        Scanner leer = new Scanner(System.in);
        //Menu para escoger los datos de los personajes
        int opcion;
        do {                    //Este do while nos permite que al escoger un personaje no salga del programa hasta que se seleccione salir
            do {
                System.out.println("\nElige que personaje quieres ver sus caracteristicas");
                System.out.println("1. Normal");
                System.out.println("2. Pirata espacial");
                System.out.println("3. Cantante");
                System.out.println("4. Playera");
                System.out.println("5. Empresarial");
                System.out.println("6. Superheroina");
                System.out.println("7. Salir");
                opcion = leer.nextInt();
            } while (opcion < 1 || opcion > 7);
            switch (opcion) {
                case 1 -> octo1.ShowMessage();
                case 2 -> octo2.ShowMessage();
                case 3 -> octo3.ShowMessage();
                case 4 -> octo4.ShowMessage();
                case 5 -> octo5.ShowMessage();
                case 6 -> octo6.ShowMessage();
                case 7 -> System.exit(0);
            }
        }while (opcion!=7);
    }

}
