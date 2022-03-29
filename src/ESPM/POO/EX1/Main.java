package ESPM.POO.EX1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Cliente cliente1= new Cliente();

        Scanner scan=new Scanner(System.in);

        System.out.println("Insira seu nome:");
        cliente1.nome=scan.nextLine();
        System.out.println("Insira o CPF:");
        cliente1.cpf=scan.nextLine();

        cliente1.retornarDados();
    }
    
}
