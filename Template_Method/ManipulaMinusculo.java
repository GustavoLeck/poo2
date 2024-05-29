public class ManipulaMinusculo extends ManipulaString {

    private String texto;
    private String textoAlterado;

    public ManipulaMinusculo(String texto) {
        this.texto = texto;
    }

    @Override
    public void TransformaTexto() {
        textoAlterado = texto.toLowerCase();
        System.out.println(textoAlterado);
    }
}
