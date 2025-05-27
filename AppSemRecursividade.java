public class App {
    public static void main(String[] args) {
        Arvore arvore = new Arvore();
        int total = arvore.contarNos();
        System.out.println("Total de nós: " + total);
    }
}
public class App {
    public static void main(String[] args) {
        Arvore arvore = new Arvore();
        System.out.println("Percurso em ordem:");
        arvore.percorrerEmOrdem();
    }
  
public class App {
    public static void main(String[] args) {
        Arvore arvore = new Arvore();
        System.out.print("Percurso Pré-Ordem: ");
        arvore.percorrerPreOrdem();
    }
}
 public class App {
   public static void main(String[] args) {
        Arvore arvore = new Arvore();
        System.out.print("Percurso Pos-Ordem: ");
        arvore.percorrerPosOrdem();
    }
}
  public class App {
    public static void main(String[] args) {
        Arvore arvore = new Arvore();
        System.out.print("Percurso em Largura: ");
        arvore.percorrerEmLargura();
    }
}
  public static void main(String[] args) {
       Arvore arvore = new Arvore();
        int totalFolhas = arvore.contarNosFolha();
        System.out.println("Total de nós folha: " + totalFolhas);
    }

// Favor quando for testar, usar separadamente a parte desejada em conjunto com o metodo da classe Arvore 
//Ithallo Emanuel

