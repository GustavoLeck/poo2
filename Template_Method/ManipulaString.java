
public abstract class ManipulaString {

    String texto = "";

    public ManipulaString(String novoTexto) {
        this.texto = novoTexto;
    }

    public void LeTexto() {
        System.out.println(this.texto);
        return;
    }

    public void MostraTextoTransformado(String textoTransformado) {
        if (textoTransformado == null) {
            System.out.println(" -- EMPTY --");
            return;
        }
        System.out.println(textoTransformado);
        return;
    }

    public abstract void TransformaTexto();
}