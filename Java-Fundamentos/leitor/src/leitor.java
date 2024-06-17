import java.util.Locale;
import java.util.Scanner;

public class leitor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);




        System.out.println("Digite seu Nome: ");
        String nome = scanner.next();

        System.out.println("Digite seu Sobrenome: ");
        String sobreNome = scanner.next();

        System.out.println("Digite sua Idade: ");
        int idade = scanner.nextInt();


        System.out.println("Digite Sua altura: ");
        double altura = scanner.nextDouble();


        System.out.println(nome);
        System.out.println(sobreNome);
        System.out.println(idade);
        System.out.println(altura);

    }




    
}
