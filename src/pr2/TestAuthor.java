package pr2;

public class TestAuthor {
    public static void main(String[] args) {
        // Создаем автора (пример из методички)
        Author author = new Author("Tan Ah Teck", "ahTeck@somewhere.com", 'm');

        // Выводим информацию (сработает метод toString)
        System.out.println(author);

        // Проверяем смену почты
        author.setEmail("newEmail@mail.com");
        System.out.println("После смены почты: " + author);
    }
}