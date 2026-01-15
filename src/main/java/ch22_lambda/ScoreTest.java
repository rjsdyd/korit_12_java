package ch22_lambda;

import java.util.List;

public class ScoreTest {
    public static void main(String[] args) {
        List<Integer> scores = List.of(23, 2421, 123, 13, 213, 5153, 142, 213, 423, 1, 5 ,51);
        scores.stream()                                // 1. StreamAPI를 사용할것임
                .filter(s -> s >= 60)           // 2. 60점 미만은 뺌
                .map(s -> s + 5)                // 3. 남아있는 거에 5점씩 더함
                .sorted()                              // 4. 오름차순 정렬
                .forEach(System.out::println);         // 5. 출력
    }
}
