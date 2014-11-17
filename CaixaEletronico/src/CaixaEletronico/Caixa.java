

package CaixaEletronico;

import java.util.Scanner;
import java.util.Random;


public class Caixa {
    
        public static void main(String[] args){
        
            //Declaração das variáveis Scanner e Random
            
            String nomeTitular;
            double inicial;
            Scanner entrada = new Scanner(System.in);
            Random numero = new Random();
            int conta = 1 + numero.nextInt(9999);
            String cpf = "113.710.356-85";
            int saques = 0;
            
            //Obtendo as informações iniciais do Cliente
            System.out.println("Cadastrando novo cliente.");
            System.out.println("Entre com o nome do cliente: ");
            nomeTitular = entrada.nextLine();
            
            System.out.println("Entre com o valor inicial depositado na conta: ");
            inicial = entrada.nextDouble();
            
            //Criando a conta de um cliente
            Conta minhaConta = new contaFisica(nomeTitular, conta, cpf, inicial);
            minhaConta.iniciar();
        
        
        
        
    
        
    }
    
}
