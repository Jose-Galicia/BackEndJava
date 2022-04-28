import java.awt.*;

public class RHCP extends Artista implements Programa{
    public RHCP(int CantidadC, int Posicion, String Nombre, String Genero) {
        super(CantidadC, Posicion, Nombre, Genero);
    }

    @Override
    public void Informacion(Screen s) {
        s.cls();
        s.setVisible(true);                 //Para que se pueda ver
        s.setBackground(Color.DARK_GRAY);
        s.out(showMessage(), "Helvetiva", 28, Colors.DARK_GRAY);                            //Muestre una salida
        s.showImage("RedHotCP.jpg");
        //s.showImage("SK1.gif");
        s.setBounds(760, 200, 500, 500);
        //s.getKeyListeners();
    }

    @Override
    public void Presentacion(Screen s) {
        s.cls();
        s.out("This is Red Hot Chilli Peppers!\n\n", "Helvetica", 28, Colors.DARK_GRAY);
        s.setVisible(true);                 //Para que se pueda ver
        //s.out(showMessage(), "Helvetiva", 28, Colors.DARK_GRAY);                            //Muestre una salida
        s.showImage("RedHotCP.jpg");
        s.setBounds(760, 200, 500, 500);
    }

    @Override
    public void Cancion1(Screen s) {
        s.cls();
        s.out("Otherside \n\n", "Helvetica", 28, Colors.DARK_GRAY);
        s.setVisible(true);                 //Para que se pueda ver
        //s.out(showMessage(), "Helvetiva", 28, Colors.DARK_GRAY);                            //Muestre una salida
        s.showImage("RHCP1.gif");
        s.setBounds(760, 200, 500, 500);
    }

    @Override
    public void Cancion2(Screen s) {
        s.cls();
        s.out("Under The bridge \n\n", "Helvetica", 28, Colors.DARK_GRAY);
        s.setVisible(true);                 //Para que se pueda ver
        //s.out(showMessage(), "Helvetiva", 28, Colors.DARK_GRAY);                            //Muestre una salida
        s.showImage("RHCP2.gif");
        s.setBounds(760, 200, 500, 500);
    }

    @Override
    public void Despedida(Screen s) {
        s.cls();
        s.out("See you next time \n\n", "Helvetica", 28, Colors.DARK_GRAY);
        s.setVisible(true);                 //Para que se pueda ver
        //s.out(showMessage(), "Helvetiva", 28, Colors.DARK_GRAY);                            //Muestre una salida
        s.showImage("RedHotCP.jpg");
        s.setBounds(760, 200, 500, 500);
    }

    @Override
    public void ArtistProgram(Screen s) throws InterruptedException {
        Screen screen = new Screen();
        RHCP RHCP = new RHCP(2,3,"Red Hot Chilli Peppers","Rock");

        RHCP.Informacion(screen);
        Thread.sleep(5000);

        RHCP.Presentacion(screen);
        Thread.sleep(5000);

        RHCP.Cancion1(screen);
        Thread.sleep(5000);

        RHCP.Cancion2(screen);
        Thread.sleep(5000);

        RHCP.Despedida(screen);
    }
}
