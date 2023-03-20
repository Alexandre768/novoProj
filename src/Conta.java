import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Conta {

    Scanner leia = new Scanner(System.in);
    private double saldo;
    private String nome;
    private int conta;
    private int sacar;
    private int saques;
    String cpf;
    Random numero = new Random();
    int contaa = 1 + numero.nextInt(9999);
    int [] num = new int[5];

    public void sacar(double valor){
        if(saldo >= valor){
            saldo -= valor;
            System.out.println("Sacado: " + valor);
            System.out.println("Novo saldo: " + saldo + "\n");
        } else {
            System.out.println("Saldo insuficiente. Faça um depósito\n");
        }
    }

    public void depositar(double valor)
    {
        saldo += valor;
        System.out.println("Depositado: " + valor);
        System.out.println("Novo saldo: " + saldo + "\n");
    }


    public void ContaCorrente() {


        System.out.println("Nome do Titular: ");
        nome = leia.nextLine();
        cliente cliente = new cliente();
        do {
            System.out.println("CPF do Titular: ");
            cpf = leia.nextLine();
            if (cliente.isCPF(cpf) == true) {
                return;
            } else {
                System.out.println("CPF invalido digite novamente");
            }

        } while (cliente.isCPF(cpf) != true);

    }
    public void ContaInvest() {
        System.out.println("Nome do Investidor: ");
        nome = leia.nextLine();
        cliente cliente = new cliente();
        do {
            System.out.println("CPF do Titular: ");
            cpf = leia.nextLine();
            if (cliente.isCPF(cpf) == true) {

                System.out.println("Entre com um valor de Investimento :");
                saldo = leia.nextDouble();
            } else {
                System.out.println("CPF invalido digite novamente");
            }


        } while (cliente.isCPF(cpf) != true);

    }
    public void ContaSalario() {
        System.out.println("Nome do Titular: ");
        nome = leia.nextLine();
        cliente cliente = new cliente();
        do {
            System.out.println("CPF do Titular: ");
            cpf = leia.nextLine();
            if (cliente.isCPF(cpf) == true) {
                return;
            } else {
                System.out.println("CPF invalido digite novamente");
            }

        } while (cliente.isCPF(cpf) != true);

    }
    public void ContaAgro() {
        System.out.println("Nome do Fazendeiro: ");
        nome = leia.nextLine();
        cliente cliente = new cliente();
        do {
            System.out.println("CPF do Titular: ");
            cpf = leia.nextLine();
            if (cliente.isCPF(cpf) == true) {
                return;
            } else {
                System.out.println("CPF invalido digite novamente");
            }

        } while (cliente.isCPF(cpf) != true);


    }

    public void ContaFamilia() {
        System.out.println("Nome da Familia: ");
        nome = leia.nextLine();
        cliente cliente = new cliente();
        do {
            System.out.println("CPF do Titular: ");
            cpf = leia.nextLine();
            if (cliente.isCPF(cpf) == true) {
                return;
            } else {
                System.out.println("CPF invalido digite novamente");
            }

        } while (cliente.isCPF(cpf) != true);


    }

    public String getNome() {
        return nome;
    }



    public String getCpf() {
        return cpf;
    }


    public int getContaa() {
        return contaa;
    }

    public void listarConta(){
        return;

    }
    public void iniciar(){
        int opcao;

        do{
            exibeMenu();
            opcao = leia.nextInt();
            escolheOpcao(opcao);
        }while(opcao!=5);
    }

    public void extrato(){
        agencia agencia= new agencia();
        System.out.println("\tEXTRATO");
        System.out.println("Nome: " + this.nome);
        System.out.println("Número da conta: " + this.contaa);
        System.out.println("Número da Agencia: " + agencia.getAgencia());
        System.out.printf("Saldo atual: %.2f\n",this.saldo);


    }
   /* CadastrarClient();
    ArrayList<Cliente> ListClient;
        ListClient.add(Nome);
        for (int i = 0; i < ListClient.size(); i++) {


    }
    Conta [] conta= new Conta[5];
        for (int i = 0; i <conta.length; i++) {
        Conta contas= new Conta();
        conta.deposita(i * 100);
        conta[i]=contas;
    }*/
   public void exibeMenu(){

        System.out.println("\t Escolha a opção desejada");
        System.out.println("1 - Consultar Extrato");
        System.out.println("2 - Sacar");
        System.out.println("3 - Depositar");
        System.out.println("4-  Voltar");
        System.out.println("5 - Sair\n");
        System.out.print("Opção: ");

    }
    public void escolheOpcao (int opcao) {
        double valor;

        switch (opcao) {
            case 1:
                extrato();
                break;
            case 2:
                if (saques<3) {
                    System.out.print("Quanto deseja sacar: ");
                    valor = leia.nextDouble();
                    sacar(valor);
                } else {
                    System.out.println("Limite de saques diários atingidos.\n");
                }
                break;

            case 3:
                System.out.print("Quanto deseja depositar: ");
                valor = leia.nextDouble();
                depositar(valor);
                break;

            case 4:
                menu menu=new menu();

                break;
            case 5:
               listarConta();
                break;
            case 6:
                System.out.println("Sistema encerrado.");
                break;
            default:
                System.out.println("Opção inválida");
        }
    }
}
