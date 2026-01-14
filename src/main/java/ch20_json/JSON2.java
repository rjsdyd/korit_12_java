package ch20_json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import lombok.AllArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@AllArgsConstructor
@ToString
class User {
    private String username;
    private String password;
    private String email;
    private String name;
    private String age;
}

public class JSON2 {
    public static void main(String[] args) {
        // 객체 생성
        Gson gson = new Gson();
        Gson gsonBuilder = new GsonBuilder().setPrettyPrinting().create();
        // 하나는 한 줄 출력 / 하나는 pretty printing 적용한 버전 보여주기 위해 두 개 생성

        // 1. Java Object -> json 변환
        /*
            user1 객체를 생성하고, kim1 / 9876 / a@test.com / 김일 / 20의 필드 값을 가지도록 하시오.
            그리고 JSON1.java 참조해서 json 데이터로 바꾸시오.
         */
        User user1 = new User(
                "kim1",
                "9876",
                "a@test.com",
                "김일",
                "20"
        );
        String jsonData1 = gsonBuilder.toJson(user1);
        System.out.println(jsonData1);
        /*
            Map 자료형을 Json 데이터로 바꾸는 것도 가능함.
            ProductCode1을 생성하고,
            "productCode", "MYWY3KH/A"
            "productName", "아이폰 16 프로 맥스"
            로 만드시오.

            Map이 key-value entry를 가지고 있으니
            json의 property로 일대일 대응이 가능함.
            하지만 아직 메서드를 배우진 않았으니 map만 생성
         */
        Map<String, String> productMap1 = new HashMap<>();
        productMap1.put("productCode", "MYWY3KH/A");
        productMap1.put("productName", "아이폰 16 프로 맥스");
        String jsonProduct1 = gson.toJson(productMap1);
        String jsonProduct2 = gsonBuilder.toJson(productMap1);
        System.out.println(jsonProduct1);
        System.out.println(jsonProduct2);
        /*
            이상의 두 사례에서 toJson()이라는 메서드는 argument로 Java Object 자체를 넣는것도,
            Map으로 생성된 entry를 Json 형태로 바꾸는 것도 가능하다는 것을 확인함.
            그리고 JsonObject 객체도 바꿀 수 있겠음.

            그러면 반대로 json -> Map / Java Object로 바꾸는 것도 가능하겠음.

            근데 String data인 json을 "" 포함해서 생성하는게 너무 귀찮기 때문에
            user1과 productMap1을 json으로 바꾼 데이터를 바꿔보겠음.

            jsonData2를 user2 객체로 변경해보겠음. String -> User으로 바꾸겠음.
            jsonProduct를 productMap2로 바꾸겠음.
         */
        User user2 = gsonBuilder.fromJson(jsonData1, User.class);
        System.out.println(user2);
        Map<String, String> productMap2 = gson.fromJson(jsonProduct1, Map.class);
        System.out.println(productMap2);

        // 그러면 JsonData1 / 2 를 userMap1으로 바꿀 수 있음.
        // field : fieldValue로 일대일 매칭이 되니까.

        /*
            하지만 jsonProduct1 / 2는 java Object로 못바꿈.
            -> 클래스가 아직 정의되지 않았으니까.

            그러면 jsonData1을 Map 자료형의 userMap1 으로 변경하시오.
         */
        Map<String, String> userMap1 = gson.fromJson(jsonData1, Map.class);
        System.out.println(userMap1);

        List<User> users = new ArrayList<>();
        users.add(user1);
        System.out.println(users);
        String jsonUsers = gsonBuilder.toJson(users);
        System.out.println(jsonUsers);
    }
}
