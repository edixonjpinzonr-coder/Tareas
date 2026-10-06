package co.edu.uniquindio.poo.A7PatronAdapter.ReproductorMusica;

public class main {
    public static void main(String[] args) {
        ReproductorModerno reproductorModerno = new ReproductorModerno();
        reproductorModerno.reproducir("musica de ahorita");

        ReproductorAntiguo reproductorAntiguo = new ReproductorAntiguo();
        Adapter adapter = new Adapter(reproductorAntiguo);
        adapter.reproducir("musica de antes");
    }
}
