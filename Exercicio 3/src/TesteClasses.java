import java.util.Scanner;

public class TesteClasses {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int escolha = 0;

        while (escolha != 1 && escolha != 2) {
            System.out.println("Deseja cadastrar \n1- Estudante \n2- Staff");
           escolha = scanner.nextInt();
           scanner.nextLine();

            if (escolha != 1 && escolha != 2) {
                System.out.println("Opção inválida! Tente novamente.");
            }
        }

        if (escolha == 1) {
            System.out.println("Digite o nome do estudante:");
            String name = scanner.nextLine();
            System.out.println("Digite o endereço do estudante:");
            String address = scanner.nextLine();
            System.out.println("Digite o curso do estudante:");
            String program = scanner.nextLine();
            System.out.println("Digite o ano de entrada do estudante:");
            int year = scanner.nextInt();
            System.out.println("Digite a taxa (mensalidade) do estudante:");
            double fee = scanner.nextDouble();

            Student student = new Student(name, address, program, year, fee);
            System.out.println("Estudante cadastrado com sucesso!");

            System.out.printf("\nNome: %s,\nEndereço: %s,\nCurso: %s, \nAno de entrada: %d,\nMensalidade: %.2f\n", 
                    student.getName(), 
                    student.getAddress(), 
                    student.getProgram(), 
                    student.getYear(),
                    student.getFee());
            System.out.println("%n" + student);
            
        } else if (escolha == 2) {
            // Cadastro de Funcionário (Staff)
            System.out.println("Digite o nome do funcionário:");
            String name = scanner.nextLine();

            System.out.println("Digite o endereço do funcionário:");
            String address = scanner.nextLine();

            System.out.println("Digite a escola onde o funcionário trabalha:");
            String school = scanner.nextLine();

            System.out.println("Digite o salário do funcionário:");
            double pay = scanner.nextDouble();

            Staff staff = new Staff(name, address, school, pay);
            System.out.println("Funcionário cadastrado com sucesso!");

            System.out.printf("\nNome: %s,\nEndereço: %s,\nEscola: %s, \nSalário: %.2f\n", 
                    staff.getName(), 
                    staff.getAddress(), 
                    staff.getSchool(), 
                    staff.getPay());
                    
            System.out.println("\n" + staff);

        } else {
            System.out.println("Opção inválida!");
        }

        scanner.close();
        
    }
}
