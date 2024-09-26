import java.util.Scanner;

public class Author {
    private String name, email;
    private char gender;

    public Author(String name, String email, char gender){
        this.name = name;
        this.email= email;

        while (gender != 'm' && gender != 'f') {
            System.out.println("Gênero inválido. Insira 'm' ou 'f': ");
            Scanner scanner = new Scanner(System.in);
            gender = scanner.next().charAt(0);
        }
        this.gender = gender;

        System.out.printf("nome: %s \nemail: %s \ngênero: %c", name, email, gender );
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender() {
        return gender;
    }


    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Author[name=" + name +",email=" + email +",gender=" + gender + "]";
    }
}
