package pr2;

public class Author {
    // Приватные поля ( -name, -email, -gender)
    private String name;
    private String email;
    private char gender; // 'm', 'f' или 'u'

    // Конструктор
    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    // Геттеры
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public char getGender() {
        return gender;
    }

    // Сеттер только для email
    public void setEmail(String email) {
        this.email = email;
    }

    // Метод toString
    @Override
    public String toString() {
        return name + " (" + gender + ") at " + email;
    }
}