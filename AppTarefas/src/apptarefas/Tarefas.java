/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apptarefas;

/**
 *
 * @author Microsoft
 */
public class Tarefas implements IPilha {
    private int quantidade;
    private int TamanhoMaximoDaPilha = 100000000;
    private Celula topo;

    public Tarefas() {
        this.quantidade = 0;
        this.topo = null;
    }

    @Override
    public void adiciona(String n) throws Exception {
        if (this.quantidade < this.TamanhoMaximoDaPilha) {
            Celula aux = this.topo;
            this.topo = new Celula(n);
            this.topo.setProximo(aux);
            this.quantidade++;
        } else {
            throw new Exception("A pilha está cheia.");
        }
    }

    @Override
    public String remove() throws Exception {
        if (this.quantidade != 0) {
            String n = this.topo.getTarefa();
            this.topo = this.topo.getProximo();
            this.quantidade--;
            return n;
        } else {
            throw new Exception("A pilha está vazia.");
        }
    }
    
    public boolean estaVazia(){
        return(this.quantidade == 0);
    }
    
    public void imprime() {
        Celula ultimo = this.topo;
        while (ultimo != null) {
            System.out.println(ultimo.getTarefa());
            ultimo = ultimo.getProximo();
        }
    }
}
