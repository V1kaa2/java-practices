package pr2;

public class TestAuthor {
    public static void main(String[] args) {
        // Создаем автора
        Author author = new Author("Vika", "vikaaa@mail.com", 'w');

        // Выводим информацию
        System.out.println(author);

        // Проверяем смену почты
        author.setEmail("newEmail@mail.com");
        System.out.println("После смены почты: " + author);
    }
}