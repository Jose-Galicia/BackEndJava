import javax.swing.plaf.TableHeaderUI;
import java.security.PublicKey;

public class Ejecutar {
    public static void main(String[] args) throws InterruptedException{
        funcion();
    }

    public static void funcion() throws InterruptedException{
        Screen screen = new Screen();
        Slipknot SK = new Slipknot(2,1,"Slipknot","Death Metal");
        ImagineDragons ID = new ImagineDragons(2,2,"Imagine Dragons","Rock");
        RHCP RHCP = new RHCP(2,3,"Red Hot Chilli Peppers","Rock");
        EventPresentation even = new EventPresentation(3,6,"MusicFestival","Rock/Metal","Slipknot","ImgineDragons","Red hot Chilli Peppers");

        Runnable ejecutar = new Runnable() {
            @Override
            public void run() {
                try{
                    even.Presentacion(screen);
                    Thread.sleep(5000);
                    screen.setVisible(false);

                    SK.ArtistProgram(screen);
                    Thread.sleep(5000);
                    screen.setVisible(false);

                    ID.ArtistProgram(screen);
                    Thread.sleep(5000);
                    screen.setVisible(false);

                    RHCP.ArtistProgram(screen);
                    Thread.sleep(5000);
                    screen.setVisible(false);


                }catch (InterruptedException ioe){
                    ioe.printStackTrace();
                }
            }
        };
        Thread ejecutarCon = new Thread(ejecutar);
        ejecutarCon.start();
    }
}
