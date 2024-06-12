package Padrao_Adapter;

public class App {
    public static void main(String[] args) throws Exception {
        TomadaDeTresPinos tomadaTresPinos = new TomadaDeTresPinos();

        AdapterTomada adaptador = new AdapterTomada(tomadaTresPinos);
        adaptador.ligarNaTomadaDeDoisPinos();
    }
}