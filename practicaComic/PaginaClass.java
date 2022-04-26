public class PaginaClass extends Main implements Pagina{
    public PaginaClass(int Paginas, String Descripcion, String Titulo, String Genero, String Autor) {
        super(Paginas, Descripcion, Titulo, Genero, Autor);
    }

    @Override
    public void Iniciar(Screen s) {
        s.setVisible(true);                 //Para que se pueda ver
        s.out(showMessage(), "Helvetiva", 28, Colors.BlueHorizon);                            //Muestre una salida
        s.showImage("Img1.jpg");
        s.setBounds(200, 100, 1100, 900);
    }

    @Override
    public void Pagina1(Screen s) {
        s.setVisible(true);                 //Para que se pueda ver
        s.out(showText(), "Helvetiva", 28, Colors.BlueHorizon);                            //Muestre una salida
        s.showImage("img2.jpg");
        s.setBounds(200, 100, 1100, 900);
    }

    @Override
    public void Pagina2(Screen s) {
        s.setVisible(true);                 //Para que se pueda ver
        s.out(showText(), "Helvetiva", 28, Colors.BlueHorizon);                            //Muestre una salida
        s.showImage("img3.jpg");
        s.setBounds(200, 100, 1100, 900);
    }

    @Override
    public void Pagina3(Screen s) {
        s.setVisible(true);                 //Para que se pueda ver
        s.out(showText(), "Helvetiva", 28, Colors.BlueHorizon);                            //Muestre una salida
        s.showImage("img4.png");
        s.setBounds(200, 100, 1100, 900);
    }

    @Override
    public void Pagina4(Screen s) {
        s.setVisible(true);                 //Para que se pueda ver
        s.out(showText(), "Helvetiva", 28, Colors.BlueHorizon);                            //Muestre una salida
        s.showImage("img5.jpg");
        s.setBounds(200, 100, 1100, 900);
    }

    @Override
    public void Pagina5(Screen s) {
        s.setVisible(true);                 //Para que se pueda ver
        s.out(showText(), "Helvetiva", 28, Colors.BlueHorizon);                            //Muestre una salida
        s.showImage("img6.png");
        s.setBounds(200, 100, 1100, 900);
    }

    @Override
    public void Pagina6(Screen s) {
        s.setVisible(true);                 //Para que se pueda ver
        s.out(showText(), "Helvetiva", 28, Colors.BlueHorizon);                            //Muestre una salida
        s.showImage("img7.jpg");
        s.setBounds(200, 100, 1100, 900);
    }

    @Override
    public void Pagina7(Screen s) {
        s.setVisible(true);                 //Para que se pueda ver
        s.out(showText(), "Helvetiva", 28, Colors.BlueHorizon);                            //Muestre una salida
        s.showImage("img8.png");
        s.setBounds(200, 100, 1100, 900);
    }
}
