package applistadupla;

public class AppListaDupla {

    public static void main(String[] args) {
        // Testar os métodos DENTRO deste espaço
        ListaDupla l = new ListaDupla();
        l.adicionaNoFim(10);
        l.adicionaNoFim(20);
        //50 -- novo
        l.adicionaNoFim(30);
        l.adicionaNoFim(40);
        l.adicionaNaPosicao(2, 50);
        l.adicionaNaPosicao3(100);
        l.adicionaNaPosicao3(200);
        l.adiciona(90);
        l.adiciona(70);
        l.imprime();
        
       
    }
}
