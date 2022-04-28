import java.awt.*;

public class EventPresentation extends Evento implements Programa{
    public EventPresentation(int CantidadG, int CantidadC, String NombreEve, String Tematica, String Grupo1, String Grupo2, String Grupo3) {
        super(CantidadG, CantidadC, NombreEve, Tematica, Grupo1, Grupo2, Grupo3);
    }


    @Override
    public void Informacion(Screen s) {

    }

    @Override
    public void Presentacion(Screen s) {
        s.cls();
        s.setVisible(true);                 //Para que se pueda ver
        s.setBackground(Color.DARK_GRAY);
        s.out(EventDescription(), "Helvetiva", 28, Colors.DARK_GRAY);                            //Muestre una salida
        s.showImage("Slipknot.jpg");
        //s.showImage("SK1.gif");
        s.setBounds(760, 200, 500, 500);
        //s.getKeyListeners();
    }

    @Override
    public void Cancion1(Screen s) {

    }

    @Override
    public void Cancion2(Screen s) {

    }

    @Override
    public void Despedida(Screen s) {

    }

    @Override
    public void ArtistProgram(Screen s) throws InterruptedException {

    }
}
