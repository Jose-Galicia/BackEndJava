package practicaMona;

public class PirataEspacial extends Mona{
    public PirataEspacial(int NoPatas, String colorCu, String Ropa, String ColorCa, String orejasGato, String actividad, String Sexo) {
        super(NoPatas, colorCu, Ropa, ColorCa, orejasGato, actividad, Sexo);
    }

    /*public void Message (){
        System.out.println("te haz encontrado con el segundo octocat");
    }*/

    @Override
    public void ShowMessage() {
        System.out.println("te haz encontrado con el segundoa octocat");
        super.ShowMessage();
    }
}
