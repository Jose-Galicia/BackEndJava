package PracticaHarry;

public class Personaje {

    //Caracteristicas
    private String Genero, Nombre, Boggart, Patronus;
    private int Edad;

    public Personaje (String Genero, String Nombre, String Boggart, String Patronus, int Edad){ //Constructor parametrizado
        this.Genero=Genero;
        this.Nombre=Nombre;
        this.Boggart=Boggart;
        this.Patronus=Patronus;
        this.Edad=Edad;
    }

    //Getters
    public String getNombre(){ return Nombre;}
    public String getGenero(){ return Genero;}
    public String getBoggart(){return Boggart;}
    public String getPatronus(){return Patronus;}
    public int getEdad(){return Edad;}

    //Setters

    public boolean setNombre(String Nombre){                            //El boolean es el que retorna un dato
        if (!Nombre.isEmpty()){
            this.Nombre=Nombre;
            return true;
        }else
            return false;
    }

    public boolean setGenero(String Genero){
        if (!Genero.isEmpty()){
            this.Genero=Genero;
            return true;
        }else
            return false;
    }

    public boolean setBoggart(String Boggart){
        if (!Boggart.isEmpty()){
            this.Boggart=Boggart;
            return true;
        }else
            return false;
    }

    public boolean setPatronus(String Patronus){
        if (!Patronus.isEmpty()){
            this.Patronus=Patronus;
            return true;
        }else
            return false;
    }

    public boolean setEdad(int Edad){
        if (Edad>0){
            this.Edad=Edad;
            return true;
        }else
            return false;
    }


    //Metodo que muestra un texto de las caracteristicas de los personajes
    public void ShowMessage(){                      //Metodo que contiene el texto
        String msg = "\nNombre: "+Nombre+
                "\nGenero: "+Genero+
                "\nBoggart: "+Boggart+
                "\nPatronus: "+Patronus+
                "\nEdad: "+Edad+"\n";
        System.out.println(msg);
    }




}
