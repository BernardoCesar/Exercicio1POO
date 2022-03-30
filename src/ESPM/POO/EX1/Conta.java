package ESPM.POO.EX1;

public class Conta {
    int numero;
    double saldo=0.00;
    double limite;

    public void consultarSaldo () {
        System.out.println("Saldo: " + saldo);
    }

    public void sacar(double valor){
       if(valor>saldo){
           System.out.println("Não é possível concluir essa operação");
       }else{
            saldo=saldo-valor;
            System.out.println("Operação concluída");
       }
       

    }
    public void depositar(double valor){
        saldo=saldo+valor;
        System.out.println("Operação concluída");
    }

    public String consultarSaldoDisponivel(){
        return "Saldo: "+saldo;
        
    }
    public String retornarDados(){
       return "{numero: " + numero + " saldo: "+ saldo +" limite: "+ limite +"}";


    }

    public String gerarExtrato(){

        return "Extrato: "+ saldo;
    }
    public void transferir(){

    }
    
}
