public class AppAvl {
  public static void main(String[] args) {
     ArvoreAVL avl = new ArvoreAVL();
     avl.inserir("d");
     avl.inserir("b");
     avl.inserir("a");
     avl.inserir("c");
     avl.inserir("e");
     avl.inserir("f");
     System.out.println("\nÁrvore AVL (em ordem):");
     avl.percorrerEmOrdem();
  }
}
