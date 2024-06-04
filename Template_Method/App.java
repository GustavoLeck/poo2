
public class App {
    public static void main(String[] args) throws Exception {

        ManipulaMaiusculo maiusculo = new ManipulaMaiusculo("TesteMaiusculoTeste");

        maiusculo.MostraTextoTransformado();

        maiusculo.LeTexto();

        maiusculo.TransformaTexto();

        maiusculo.MostraTextoTransformado();

        System.out.println(
                "==========================================================================================================================");

        ManipulaMinusculo minusculo = new ManipulaMinusculo("TesteMinusculoTeste");

        minusculo.MostraTextoTransformado();

        minusculo.LeTexto();

        minusculo.TransformaTexto();

        minusculo.MostraTextoTransformado();

        System.out.println(
                "==========================================================================================================================");

        ManipulaInverte inverte = new ManipulaInverte("testeInverteTeste");

        inverte.MostraTextoTransformado();

        inverte.LeTexto();

        inverte.TransformaTexto();

        inverte.MostraTextoTransformado();

    }
}