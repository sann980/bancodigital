/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancodigital;

import java.util.Scanner;

/**
 *
 * @author Conservix
 */
//Classe qeu auxiliar no gerenciamento da conta
public final class ContaBanco {
    //Atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    Scanner tec = new Scanner(System.in);
    int i = (int)(Math.random()*100);           //Gera um número aleatório de 1 a 100
    //Metodos
    public ContaBanco(){            //Método Constutor
      this.setNumConta(2809 + i);
      this.setSaldo(0);
      this.setStatus(false);
    }
    //Metodos especiais (gets e sets)
    public int getNumConta(){
        return this.numConta;
    } 
    public void setNumConta(int num){
        this.numConta = num;
    }
    public String getTipo(){
        return this.tipo;
    } 
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    public String getDono(){
        return this.dono;
    } 
    public void setDono(String dono){
        this.dono = dono;
    }
    public float getSaldo(){
        return this.saldo;
    } 
    public void setSaldo(float saldo){
        this.saldo = saldo;
    }
    public boolean getStatus(){
        return this.status;
    } 
    public void setStatus(boolean status){
        this.status = status;
    }
    //Metodos pessonalizados
    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        if("CC".equals(t)){
            this.setSaldo(50);
        } else if("CP".equals(t)){
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sussesso:");
    }
    public void fecharConta(){
        if(this.getSaldo() > 0){
            System.out.println("Impossivel fechar conta! Saldo positivo.");
        }else if(this.getSaldo() < 0){
            System.out.println("Impossivel fechar conta! Saldo negativo.");
        }else{
            this.setStatus(false);
            System.out.println("Conta fhecada com susseso");
        }
    }
    public void depositar(float v){
        if(this.getStatus()== true){
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Deposito realizado na conta de :" +this.getDono());
        }else{
            System.out.println("Impossível depósitar:");
        }
    }
    public void sacar(float v){
        if(this.getStatus()){
            if(this.getSaldo() >= v){
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque realizado na conta de: " +this.getDono());
            }else{
                System.out.println("Impossivel sacar, Saldo insuficiente.");
            }
        }else{
            System.out.println("Impossivel sacar, conta inativa!");
        }
    }
    public void pagarMensal(){
        int v = 0;
        if("CC".equals(this.getTipo())){
            v = 12;
    }else if("CP".equals(this.getTipo())){
          v = 20;  
        }
        if(this.getStatus()){
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade paga com susseso!");
        }else
            System.out.println("Impossivel pagar uma conta fechada!");
    }    
    public void mostrar(){
        System.out.println("-------------------------------------");
        System.out.println("Nome do Cliente: " +this.getDono());
        System.out.println("Número da Conta: " +this.getNumConta());
        System.out.println("Tipo de Conta: " +this.getTipo());
        System.out.println("Saldo da Conta: " +this.getSaldo());
        System.out.println("Status da Conta: " +this.getStatus());
    }
}