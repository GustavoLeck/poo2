
public class ManipulaMinusculo extends ManipulaString {

    private String textoAlterado;

    public ManipulaMinusculo(String novoTexto) {
        super(novoTexto);
    }

    @Override
    public void TransformaTexto() {
        this.textoAlterado = super.texto.toLowerCase();
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
