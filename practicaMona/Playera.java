package practicaMona;

public class Playera extends Mona{
    public Playera(int NoPatas, String colorCu, String Ropa, String ColorCa, String orejasGato, String actividad, String Sexo) {
        super(NoPatas, colorCu, Ropa, ColorCa, orejasGato, actividad, Sexo);
    }

    @Override
    public void ShowMessage() {
        System.out.println("te haz encontrado con el cuarto octocat");
        super.ShowMessage();
    }
}
