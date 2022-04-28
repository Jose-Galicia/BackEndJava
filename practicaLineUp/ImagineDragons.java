import java.awt.*;

public class ImagineDragons extends Artista implements Programa{
    public ImagineDragons(int CantidadC, int Posicion, String Nombre, String Genero) {
        super(CantidadC, Posicion, Nombre, Genero);
    }

    @Override
    public void Informacion(Screen s) {
        s.cls();
        s.setVisible(true);                 //Para que se pueda ver
        s.setBackground(Color.DARK_GRAY);
        s.out(showMessage(), "Helvetiva", 28, Colors.DARK_GRAY);                            //Muestre una salida
        s.showImage("ImagineDragons.jpg");
        //s.showImage("SK1.gif");
        s.setBounds(760, 200, 500, 500);
        //s.getKeyListeners();
    }

    @Override
    public void Presentacion(Screen s) {
        s.cls();
        s.out("This is Imagine Dragons!\n\n", "Helvetica", 28, Colors.DARK_GRAY);
        s.setVisible(true);                 //Para que se pueda ver
        //s.out(showMessage(), "Helvetiva", 28, Colors.DARK_GRAY);                            //Muestre una salida
        s.showImage("ImagineDragons.jpg");
        s.setBounds(760, 200, 500, 500);
    }

    @Override
    public void Cancion1(Screen s) {
        s.cls();
        s.out("Enemy \n\n", "Helvetica", 28, Colors.DARK_GRAY);
        s.setVisible(true);                 //Para que se pueda ver
        //s.out(showMessage(), "Helvetiva", 28, Colors.DARK_GRAY);                            //Muestre una salida
        s.showImage("ID1.jpg");
        s.setBounds(760, 200, 500, 500);
    }

    @Override
    public void Cancion2(Screen s) {
        s.cls();
        s.out("Radioactive \n\n", "Helvetica", 28, Colors.DARK_GRAY);
        s.setVisible(true);                 //Para que se pueda ver
        //s.out(showMessage(), "Helvetiva", 28, Colors.DARK_GRAY);                            //Muestre una salida
        s.showImage("ID2.gif");
        s.setBounds(760, 200, 500, 500);
    }

    @Override
    public void Despedida(Screen s) {
        s.cls();
        s.out("See you next time \n\n", "Helvetica", 28, Colors.DARK_GRAY);
        s.setVisible(true);                 //Para que se pueda ver
        //s.out(showMessage(), "Helvetiva", 28, Colors.DARK_GRAY);                            //Muestre una salida
        s.showImage("ImagineDragons.jpg");
        s.setBounds(760, 200, 500, 500);
    }

    @Override
    public void ArtistProgram(Screen s) throws InterruptedException {
        Screen screen = new Screen();
        ImagineDragons ID = new ImagineDragons(3,2,"Imagine Dragons","Rock");

        ID.Informacion(screen);
        Thread.sleep(5000);

        ID.Presentacion(screen);
        Thread.sleep(5000);

        ID.Cancion1(screen);
        Thread.sleep(5000);

        ID.Cancion2(screen);
        Thread.sleep(5000);

        ID.Despedida(screen);
    }
}
