package classesbancortr;

public abstract class Conta {

    private String nomeCliente = "";
    private String cpf = "";
    private String numeroDaAgencia = "";
    private String numeroDaConta = "";
    protected float saldo = 500.0f;
    private int dia = 0;
    private int mes = 0;
    private int ano = 0;
    private String tipoDeConta = "";

    public Conta() {

    }

    public Conta(int dia, int mes, int ano, String nomeCliente, String cpf, 
            String numeroDaAgencia, String numeroDaConta, String tipoDeConta) throws Exception {
        if (dia <= 0 || dia > 31 || mes <= 0 || mes > 12) {
            throw new Exception("Data Inválida - Digite novamente");
        }
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.nomeCliente = nomeCliente;
        this.cpf = cpf;
        this.numeroDaAgencia = numeroDaAgencia;
        this.numeroDaConta = numeroDaConta;
        this.tipoDeConta = tipoDeConta;

    }

    public float depositar(float valor) throws Exception {
        if (valor <= 0) {
            throw new Exception("O valor do depósito não pode ser menor ou igual a 0");
        }
        this.saldo += valor;
        return valor;

    }

    public abstract float sacar(float valor) throws Exception;

    public abstract float transferir(Conta objeto, float valor) throws Exception;

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNumeroDaAgencia() {
        return numeroDaAgencia;
    }

    public void setNumeroDaAgencia(String numeroDaAgencia) {
        this.numeroDaAgencia = numeroDaAgencia;
    }

    public String getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(String numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public String getDataDeAbertura() {
        return dia + " / " + mes + " / " + ano;
    }

    public void setDataDeAbertura(int dia, int mes, int ano) throws Exception {
        if (dia <= 0 || dia > 31 || mes <= 0 || mes > 12) {
            throw new Exception("Data Inválida - Digite novamente");
        }
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    
    public void setTipoDeConta(String tipoDeConta){
        this.tipoDeConta = tipoDeConta;
    }
    
    public String getTipoDeConta(){
        return tipoDeConta;
    }

    @Override
    public String toString() {

        String saida = " --------- Dados do Correntista --------" + "\n";
        saida += "Cliente desde:                   --> " + getDataDeAbertura() + "\n";
        saida += "Nome do Cliente:                 --> " + getNomeCliente() + "\n";
        saida += "CPF:                             --> " + getCpf() + "\n";
        saida += "Número da Agência:               --> " + getNumeroDaAgencia() + "\n";
        saida += "Número da Conta:                 --> " + getNumeroDaConta() + "\n";
        saida += "Saldo:                           --> " + getSaldo() + "\n";
        saida += "Tipo de Conta:                   --> " + getTipoDeConta() + "\n";
        return saida;
    }

}
