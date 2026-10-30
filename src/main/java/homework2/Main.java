package homework2;

import java.io.IOException;

import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        List<Student> students = new JsonReader().readJson("studens.json");
//        students.stream()
//                .flatMap(student -> student.getBooks().stream())
//                .distinct()
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
