/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package apptarefas;

/**
 *
 * @author Microsoft
 */
public class AppTarefas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Tarefas t = new Tarefas();
        try {
            t.adiciona("Tarefa 1"); // empilha
            t.adiciona("Tarefa 2");
            t.adiciona("Tarefa 3");
            t.adiciona("Tarefa 4");
            t.adiciona("Tarefa 5");
            t.adiciona("Tarefa 6");

            t.remove(); // desempilha
        
        t.imprime();
        
        while(!t.estaVazia()){
            t.remove();
        }  
        
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }
    
}
