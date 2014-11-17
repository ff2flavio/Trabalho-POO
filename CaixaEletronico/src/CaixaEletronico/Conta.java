

package CaixaEletronico;

import java.util.Scanner;

public class Conta {
    
    
    protected String nomeTitular;
    protected int conta, saques;
    protected double saldo;
    
    Scanner entrada = new Scanner(System.in);
 
    //Métodos get e set da classe.
    public String getNome() {
        return nomeTitular;
    }

    public void setNome(String nome) {
        this.nomeTitular = nome;
    }

    public int getConta() {
        return conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }

    public int getSaques() {
        return saques;
    }

    public void setSaques(int saques) {
        this.saques = saques;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    
    
    //Fim dos métodos getters e setters
    
       
    
        public void extrato(){
            System.out.println("\tEXTRATO");
            System.out.println("Nome: " + this.getNome());
            System.out.println("Número da conta: " + this.getConta());
            System.out.println("Saldo atual: " + this.getSaldo());
            System.out.println("Saques realizados hoje em terminais 24Hrs: " + this.getSaques());
        }
        
        
        public void sacar(double valor){
            if(getSaldo() >= valor){
                setSaldo(getSaldo() - valor);
                setSaques(getSaques() + 1);
                System.out.println("Sacado: " + valor);
                System.out.println("Novo saldo: " + getSaldo() + "\n");
                }else{
                System.out.println("Saldo insuficiente. Faça um depósito\n");
                }
            }
        
        public void depositar(double valor){
                setSaldo(getSaldo() + valor);
                System.out.println("Depositado: " + valor);
                System.out.println("Novo Saldo: " + getSaldo() + "\n");
        
        }
        
        public void iniciar(){
                int opcao;
                
                do{
                    exibeMenu();
                    opcao = entrada.nextInt();
                    escolheOpcao(opcao);
                }while(opcao!=4);
            }         
                        
                public void exibeMenu(){
                
                        System.out.println("\t Escolha a opção desejada");
                        System.out.println("1 - Consultar Extrato");
                        System.out.println("2 - Realizar saque");
                        System.out.println("3 - Realizar Depósito");
                        System.out.println("4 - Sair");
                        System.out.println("Opção desejada: ");
                
                }
                
                
                
                public void escolheOpcao(int opcao){
                        double valor;
                        
                        switch(opcao){
                            
                            case 1:
                                        extrato();
                                        break;
                             
                            case 2:
                                
                                        if(saques < 3){
                                            System.out.println("Qual valor deseja sacar:  ");
                                            valor = entrada.nextDouble();
                                            sacar(valor);
                                        }else{
                                            System.out.println("Limite de saques diários atimgidos.");
                                        }
                                        break;
                            
                            case 3:
                                        System.out.println("Quanto deseja depositar:  ");
                                        valor = entrada.nextDouble();
                                        depositar(valor);
                                        break;
                            
                            case 4:
                                        System.out.println("Sistema encerrado.");
                                        break;
                                
                            default:
                                        System.out.println("Opção inválida");
                        
                }
      
    }  
}       
