package Padrao_Adapter_V2;

public class Cliente {
    private SomadorEsperado somador;

    private Cliente(SomadorEsperado somador) {
        this.somador = somador;
    }
}