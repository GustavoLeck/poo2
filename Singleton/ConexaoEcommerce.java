public class ConexaoEcommerce {
    private static ConexaoEcommerce instance;

    private ConexaoEcommerce() {
    }

    public static ConexaoEcommerce getInstance() {
        if (instance == null) {
            instance = new ConexaoEcommerce();
        }
        return instance;
    }

    public String enviaRequisicao(String codPedido) {
        return "Pedido enviado: " + codPedido;
    }
}
