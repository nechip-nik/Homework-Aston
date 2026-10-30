package homework2;

import java.io.IOException;

import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            List<Student> students = new JsonReader().readJson("studens.json");
            students.stream()
                    .peek(System.out::println)
                    .flatMap(student -> student.getBooks().stream())
                    .distinct()
                    .sorted(Comparator.comparingInt(Book::getPages))
                    .filter(book -> book.getYear() >= 2000)
                    .limit(3)
                    .map(Book::getYear)
                    .findFirst()
                    .ifPresentOrElse(year -> System.out.println("Year:" + year), () -> {
                        System.out.println("Book not found");
                    });


        } catch (IOException e) {
            System.err.println("Not found file: " + e.getMessage());
        }


    }
}
