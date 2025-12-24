package ch07_method;

import java.util.Scanner;

public class Method01 {
// method 정의 영역
    // 1. [x | x] [입력값 / 출력값]
    public static void call1() {
        System.out.println("[x | x]");
    }

    // 2. [o | x]
    public static void call2 (String example) {     // 그럼 여기서 String example은 매개변수라고 합니다.
        System.out.println("[o | x]");
        System.out.println("오늘의 기분은 : " + example);
        System.out.println();
    }

    // 3. [x | o]
    public static String call3() {
        String example = "안녕하세요";
        int example2 = 1234;
        System.out.println("[x | o]");
        return example;
    }

    // 4. [o | o]
    public static double call4(double score) {
        System.out.println("[o | o]");
        System.out.println("해당 과목은 3학점 짜리입니다.");
        return score * 3;
    }

    // 번외 - 매개변수의 개수가 여러 개 일 수 있다.
    public static String introduce(String name, int age) {
        return "제 이름은 " + name + "이고, 나이는 " + age + "살입니다.\n내년에는 " + (age + 1) + "살이 됩니다.";
    }

    public static void main(String[] args) {
        introduce("안근수", 38);
        System.out.println(introduce("안근수", 38));

        /*
            return이 있는 이유는 기본적으로 데이터의 조작 (편집)을 위해서입니다.
            그리고 특정 메서드의 결과값 (return)이 다른 메서드의 argument로 사용될 수 있습니다.

            함수형 프로그래밍 (functional programming) :
            메서드1의 return 값이 메서드2의 argument가 되고, 메서드2의 return값이 메서드3의 argument가 되는 방식으로,
            첫 번째 메서드로부터 마지막 메서드까지의 흐름을 통해 프로그램이 이어지는 방식

            간단 예시)
         */
        String name;
        int age;
        Scanner scanner = new Scanner(System.in);
        System.out.print("이름을 입력하세요 >>> ");
        name = scanner.nextLine();
        System.out.print("나이를 입력하세요 >>> ");
        age = scanner.nextInt();
        System.out.println(introduce(name, age));

        // method 호출 영역
        call1();            // 얘는 argument가 없는거네요.
        call2("잠오고 피곤하고 공부가 하기 싫은데 굳이 선택하라고 하면 자습이 하고 싶다.");
        // 위의 메서드는 argument가 있는데, 그 argument의 자료형으로 String을 요구합니다.
        String felling = "tired and sick";
        call2(felling);
        call3();
        System.out.println(call3());
        // return이라는 것은 콘솔에 출력하라는 의미가 절대 아니고 특정 데이터가 뽑혀져 나온다는 겁니다.
        // 그것을 변수에 저장한 다음에 개발자들은 개발자 입맛대로 편집해서 새로운 결과값을 만들어내는 역할을 합니다.

        call4(4.5);
        System.out.println(call4(4.5));
    }
}
