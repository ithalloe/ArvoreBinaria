public class Arvore {
        No raiz;
        public Arvore() {

            No noA = new No("a");
            No noB = new No("b");
            No noC = new No("c");
            No noD = new No("d");
            No noE = new No("e");
            No noF = new No("f");
    
            noA.esquerda = noB;
            noA.direita = noC;
    
            noB.esquerda = noD;
            noB.direita = noE;

            noC.direita = noF;
    
            this.raiz = noA;
        }
        public void percorrerEmOrdem(No no) {
            if (no != null) {
                percorrerEmOrdem(no.esquerda);
                System.out.print(no.valor + " ");
                percorrerEmOrdem(no.direita);
            }
        }
        public void mostrarPercurso() {
            percorrerEmOrdem(raiz);
        }
        public int contarNos(No no) {
        if (no == null) {
            return 0;
        }
        return 1 + contarNos(no.esquerda) + contarNos(no.direita);
                
    public void percorrerPreOrdem(No no) {
        if (no == null) {
            return; 
        }
        System.out.print(no.valor + " ");
        percorrerPreOrdem(no.esquerda);
        percorrerPreOrdem(no.direita);
    }
     public void percorrer() {
        percorrerPreOrdem(raiz);
    }
    public void percorrerPosOrdem(No no) {
    if (no == null) {
        return;
    }
    percorrerPosOrdem(no.esquerda);
    percorrerPosOrdem(no.direita);
    System.out.print(no.valor + " ");
    }
    public int altura(No no) {
    if (no == null) {
        return 0;
    }
    int alturaEsq = altura(no.esquerda);
    int alturaDir = altura(no.direita);
    return 1 + Math.max(alturaEsq, alturaDir);
}

public void imprimirNivel(No no, int nivel) {
    if (no == null) {
        return;
    }
    if (nivel == 1) {
        System.out.print(no.valor + " ");
    } else if (nivel > 1) {
        imprimirNivel(no.esquerda, nivel - 1);
        imprimirNivel(no.direita, nivel - 1);
    }
  }
    public void percorrerEmLargura() {
    int h = altura(raiz);
    for (int i = 1; i <= h; i++) {
    imprimirNivel(raiz, i);
     }
    }
 public int contarNosFolha() {
    return contarNosFolha(raiz);
}
 public int contarNosFolha(No no) {
    if (no == null) {
        return 0;
    }
    if (no.esquerda == null && no.direita == null) {
        return 1;
    }
    return contarNosFolha(no.esquerda) + contarNosFolha(no.direita);
 }
}

