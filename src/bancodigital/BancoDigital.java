/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancodigital;

/**
 *
 * @author Conservix
 */
//Programa para gerenciar contas de um banco
public class BancoDigital {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ContaBanco c1 = new ContaBanco();
        c1.setNumConta(12134);
        c1.setDono("Jubileu");
        c1.setTipo("CC");
        
        ContaBanco c2 = new ContaBanco();
        c2.setNumConta(12135);
        c2.setDono("Creuza");
        c2.setTipo("CP");
        
        c1.mostrar();
        c2.mostrar();
        
    }
}
