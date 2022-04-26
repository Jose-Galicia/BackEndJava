public class Correr {
    public static void main(String[] args) throws InterruptedException{
        funcion();
    }

    private static void funcion() throws InterruptedException{
        Screen screen = new Screen();
        PaginaClass pagina = new PaginaClass(8,"Historia de una nina poderosa","Una tragedia","Drama","Jose-Galicia");
        PaginaClass pagina1= new PaginaClass(0,"Hace algunos anos existia una nina que vivia sola en el bosque con su familia","","","");
        PaginaClass pagina2= new PaginaClass(0,"Ocurrio cierto incidente que ocasiono que todo el bosque se congelara, incluyendo las personas y animales que habitaban en el","","","");
        PaginaClass pagina3= new PaginaClass(0,"Asi pasaron muchos anos, hasta que esta nina fue encontrada por un ser magico que la descongela y la ayuda a sobrevivir","","","");
        PaginaClass pagina4= new PaginaClass(0,"Con el pasar del tiempo la nina crecio y esta se dio cuenta de que tenia un gran poder, esto la hizo blanco de gente malvada","","","");
        PaginaClass pagina5= new PaginaClass(0,"Debido a su peculiar apariencia fue localizada rapidamente por las personas que la perseguian","","","");
        PaginaClass pagina6= new PaginaClass(0,"Asi, ella y su companero el ser magico se enfrentaron a las personas que mandaron para capturarla, ","","","");
        PaginaClass pagina7= new PaginaClass(0,"La pelea fue muy dura y el ser magico se descontrolo, provocando la muerte de todos los presentes, excepto la de ella.","","","");
        PaginaClass pagina8= new PaginaClass(0,"Debido a todo el poder liberado por ella y su companero, ella termino congelada en un tempano de hielo, esperando el dia en que sea liberada","","","");

        Runnable ejecutar = new Runnable() {
            @Override
            public void run() {
                try{
                    pagina.Iniciar(screen);
                    Thread.sleep(10000);

                    screen.cls();
                    pagina1.Pagina1(screen);
                    Thread.sleep(10000);

                    screen.cls();
                    pagina2.Pagina2(screen);
                    Thread.sleep(10000);

                    screen.cls();
                    pagina3.Pagina3(screen);
                    Thread.sleep(10000);

                    screen.cls();
                    pagina4.Pagina4(screen);
                    Thread.sleep(10000);

                    screen.cls();
                    pagina5.Pagina4(screen);
                    Thread.sleep(10000);

                    screen.cls();
                    pagina6.Pagina5(screen);
                    Thread.sleep(10000);

                    screen.cls();
                    pagina7.Pagina6(screen);
                    Thread.sleep(10000);

                    screen.cls();
                    pagina8.Pagina7(screen);
                    Thread.sleep(10000);

                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        };
        Thread ejecutarC = new Thread(ejecutar);
        ejecutarC.start();
    }
}


