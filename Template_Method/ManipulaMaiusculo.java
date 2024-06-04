
public class ManipulaMaiusculo extends ManipulaString {

    private String textoAlterado;

    public ManipulaMaiusculo(String novoTexto) {
        super(novoTexto);
    }

    @Override
    public void TransformaTexto() {
        this.textoAlterado = super.texto.toUpperCase();
        return;
    }

    public void LeTexto() {
        super.LeTexto();
        return;
    }

    public void MostraTextoTransformado() {
        super.MostraTextoTransformado(this.textoAlterado);
        return;
    }
}