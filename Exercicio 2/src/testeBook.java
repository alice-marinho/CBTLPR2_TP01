import java.util.Scanner;

public class testeBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //livro 1 - autor 1 
        System.out.println("Digite o nome do livro 1: ");
        String book1Name = scanner.nextLine();
        
        System.out.println("Digite o preço do livro 1: ");
        double book1Price = scanner.nextDouble();
        
        System.out.println("Digite a quantidade do livro 1: ");
        int book1Qty = scanner.nextInt();
        scanner.nextLine(); 

        Author author1 = new Author("Suzanne Collins", "suzanne.collins@gmail.com", 'f');
        
        Author[] authorsBook1 = {author1};
        Book book1 = new Book(book1Name, authorsBook1, book1Price, book1Qty);
        
        System.out.println("Informações do Livro 1:");
        System.out.println(book1);
        
        //livro 2 - autor 2
        System.out.println("\nDigite o nome do livro 2: ");
        String book2Name = scanner.nextLine();
        
        System.out.println("Digite o preço do livro 2: ");
        double book2Price = scanner.nextDouble();
        
        System.out.println("Digite a quantidade do livro 2: ");
        int book2Qty = scanner.nextInt();
        scanner.nextLine(); 

        Author author2 = new Author("Rick Riordan", "rick.riordan@gmail.com", 'm');
        
        Author[] authorsBook2 = {author2};
        Book book2 = new Book(book2Name, authorsBook2, book2Price, book2Qty);
        
        System.out.println("Informações do Livro 2:");
        System.out.println(book2);

        scanner.close(); 
    }
}
