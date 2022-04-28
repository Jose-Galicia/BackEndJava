import java.awt.*;

public class Slipknot extends Artista implements Programa{
    public Slipknot( int CantidadC, int Posicion, String Nombre, String Genero) {
        super(CantidadC, Posicion, Nombre, Genero);
    }

    @Override
    public void Informacion(Screen s) {
        s.cls();
        s.setVisible(true);                 //Para que se pueda ver
        s.setBackground(Color.DARK_GRAY);
        s.out(showMessage(), "Helvetiva", 28, Colors.DARK_GRAY);                            //Muestre una salida
        s.showImage("Slipknot.jpg");
        //s.showImage("SK1.gif");
        s.setBounds(760, 200, 500, 500);
        //s.getKeyListeners();
    }

    @Override
    public void Presentacion(Screen s) {
        s.cls();
        s.out("This is Slipknot MOTHERFUCKERS!\n\n", "Helvetica", 28, Colors.DARK_GRAY);
        s.setVisible(true);                 //Para que se pueda ver
        //s.out(showMessage(), "Helvetiva", 28, Colors.DARK_GRAY);                            //Muestre una salida
        s.showImage("Slipknot.jpg");
        s.setBounds(760, 200, 500, 500);
    }

    @Override
    public void Cancion1(Screen s) {
        s.cls();
        s.out("Dead Memories \n\n", "Helvetica", 28, Colors.DARK_GRAY);
        s.setVisible(true);                 //Para que se pueda ver
        //s.out(showMessage(), "Helvetiva", 28, Colors.DARK_GRAY);                            //Muestre una salida
        s.showImage("SK1.gif");
        s.setBounds(760, 200, 500, 500);
    }

    @Override
    public void Cancion2(Screen s) {
        s.cls();
        s.out("Snuff \n\n", "Helvetica", 28, Colors.DARK_GRAY);
        s.setVisible(true);                 //Para que se pueda ver
        //s.out(showMessage(), "Helvetiva", 28, Colors.DARK_GRAY);                            //Muestre una salida
        s.showImage("SK2.gif");
        s.setBounds(760, 200, 500, 500);
    }

    @Override
    public void Despedida(Screen s) {
        s.cls();
        s.out("See you next time Motherfuckers\n\n", "Helvetica", 28, Colors.DARK_GRAY);
        s.setVisible(true);                 //Para que se pueda ver
        //s.out(showMessage(), "Helvetiva", 28, Colors.DARK_GRAY);                            //Muestre una salida
        s.showImage("Slipknot.jpg");
        s.setBounds(760, 200, 500, 500);
    }

    public void ArtistProgram(Screen s) throws InterruptedException{
        Screen screen = new Screen();
        Slipknot SK = new Slipknot(2,1,"Slipknot","Death Metal");

        SK.Informacion(screen);
        Thread.sleep(5000);

        SK.Presentacion(screen);
        Thread.sleep(5000);

        SK.Cancion1(screen);
        Thread.sleep(5000);

        SK.Cancion2(screen);
        Thread.sleep(5000);

        SK.Despedida(screen);
    }
}
