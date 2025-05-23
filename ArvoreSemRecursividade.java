import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;

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
      public int contarNos() {
        if (raiz == null) return 0;
        int count = 0;
        Stack<No> pilha = new Stack<>();
        pilha.push(raiz);
        while (!pilha.isEmpty()) {
            No atual = pilha.pop();
            count++;
            if (atual.direita != null) pilha.push(atual.direita);
            if (atual.esquerda != null) pilha.push(atual.esquerda);
        }
        return count;
    }
    public void percorrerEmOrdem() {
        Stack<No> pilha = new Stack<>();
        No atual = raiz;

        while (atual != null || !pilha.isEmpty()) {
            while (atual != null) {
                pilha.push(atual);
                atual = atual.esquerda;
            }
            atual = pilha.pop();
            System.out.print(atual.valor + " ");
            atual = atual.direita;
        }
    }
    public void percorrerPreOrdem() {
        if (raiz == null) return;
        Stack<No> pilha = new Stack<>();
        pilha.push(raiz);
        while (!pilha.isEmpty()) {
            No atual = pilha.pop();
            System.out.print(atual.valor + " ");
            if (atual.direita != null) pilha.push(atual.direita);
            if (atual.esquerda != null) pilha.push(atual.esquerda);
        }
    }
    public void percorrerPosOrdem() {
        if (raiz == null) return;
        Stack<No> pilha1 = new Stack<>();
        Stack<No> pilha2 = new Stack<>();
        pilha1.push(raiz);
        while (!pilha1.isEmpty()) {
            No atual = pilha1.pop();
            pilha2.push(atual);

            if (atual.esquerda != null) pilha1.push(atual.esquerda);
            if (atual.direita != null) pilha1.push(atual.direita);
        }
        while (!pilha2.isEmpty()) {
            System.out.print(pilha2.pop().valor + " ");
        }
    }
    public void percorrerEmLargura() {
        if (raiz == null) return;
        Queue<No> fila = new LinkedList<>();
        fila.add(raiz);
        while (!fila.isEmpty()) {
            No atual = fila.poll();
            System.out.print(atual.valor + " ");
            if (atual.esquerda != null) fila.add(atual.esquerda);
            if (atual.direita != null) fila.add(atual.direita);
        }
    }
}
