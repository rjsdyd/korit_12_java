package ch20_json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@AllArgsConstructor
@Data
class Book {
    private Long booId;
    private String title;
    private String author;
    private List<String> categories;
}

    public class JSON3Task {
        public static void main(String[] args) {
            // 미션 1
            List<String> categories = new ArrayList<>();
            categories.add("프로그래밍");
            categories.add("컴퓨터공학");
            Book book1 = new Book(
                    101L,
                    "자바 마스터",
                    "안선생",
                    categories);

            // 미션 2
            System.out.println("[미션 2: 객체 -> Json 변환 결과]");
            Gson gsonBuilder = new GsonBuilder().setPrettyPrinting().create();
            String jsonData1 = gsonBuilder.toJson(book1);
            System.out.println(jsonData1);
            System.out.println();

            // 미션 3
            Map<String, Object> bookMap = gsonBuilder.fromJson(jsonData1, Map.class);
            System.out.println("[미션 3: Map 변환 후 제목 추출]");
            System.out.println("도서 제목 : " + bookMap.get("title"));
            System.out.println();

            // 미션 4
            System.out.println("[미션 4: 리스트 -> JSON 배열 변환]");;
            List<Book> books = new ArrayList<>();
            books.add(book1);
            String jsonBooks = gsonBuilder.toJson(books);
            System.out.println(jsonBooks + ",");
            // 미션 4-1
            List<String> categories2 = new ArrayList<>();
            categories2.add("데이터분석");
            Book book4 = new Book(
                    102L,
                    "파이썬 마스터",
                    "김철수"
                    , categories2
            );
            List<Book> books1 = new ArrayList<>();
            books1.add(book4);
            String jsonBooks1 = gsonBuilder.toJson(book4);
            System.out.println(jsonBooks1);
        }
    }
