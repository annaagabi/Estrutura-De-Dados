/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package appbank;

/**
 *
 * @author profsl
 */
public class AppBank {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Conta c1 = new Conta("Supermercado", 425.69);
        Conta c2 = new Conta("Bar", 89.87);
        Conta c3 = new Conta("Restaurante", 125.58);
        //Conta c4 =

        Cartao meuCartao = new Cartao(50);
        meuCartao.adicionaConta(c1);
        meuCartao.adicionaConta(c2);
        meuCartao.adicionaConta(c3);
        
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println("Total: R$ "+meuCartao.getSoma());
    }
}
