package Json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
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

        JsonObject jsonObject1 = new JsonObject();
        jsonObject1.addProperty("isbn", "978-1234567890");
        jsonObject1.addProperty("title", "자바의 정석");
        jsonObject1.addProperty("author", "남궁성");
        jsonObject1.addProperty("price", "38000");
        jsonObject1.addProperty("publisher", "도우출판");

        String bookJson = gsonBuilder.toJson(jsonObject1);

        // Json -> Map
        Map map = gson.fromJson(bookJson, Map.class);
        System.out.println(map);

        // Map -> Pretty Json
        System.out.println("gsonBuilder 사용 : " + gsonBuilder.toJson(map));

        // Json -> Book 객체
        Book book = gson.fromJson(bookJson, Book.class);
        System.out.println(book);
    }
}