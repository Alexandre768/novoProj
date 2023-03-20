import java.util.Random;

public class agencia {
    String Codigo;
    int Digito;
    String Nome;
    String Banco;
    String Logradouro;
    String Bairro;
    String Numero;
    String Cep;
    String Cidade;
    String Estado;

    Random numero = new Random();
    int agencia = 1 + numero.nextInt(9999);

    public int getAgencia() {
        return agencia;
    }
}


