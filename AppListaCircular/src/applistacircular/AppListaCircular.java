package applistacircular;

public class AppListaCircular {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Testar os métodos criados aqui.
        
        ListaCircular c = new ListaCircular();
        c.adiciona(10);
        c.adiciona(20);
        c.adicionaNoComeco(30);
        c.remove(10);
        c.imprime();
    }
}
