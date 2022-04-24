package practicaMona;

public class Empresarial extends Mona{
    public Empresarial(int NoPatas, String colorCu, String Ropa, String ColorCa, String orejasGato, String actividad, String Sexo) {
        super(NoPatas, colorCu, Ropa, ColorCa, orejasGato, actividad, Sexo);
    }

    @Override
    public void ShowMessage() {
        System.out.println("Te haz encontrado con el quinto octocat");
        super.ShowMessage();
    }
}
