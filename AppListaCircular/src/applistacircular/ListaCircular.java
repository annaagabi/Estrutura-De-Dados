package applistacircular;

public class ListaCircular {

    private Celula cabeca;
    private Celula cauda;

    public ListaCircular() {
        this.cabeca = null;
        this.cauda = null;
    }

    // Não modificar a assinatura
    public void adiciona(int valor) {
        // Implementar aqui:
        // Adicionar um elemento no fim da lista.
        Celula novo = new Celula(valor);
        if(this.cabeca == null){
            this.cabeca = novo;
            this.cauda = novo;
            novo.setProximo(novo); // O próximo do novo elemento aponta para ele mesmo para criar um ciclo
        }
        else{
             novo.setProximo(this.cabeca); //O proximo do novo elemento aponta para ele mesmo para criara um ciclo
             this.cauda.setProximo(novo); // O proximodo último elemento aponta para o novo elemento
             this.cauda = novo; // O novo elemento agora é a nova cauda
        }
        
    }

    // Não modificar a assinatura
    public void adicionaNoComeco(int valor) {
        // Implementar aqui:
        // Adicionar um elemento no começo da lista.
        Celula novo = new Celula(valor);
        if(this.cabeca == null){
            this.cabeca = novo;
            this.cauda = novo; 
            novo.setProximo(novo);  // O próximo do novo elemento aponta para ele mesmo para criar um ciclo
        }
        else{
            novo.setProximo(this.cabeca);
            this.cabeca = novo;
            this.cauda.setProximo(novo); // Atualiza o proximo do último elemento para apontar para o novo elemento
         }
    }
    
    // Não modificar a assinatura
    public void remove(int valor) {
        // Implementar aqui:
        // Remover um elemento presente na lista.
       
        if(this.cabeca.getValor() == valor){ // Se o elemento a ser removido é a cabeça da lista.
            if(this.cabeca == this.cauda){ // Se a lista possui apenas um elemento, remove-o e faz com que a lista fique vazia.
                this.cabeca = null;
                this.cauda = null;
            }
            else{
                this.cabeca = this.cabeca.getProximo(); // Caso ocontrario,atualiza a cabeca para o proximo elemento   
                this.cauda.setProximo(this.cabeca); // Atualiza o próximo da cauda.
            }
            return;
        }
        // Caso o elemento a ser removido não seja a cabeça, procuramos por ele na lista
        Celula atual = this.cabeca;
        Celula anterior = null;
        
        while (atual != this.cauda && atual.getValor() != valor) {
            anterior = atual;
            atual = atual.getProximo();
        }
        if (atual.getValor() == valor) {
            // Se encontrarmos o elemento a ser removido.
            anterior.setProximo(atual.getProximo());
            if (atual == this.cauda) {
                // Se o elemento a ser removido é a cauda, atualize a cauda para o elemento anterior.
                this.cauda = anterior;
            }
        }
    }

    public void imprime() {
        if (this.cabeca != null) {
            Celula c = this.cabeca;
            do {
                System.out.println(c.getValor());
                c = c.getProximo();
            } while (c != this.cabeca);
        }
    }
}
