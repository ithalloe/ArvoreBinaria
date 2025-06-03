public class ArvoreAVL {
    class NoAVL {
        String valor;
        NoAVL esquerda, direita;
        int altura;
        public NoAVL(String valor) {
            this.valor = valor;
            this.altura = 1;
        }
    }
    private NoAVL raiz;
    public void inserir(String valor) {
        raiz = inserir(raiz, valor);
    }
    private NoAVL inserir(NoAVL no, String valor) {
        if (no == null) return new NoAVL(valor);
        if (valor.compareTo(no.valor) < 0) {
            no.esquerda = inserir(no.esquerda, valor);
        } else if (valor.compareTo(no.valor) > 0) {
            no.direita = inserir(no.direita, valor);
        } else {
            return no;
        }
        no.altura = 1 + Math.max(altura(no.esquerda), altura(no.direita));
        return balancear(no);
    }
    private int altura(NoAVL no) {
        return no == null ? 0 : no.altura;
    }
    private int fatorBalanceamento(NoAVL no) {
        return no == null ? 0 : altura(no.esquerda) - altura(no.direita);
    }
    private NoAVL rotacaoDireita(NoAVL y) {
        NoAVL x = y.esquerda;
        NoAVL T2 = x.direita;
        x.direita = y;
        y.esquerda = T2;
        y.altura = 1 + Math.max(altura(y.esquerda), altura(y.direita));
        x.altura = 1 + Math.max(altura(x.esquerda), altura(x.direita));
        return x;
    }
    private NoAVL rotacaoEsquerda(NoAVL x) {
        NoAVL y = x.direita;
        NoAVL T2 = y.esquerda;
        y.esquerda = x;
        x.direita = T2;
        x.altura = 1 + Math.max(altura(x.esquerda), altura(x.direita));
        y.altura = 1 + Math.max(altura(y.esquerda), altura(y.direita));
        return y;
    }
    private NoAVL balancear(NoAVL no) {
        int fator = fatorBalanceamento(no);
        if (fator > 1 && fatorBalanceamento(no.esquerda) >= 0) {
            return rotacaoDireita(no);
        }
        if (fator > 1 && fatorBalanceamento(no.esquerda) < 0) {
            no.esquerda = rotacaoEsquerda(no.esquerda);
            return rotacaoDireita(no);
        }
        if (fator < -1 && fatorBalanceamento(no.direita) <= 0) {
            return rotacaoEsquerda(no);
        }
        if (fator < -1 && fatorBalanceamento(no.direita) > 0) {
            no.direita = rotacaoDireita(no.direita);
            return rotacaoEsquerda(no);
        }
        return no;
    }
    public void percorrerEmOrdem() {
        percorrerEmOrdem(raiz);
        System.out.println();
    }
    private void percorrerEmOrdem(NoAVL no) {
        if (no != null) {
            percorrerEmOrdem(no.esquerda);
            System.out.print(no.valor + " ");
            percorrerEmOrdem(no.direita);
        }
    }
}
