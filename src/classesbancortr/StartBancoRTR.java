package classesbancortr;

import javax.swing.JOptionPane;

public class StartBancoRTR {

    public static void main(String[] args) {
        try {

//            ContaPoupanca cliente1 = new ContaPoupanca(8, 07, 2014, "José Rico ",
//                    "09888086898", "1842", "11-111-3");
//
//            ContaPoupanca cliente2 = new ContaPoupanca(18, 10, 2015, "Paulo Beltrano",
//                    "09888086847", "1842", "11-254-5");
//
//            ContaCorrenteSimples cliente3 = new ContaCorrenteSimples(12, 11, 2019, "Olegário ",
//                    "09888086847", "1842", "11-869-7");
//
//            ContaCorrenteComLimite cliente = new ContaCorrenteComLimite(30, 04, 2020, "Barnabé do Sitio do Pica-Pau Amarelo", "123.456.789-98", "1844", "33.654-5");
//
//            
//            System.out.println(cliente.toString());
//            System.out.println("Tipo da Conta                    --> " + cliente.getTipoDeConta());
//            System.out.println("Depósito Efetuado                --> " + cliente.depositar(500.00f) + " + ");            
//            System.out.println("Saque efetuado                   --> " + cliente.sacar(300.00f) + " - ");                        
//            System.out.println("Transferência                    --> " + cliente.transferir(cliente1, 500.00f) + " - "
//                    + " para " + cliente1.getNomeCliente() );
//            System.out.println("Saldo Atual                      --> " + cliente.getSaldo());
//            System.out.println("Limite Especial                  --> " + cliente.getLimite());          
//            
//            System.out.println("-------------------------------------------------------");

//            String saida = "Tipo da Conta:               " + jose.getTipoDeConta() + "\n";
//            saida += "Depósito na conta de José    " + jose.depositar(500.00f) + "\n";
//            saida += "Saldo Atual:                 " + jose.getSaldo() + "\n";
//            saida += "Saque efetuado:              " + jose.sacar(200.00f) + "\n";
//            saida += "Saldo Atual:                 " + jose.getSaldo() + "\n";
//            saida += "José transfere p/ Paulo:     " + jose.transferir(paulo, 100.00f) + "\n";
//            saida += "Saldo Atual José:            " + jose.getSaldo() + "\n";
//            saida += "Saldo Atual Paulo:           " + paulo.getSaldo() + "\n";
//            saida += "Paulo transfere p/ Olegário: " + paulo.transferir(olegario, 50.00f) + "\n";
//            saida += "Saldo Atual Paulo:           " + paulo.getSaldo() + "\n";
//            System.out.print(saida);
//            System.out.println("----------------------------------------");
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        }
    }

}
