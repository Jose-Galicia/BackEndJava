public class Evento {
    public String NombreEve, Tematica, Grupo1, Grupo2, Grupo3;
    public int CantidadG, CantidadC;

    public Evento(int CantidadG, int CantidadC, String  NombreEve, String Tematica, String Grupo1, String Grupo2, String Grupo3){
        this.CantidadG=CantidadG;
        this.CantidadC=CantidadC;
        this.NombreEve=NombreEve;
        this.Tematica=Tematica;
        this.Grupo1=Grupo1;
        this.Grupo2=Grupo2;
        this.Grupo3=Grupo3;
    }

    public String EventDescription(){
        return
                "Bienvenidos al concierto digital\n"+NombreEve+
                "\nDonde podras encontrar "+CantidadG+ "Grupos"+
                "\nCon un total de "+CantidadC+ "Canciones."+
                "\nLa tematica del evento es Rock/Metal"+
                "\nGrupos: " +Grupo1+"\n"+Grupo2+"\n"+Grupo3+"\n";
    }
}
