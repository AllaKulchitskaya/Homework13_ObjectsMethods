import java.util.Objects;

public class Book {
    private String title;
    private Author author;
    private int editionYear;

    public Book(String title, Author author, int editionYear) {
        this.title = title;
        this.author = author;
        this.editionYear = editionYear;
    }

    public String getTitle() {
        return this.title;
    }

    public Author getAuthor() {
        return this.author;
    }

    public int getEditionYear() {
        return this.editionYear;
    }

    public void setEditionYear(int editionYear) {
        this.editionYear = editionYear;
    }

    public String toString() {
        return "Автор книги - " + this.author + ", название книги - " + this.title + ", год издания - " + this.editionYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return editionYear == book.editionYear && Objects.equals(title, book.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, editionYear);
    }
}
