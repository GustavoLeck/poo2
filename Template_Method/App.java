package Template_Method;

public class App {
    public static void main(String[] args) throws Exception {

        ManipulaMaiusculo maiusculo = new ManipulaMaiusculo();

        maiusculo("TesteMaiusculoTeste");

        maiusculo.LeTexto();

        maiusculo.TransformaTexto();

        maiusculo.MostraTextoTransformado();

        ManipulaMinusculo minusculo = new ManipulaMinusculo();

        minusculo("TesteMinusculoTeste");

        minusculo.LeTexto();

        minusculo.TransformaTexto();

        minusculo.MostraTextoTransformado();

        ManipulaInverte inverte = new ManipulaInverte();

        minusculo("testeInverteTeste");

        inverte.LeTexto();

        inverte.TransformaTexto();

        inverte.MostraTextoTransformado();

    }
}