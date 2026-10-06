package co.edu.uniquindio.poo.A7PatronAdapter.ReproductorMusica;

public class ReproductorModerno implements IReproducirMusica {

    @Override
    public void reproducir(String musica) {
        System.out.println("reproduciendo musica moderna"+ musica);
    }
}

