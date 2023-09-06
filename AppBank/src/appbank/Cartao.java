/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appbank;

/**
 *
 * @author profsl
 */
public class Cartao {

    private int quantidadeMaxima;
    private int quantidade;
    private Conta[] contas;
    private double soma;

    public Cartao(int quantidadeMaxima) {
        // Alocação dinâmica
        this.quantidadeMaxima = quantidadeMaxima;
        this.quantidade = 0;
        this.soma = 0.0;
        // Alocação estática e sequencial
        this.contas = new Conta[this.quantidadeMaxima];
    }

    public void adicionaConta(Conta c) {
        if (this.quantidade == this.quantidadeMaxima) {
            this.quantidadeMaxima = 2 * this.quantidadeMaxima;
            Conta[] temp = new Conta[this.quantidadeMaxima];
            for (int i = 0; i < this.quantidade; i++) {
                temp[i] = this.contas[i];
            }
            contas = temp;
        }
        this.contas[this.quantidade] = c;
        this.quantidade++;
        this.soma += c.getValor();
    }
    
    public double getSoma(){
        return this.soma;
    }
}
