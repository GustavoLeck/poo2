
public class ManipulaInverte extends ManipulaString {

    private String textoAlterado;

    public ManipulaInverte(String novoTexto) {
        super(novoTexto);
    }

    @Override
    public void TransformaTexto() {
        this.textoAlterado = new StringBuilder(this.texto).reverse().toString();
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

// public class ManipulaInverte extends ManipulaString {

// private String texto;
// private String textoAlterado;

// public ManipulaInverte(String texto) {
// this.texto = texto;
// }

// @Override
// public void TransformaTexto() {
// textoAlterado = new StringBuilder(this.texto).reverse().toString();
// System.out.println(textoAlterado);
// }
// }
