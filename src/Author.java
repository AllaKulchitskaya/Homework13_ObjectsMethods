import java.util.Objects;

public class Author {
    private String authorName;
    private String authorSecondName;

    public Author (String authorName, String authorSecondName) {
        this.authorName = authorName;
        this.authorSecondName = authorSecondName;
    }

    public String getAuthorName() {
        return this.authorName;
    }

    public String getAuthorSecondName() {
        return this.authorSecondName;
    }
    public String toString() {
        return this.authorName + " " + this.authorSecondName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(authorName, author.authorName) && Objects.equals(authorSecondName, author.authorSecondName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authorName, authorSecondName);
    }
}
