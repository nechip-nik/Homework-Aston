package homework2;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.Objects;

public final class Student {
    private final String name;
    private final List<Book>  books;
    @JsonCreator
    public Student(@JsonProperty("name") String name, @JsonProperty("books") List<Book> books) {
        if (books == null || books.size() < 5) {
            throw new IllegalArgumentException("Must have at least 5 books");
        }
        this.name = name;
        this.books = List.copyOf(books);
    }
    public String getName() {
        return name;
    }
    public List<Book> getBooks() {
        return books;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name) && Objects.equals(books, student.books);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, books);
    }
    @Override
    public String toString() {
        return getName() + ":" + books;
    }
}
