package Prac2;

public class TestAuthor {
    public static void main(String[] args) {

        Author author1 = new Author("IvanovIvan", "vanya@mail.ru", 'M');
        Author author2 = new Author("AleksandraAleksandrovna", "sasha@mail.ru", 'F');

        System.out.println(author1.toString());
        System.out.println(author2.toString());

        author1.setEmail("ivanov.i.i@edu.mirea.ru");
        System.out.println("После изменения email: " + author1.toString());
    }
}
