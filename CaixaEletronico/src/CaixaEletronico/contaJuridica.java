

package CaixaEletronico;


public class contaJuridica extends Conta {
    private String cnpj;

   
    public String getCnpj() {
        return cnpj;
    }

   
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    
    
    public void extrato(){
            System.out.println("\tEXTRATO");
            System.out.println("Nome: " + this.getNome());
            System.out.println("Número da conta: " + this.getConta());
            System.out.println("CPF do Titular: " + this.cnpj);
            System.out.println("Saldo atual: " + this.getSaldo());
            System.out.println("Saques realizados hoje em terminais 24Hrs: " + this.getSaques());
        }
    
    public contaJuridica(String nomeTitular, int conta, String cnpj, double saldo_inicial){
            this.nomeTitular = nomeTitular;
            this.conta = conta;
            this.cnpj = cnpj;
            saldo = saldo_inicial;
            saques = 0;
    }
    
}
