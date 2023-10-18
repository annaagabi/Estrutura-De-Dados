/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package apptarefas;

/**
 *
 * @author Microsoft
 */
public interface IPilha {
    public void adiciona(String n) throws Exception; // empilha
    
    public String remove() throws Exception; // desempilha
}
