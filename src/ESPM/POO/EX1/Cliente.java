package ESPM.POO.EX1;

public class Cliente {
    String nome;
    String cpf;
    Conta conta= new Conta();
    CartaodeCredito cartaodeCredito= new CartaodeCredito();

    public void retornarDados () {
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
    }

}