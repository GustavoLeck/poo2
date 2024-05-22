public class App {
    public static void main(String[] args) throws Exception {
        // Exemplo de implementação em eCommerce onde pedidos não ter muitas conexões
        System.out.println("Primeira tentativa de conexão");
        ConexaoEcommerce pedido = ConexaoEcommerce.getInstance();

        System.out.println("Segunda tentativa de conexão");
        ConexaoEcommerce pedido2 = ConexaoEcommerce.getInstance();

        System.out.println(pedido.enviaRequisicao("123"));
        System.out.println(pedido2.enviaRequisicao("456"));

    }
}