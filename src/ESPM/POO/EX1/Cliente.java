package ESPM.POO.EX1;

public class Cliente {
    String nome;
    String cpf;
    Conta conta= new Conta();
    CartaodeCredito cartaodeCredito= new CartaodeCredito();

    public String retornarDados () {
        return "{Nome: " + nome+
        "CPF: " + cpf + conta.retornarDados() + "}";
        //como pegar os dados da conta tbm?
    
    }

}