public class MilesMorales extends Spiderman implements AtaqueUltimateMorales{
    public MilesMorales(String Nombre, String Universo, String Sexo, int Ataques, String Descripcion) {
        super(Nombre, Universo, Sexo, Ataques, Descripcion);
    }

    @Override
    public void TreparMuros(Screen s) {
        System.out.println("Este Spiderman tiene la capacidad de trepar muros");
        s.setVisible(true);
        s.out(showMessage(), "Helvetiva",8, Colors.BlueHorizon);
        s.showImage("Miles.jpg");
        s.setBounds(200, 100, 1100, 900);
    }

    @Override
    public void SentidoAracnido(Screen s) {
        System.out.println("Este Spiderman tiene sentido aracnido");
        s.setVisible(true);
        s.out(showMessage(), "Helvetiva",8, Colors.BlueHorizon);
        s.showImage("Miles.jpg");
        s.setBounds(200, 100, 1100, 900);
    }

    @Override
    public void SuperFuerza(Screen s) {
        System.out.println("Este spiderman tiene fuerza aumentada");
        s.setVisible(true);
        s.out(showMessage(), "Helvetiva",8, Colors.BlueHorizon);
        s.showImage("Miles.jpg");
        s.setBounds(200, 100, 1100, 900);
    }

    @Override
    public void Camuflaje(Screen s) {
        System.out.println("Este Spiderman puede hacerse invisible");
        s.setVisible(true);
        s.out(showMessage(), "Helvetiva",8, Colors.BlueHorizon);
        s.showImage("Miles.jpg");
        s.setBounds(200, 100, 1100, 900);
    }

    @Override
    public void TelaranasElec(Screen s) {
        System.out.println("Este Spiderman lanza telaranas electricas");
        s.setVisible(true);
        s.out(showMessage(), "Helvetiva",8, Colors.BlueHorizon);
        s.showImage("Miles.jpg");
        s.setBounds(200, 100, 1100, 900);
    }
}
