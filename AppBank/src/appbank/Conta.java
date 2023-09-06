/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appbank;

/**
 *
 * @author profsl
 */
public class Conta {

    private String descricao;
    private double valor;
   // private double soma = 0;

    public Conta(String descricao, double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public double getValor() {
        return this.valor;
    }
    
    @Override
    public String toString(){
        return this.descricao + " - Valor: R$ " + this.valor;
    }      

  } 

