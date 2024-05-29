public class ManipulaMaiusculo extends ManipulaString {

    private String texto;
    private String textoAlterado;

    public ManipulaMaiusculo(String texto) {
        this.texto = texto;
    }

    @Override
    public void TransformaTexto() {
        textoAlterado = texto.toUpperCase();
        System.out.println(textoAlterado);
    }
}
