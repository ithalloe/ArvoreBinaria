public class App {
    public static void main(String[] args) {
        Arvore arvore = new Arvore();
        System.out.println("Percurso em ordem:");
        arvore.mostrarPercurso();
    }
    public static void main(String[] args) {
        Arvore arvore = new Arvore();
        int totalNos = arvore.contarNos(arvore.raiz);
        System.out.println("Total de nós: " + totalNos); 
    }
    public static void main(String[] args) {
        Arvore arvore = new Arvore();
        arvore.percorrer();
    }
    public static void main(String[] args) {
        Arvore arvore = new Arvore();
        System.out.print("Percurso Pós-Ordem: ");
        arvore.percorrerPosOrdem(arvore.raiz);
    }
   public static void main(String[] args) {
        Arvore arvore = new Arvore();
        System.out.print("Percurso em Largura: ");
        arvore.percorrerEmLargura();
    }
}
