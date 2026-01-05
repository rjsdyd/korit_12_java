package ch11_arrays;

public class Array09EnhancedFor {
    public static void main(String[] args) {
        String[] person = {"김일", "김이", "김삼", "김사", "김오"};
        /*
            실행 예)
            1번 : 김일
            2번 : 김이
            3번 : 김삼
            4번 : 김사
            5번 : 김오
            로 출력되도록 일반 for문으로 한번
         */
        // 일반 for문
        for (int i = 0; i < person.length; i++) {
            System.out.println((i+1) + "번 : " + person[i]);
        }
        System.out.println();
        // 향상 for문
        int i = 0;
        for (String humen : person) {
            ++i;
            System.out.println(i + "번 : " + humen);
        }
    }
}
