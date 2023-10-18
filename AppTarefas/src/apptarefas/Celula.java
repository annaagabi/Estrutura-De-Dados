/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apptarefas;

/**
 *
 * @author Microsoft
 */
public class Celula {
    private String tarefa;
    private Celula proximo;
    
    public Celula(){
    }
    
    public Celula(String tarefa){
      this.tarefa = tarefa;
      this.proximo = null;
    }

    /**
     * @return the tarefa
     */
    public String getTarefa() {
        return tarefa;
    }

    /**
     * @param tarefa the tarefa to set
     */
    public void setTarefa(String tarefa) {
        this.tarefa = tarefa;
    }

    /**
     * @return the proximo
     */
    public Celula getProximo() {
        return proximo;
    }

    /**
     * @param proximo the proximo to set
     */
    public void setProximo(Celula proximo) {
        this.proximo = proximo;
    }
}
