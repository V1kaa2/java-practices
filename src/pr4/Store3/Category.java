package pr4;

public enum Category {
    ELECTRONICS("Электроника"),
    CLOTHING("Одежда"),
    BOOKS("Книги");

    private final String title;

    Category(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}