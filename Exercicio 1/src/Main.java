import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Inserindo valores
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome: ");
        String nome = scanner.nextLine();


        System.out.println("Digite o email: ");
        String email = scanner.nextLine();
        

        System.out.println("Digite o gênero (m/f): ");
        char gender = scanner.next().charAt(0);

        // Teste Construtor
        System.out.println("\nTeste construtor");
        Author author = new Author(nome, email, gender);
        
        // Teste toString
        System.out.println("\nMétodo toString:");
        System.out.println("\n"+ author.toString() + "\n");
        scanner.nextLine();

        // Teste Setter
        System.out.println("Testando Setter");
        System.out.println("Digite seu novo e-mail: ");
        String newEmail = scanner.nextLine();
        author.setEmail(newEmail);
        System.out.println("Seu e-mail foi alterado com sucesso! \nSeu novo e-mail é " + author.getEmail());

        System.out.println("\nTestando Getters");
        System.out.println("Nome: " + author.getName());
        System.out.println("Email: " + author.getEmail());
        System.out.println("Gênero: " + author.getGender());
    }
}
