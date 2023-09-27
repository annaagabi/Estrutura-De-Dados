package applistadupla;

import java.util.HashSet;
import java.util.Set;

public class ListaDupla {

    private Celula cabeca;

    public ListaDupla() {
        this.cabeca = null;
    }

    /**
     * Adiciona um novo elemento à lista duplamente encadeada.
     *
     * @param valor - número inteiro a ser inserido na lista. *
     */
    public void adicionaNoFim(int valor) {
        Celula novo = new Celula(valor);
        if (this.cabeca == null) {
            this.cabeca = novo;
        } else {
            Celula ultimo = this.cabeca;
            while (ultimo.getProximo() != null) {
                ultimo = ultimo.getProximo();
            }
            ultimo.setProximo(novo);
            novo.setAnterior(ultimo);
        }
    }

    public void adicionaNaPosicao3(int valor) {
        adicionaNaPosicao(3, valor);
    }

    // Não modificar a assinatura
    public void adicionaNaPosicao(int posicao, int valor) {
        // Implementar aqui:
        // Adicionar o item `valor` na posicão de nº `posição`.
        // Posição começa em 0.

        Celula novo = new Celula(valor);

        Celula temp = this.cabeca;
        for (int i = 0; i < posicao; i++) {
            temp = temp.getProximo();
        }

        Celula anterior = temp.getAnterior();
        anterior.setProximo(novo);
        novo.setProximo(temp);
        temp.setAnterior(novo);
        novo.setAnterior(anterior);

        // Pega o novo (que esta armazenando o valor da variavel e atribui o novo valor)
        //novo.setProximo(temp);
        // temp.setProximo(novo);
        //temp.setAnterior(novo);
        //System.out.println(temp.getValor());
    }

    // Não modificar a assinatura
    public void adiciona(int valor) {
        // Implementar aqui:
        // Adicionar o item `valor` no começo da lista.
         Celula novo = new Celula(valor);
         if(this.cabeca == null){
             this.cabeca = novo;
         }
         else{
             novo.setProximo(this.cabeca);
             this.cabeca.setAnterior(novo);
             this.cabeca = novo;
         }
    }

    /**
     * Remove o último elemento da lista.
     */
    public void removeUltimo() {
        if (this.cabeca != null) {
            if (this.cabeca.getProximo() == null) {
                this.cabeca = null;
            } else {
                Celula ultimo = this.cabeca;
                while (ultimo.getProximo() != null) {
                    ultimo = ultimo.getProximo();
                }
                Celula anterior = ultimo.getAnterior();
                anterior.setProximo(ultimo.getProximo());
            }
        }
    }

    public void imprime() {
        for (Celula c = this.cabeca; c != null; c = c.getProximo()) {
            System.out.print(c);
            System.out.print(" ");
        }
        System.out.println();
    }
}
