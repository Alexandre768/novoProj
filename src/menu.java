
import java.util.Scanner;

public class menu extends Conta{

    Scanner leia = new Scanner(System.in);
    int operaid;
    public menu() {
        banco banco= new banco();
        System.out.println(" BEM VINDO AO "+banco.getNome());
        System.out.println("|------------ MENU ------------|");
        System.out.println("|         CRIAR CONTA          |");
        System.out.println("| 1- CONTA CORRENTE            |");
        System.out.println("| 2- CONTA INVESTIMENTO        |");
        System.out.println("| 3- CONTA SALARIO             |");
        System.out.println("| 4- CONTA AGRO                |");
        System.out.println("| 5- CONTA FAMILIA             |");
        System.out.println("|------------------------------|");
        System.out.println("Selecione a operação desejada: ");
        operaid = leia.nextInt();
        Conta conta = new Conta();


        switch (operaid) {

            case 1:
                conta.ContaCorrente();
                conta.iniciar();
                break;
            case 2:
                conta.ContaInvest();
                conta.iniciar();
                break;
                case 3:
                conta.ContaSalario();
                    conta.iniciar();
                break;
            case 4:
                conta.ContaAgro();
                conta.iniciar();
                break;
            case 5:
                conta.ContaFamilia();
                conta.iniciar();
                break;

        }

    }


}



