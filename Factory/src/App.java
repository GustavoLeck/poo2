import enums.*;

public class App {
    public static void main(String[] args) throws Exception {
        SimpleCarroFactory fabricaCarros = new SimpleCarroFactory();
        LojaCarros carroLoja = new LojaCarros(fabricaCarros);
        carroLoja.createCarro(ModeloCarro.CAPTIVA);
        carroLoja.createCarro(ModeloCarro.CELTA);
        carroLoja.createCarro(ModeloCarro.CLASSIC);
        carroLoja.createCarro(ModeloCarro.CRUZE);
        carroLoja.createCarro(ModeloCarro.UNO);
        carroLoja.createCarro(ModeloCarro.VECTRA);
    }
}