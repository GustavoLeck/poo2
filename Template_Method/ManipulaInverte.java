public class ManipulaInverte extends ManipulaString {

    private String texto;
    private String textoAlterado;

    public ManipulaInverte(String texto) {
        this.texto = texto;
    }

    @Override
    public void TransformaTexto() {
        textoAlterado = texto.new StringBuilder(frase).reverse().toString();
        System.out.println(textoAlterado);
    }
}
