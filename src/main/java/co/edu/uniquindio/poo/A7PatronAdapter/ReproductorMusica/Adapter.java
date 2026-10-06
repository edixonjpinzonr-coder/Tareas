package co.edu.uniquindio.poo.A7PatronAdapter.ReproductorMusica;

public class Adapter implements IReproducirMusica {

    private ReproductorAntiguo reproductorAntiguo;

    public Adapter(ReproductorAntiguo reproductorAntiguo) {
        this.reproductorAntiguo = reproductorAntiguo;
    }
    @Override
    public void reproducir(String musica) {
        System.out.println("Convirtiendo musica MP3 a musica Moderna");
        reproductorAntiguo.reproducirMP3(musica);
    }
}
