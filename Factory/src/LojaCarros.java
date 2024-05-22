import enums.ModeloCarro;

public class LojaCarros {
    SimpleCarroFactory factory;

    public LojaCarros(SimpleCarroFactory factory) {
        this.factory = factory;
    }

    public void createCarro(ModeloCarro modelo) {
        Carro carro;
        carro = factory.createCarro(modelo);
        carro.enviaMontagem();
        carro.escolheCombustivel();
        carro.adicionaAcessorio();
        carro.escolheCor();
    }
}