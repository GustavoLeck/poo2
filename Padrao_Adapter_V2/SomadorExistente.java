package Padrao_Adapter_V2;

import java.util.List;

public class SomadorExistente {
    public int SomadorExistente(List<Integer> lista) {
        int resultado = 0;
        for (int i : lista)
            resultado += i;
        return resultado;
    }
}
