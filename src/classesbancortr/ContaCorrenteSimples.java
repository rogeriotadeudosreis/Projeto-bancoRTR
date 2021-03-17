package classesbancortr;

public class ContaCorrenteSimples extends Conta {   

    public ContaCorrenteSimples() {
    }

    public ContaCorrenteSimples(int dia, int mes, int ano, String nomeCliente, String cpf,
            String numeroDaAgencia, String numeroDaConta, String tipoDeConta) throws Exception {
        super(dia, mes, ano, nomeCliente, cpf, numeroDaAgencia, numeroDaConta, tipoDeConta);
        

    }

    @Override
    public float sacar(float valor) throws Exception {
        if (valor > this.saldo) {
            throw new Exception("Saldo indisponível para saque");
        }
        this.saldo -= valor;
        return valor;
    }

    @Override
    public float transferir(Conta objeto, float valor) throws Exception {
        if (valor > this.saldo) {
            throw new Exception("Saldo indisponível para transferência");
        }
        this.saldo -= valor;
        objeto.saldo += valor;

        return valor;
    }   

}
