package practicaMona;

public class Super extends Mona{
    public Super(int NoPatas, String colorCu, String Ropa, String ColorCa, String orejasGato, String actividad, String Sexo) {
        super(NoPatas, colorCu, Ropa, ColorCa, orejasGato, actividad, Sexo);
    }

    @Override
    public void ShowMessage() {
        System.out.println("te haz encontrado con el sexto octocat");
        super.ShowMessage();
    }
}
