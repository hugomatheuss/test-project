public class Valores implements ValoresITF {
    int[] valores = new int[10];

    @Override
    public boolean ins(int v) {
        if (v > 0) {
            for(int i = 0; i < valores.length; i++) {
                if (valores[i] == 0) {
                    valores[i] = v;
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public int del(int i) {
        int qtd = 0;
        int valorDeletado = 0;

        for (int valor : valores) {
            if (valor != 0) {
                qtd = qtd + 1;
            }
        }

        if (qtd == 0) {
            return -1;
        }

        valorDeletado = valores[i];
        valores[i] = 0;

        return valorDeletado;
    }

    @Override
    public int size() {
        int qtd = 0;

        for (int valor : valores) {
            if (valor != 0) {
                qtd = qtd + 1;
            }
        }
        return qtd;
    }
}
