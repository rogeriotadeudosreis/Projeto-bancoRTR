
package classesbancortr;

public class ContaCorrenteComLimite extends Conta {

    private float limite = 1000.0f;    

    public ContaCorrenteComLimite() {

    }

    public ContaCorrenteComLimite(int dia, int mes, int ano, String nomeCliente, String cpf, 
            String numeroDaAgencia, String numeroDaConta, String tipoDeConta) throws Exception {
        super(dia, mes, ano, nomeCliente, cpf, numeroDaAgencia, numeroDaConta, tipoDeConta);
        this.limite = 1000.0f;
    }   

    public void setLimite(float limite) {
        this.limite = limite;
    }

    public float getLimite() {
        return limite;
    }   

    @Override
    public float sacar(float valor) throws Exception {       

            this.saldo -= valor;
        if (this.saldo < this.limite * (-1)) {
            throw new Exception("Saldo indisponível para saque");
        }        
        
        if (this.saldo == this.limite * (-1)) {
            System.out.println("Limite Especial 100% usado");
        }
       
        return valor;
    }

    @Override
    public float transferir(Conta objeto, float valor) throws Exception {
         this.saldo -= valor;
        if (this.saldo < this.limite * (-1)) {
            throw new Exception("Saldo indisponível para transferência");
        }       
        
        objeto.saldo += valor;
        
        return valor;
    }

}
