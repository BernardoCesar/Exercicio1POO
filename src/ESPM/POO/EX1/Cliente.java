package ESPM.POO.EX1;

public class Cliente {
    String nome;
    String cpf;
    Conta conta=new Conta();
    CartaodeCredito cartaodeCredito= new CartaodeCredito();

    
	
    public String retornarDados () {
            return "{Nome: " + nome+
            " CPF: " + cpf +"}" + cartaodeCredito.retornarDados()+ conta.retornarDados() + "}";
      
    
    }

}