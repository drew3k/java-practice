package prac2;

public class Task1 {
    private final String name;
    private String email;
    private final char gender;

    public Task1(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
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
        return "Name: " + name + ", email: " + email + ", gender: " + gender;
    }

    public static void main(String[] args) {
        Task1 author = new Task1("Даниил", "daniil@example.com", 'M');

        System.out.println("Author name: " + author.getName());
        System.out.println("Author email: " + author.getEmail());
        System.out.println("Author gender: " + author.getGender());

        author.setEmail("daniil-new@example.com");
        System.out.println("Updated email: " + author.getEmail());

        System.out.println(author.toString());
    }
}
