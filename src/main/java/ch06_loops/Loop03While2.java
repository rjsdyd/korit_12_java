package ch06_loops;
/*
    중첩 while문 (Nested - while)
    형식 :
    while (조건식) {
        반복실행문1-a
        while (조건식2) {
            반복실행문2
        }
        반복실행문 1-b
    }
 */
public class Loop03While2 {
    public static void main(String[] args) {
        int day = 1;
        while (day < 6) {
            int lesson = 1;         // 반복실행문 1a
            while (lesson < 4) {
                System.out.println(day + "일차" + lesson + "교시입니다");      // 반복실행문2
                lesson++;
            }
            day++;          // 반복실행문 1b
        }
        int i = 1;
        while (i < 11) {
            System.out.println(i);
            i++;
        }
        // System.out.println(lesson);
        // 이상의 코드가 오류가 나느 이유는 추후 설명 예정이지만 도입된 개념은 범위, 전역, 지역에 해당합니다.

        /*
            이상의 중첩 while을 분석하여
            2 X 1 = 2
            ....
            9 X 9 = 81
         */
        int num1 = 2;
        while (num1 < 10) {
            int gugudan = 1;
            while(gugudan < 10) {
                System.out.println(num1 + "X" + gugudan + "=" + (num1*gugudan));
                gugudan++;
            }
            System.out.println("");
            num1++;
        }
    }
}
