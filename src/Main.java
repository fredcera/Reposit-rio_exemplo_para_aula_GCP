import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Sistema de identificação de pessoa:");

        System.out.println("\nInsira o nome da pessoa: ");
        String nome = ler.nextLine();

        System.out.println("\nInsira a idade:");
        double idade = Double.parseDouble(ler.nextLine());

        Pessoas pessoa = new Pessoas(nome, idade);

        System.out.println("A pessoa é: " + pessoa.toString());
    }
}
