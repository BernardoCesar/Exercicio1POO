package ESPM.POO.EX1;

public class Funcionario {

    String cpf;
    String nome;
    double salario;
    double valeRefeicao=550.00;

    public String retornarDados(){
        return "{nome: "+ nome + "CPF: " + cpf + "salario: " + salario + "VR: " + valeRefeicao + "}";

    }
    public void aumentarSalario(double aumentoPorc){
        salario=salario*aumentoPorc;


    }
    public void ajustarValeRefeicao(double aumentoVR){
        valeRefeicao=valeRefeicao*aumentoVR;
    }

    

}
