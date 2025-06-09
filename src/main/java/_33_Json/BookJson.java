package _33_Json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import lombok.AllArgsConstructor;
import lombok.ToString;

import java.util.Map;

@AllArgsConstructor
@ToString
class Book {
    private String isbn;
    private String title;
    private String author;
    private String price;
    private String publisher;
}

public class BookJson {
    public static void main(String[] args) {
        Gson gson = new Gson();
        Gson gsonBuilder = new GsonBuilder().setPrettyPrinting().create();

        // Book 객체 -> JSON 문자열
        Book book = new Book(
                "978-1234567890",
                "자바의 정석",
                "남궁성",
                "38000",
                "도우출판"
        );

        String jsonBook = gson.toJson(book);
        System.out.println("Book 객체 => JSON 문자열");
        System.out.println(jsonBook);

        System.out.println();

        // Json -> Map
        Map<String, String> bookMap = gson.fromJson(jsonBook, Map.class);
        System.out.println("JSON 문자열 => Map");
        System.out.println(bookMap);

        System.out.println();

        // Map -> Pretty Json
        String prettyJsonFromMap = gsonBuilder.toJson(bookMap);
        System.out.println("Map => Pretty JSON");
        System.out.println(prettyJsonFromMap);

        System.out.println();

        // Json -> Book 객체
        Book parsedBook = gson.fromJson(jsonBook, Book.class);
        System.out.println("JSON => Book 객체");
        System.out.println(parsedBook);
    }
}