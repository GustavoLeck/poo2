import enums.*;

public class SimpleCarroFactory {
    public Carro createCarro(ModeloCarro modelo) {
        Carro carro;
        switch (modelo) {
            case CRUZE:
                carro = new Cruze();
                return carro;
            case CAPTIVA:
                carro = new Captiva();
                return carro;
            case CELTA:
                carro = new Celta();
                return carro;
            case CLASSIC:
                carro = new Classic();
                return carro;
            case VECTRA:
                carro = new Vectra();
                return carro;
            default:
                carro = new Uno();
                return carro;
        }
    }
}
