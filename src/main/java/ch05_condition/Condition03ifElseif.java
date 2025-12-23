package ch05_condition;

/*
    if - else if 문 : if - else 문과 달리 else if에는 별도의 조건식이 요구됨.
    그리고 else if는 복수로 나올 수 있습니다.

    형식 :
    if(조건식) {
        실행문1
    } else if (조건식) {
        실행문2
    } else if (조건식3) {
        실행문3
    }
*/

import java.util.Scanner;

public class Condition03ifElseif {
    public static void main(String[] args) {
        // 사용되는 클래스를 먼저 쓰는 편
        Scanner scanner = new Scanner(System.in);

        // 사용되는 변수 / 상수를 선언 및 초기화
        int point;
        // 상수 개념을 처음 설명 -> 얘는 초기화가 필수
        final int VIP_POINT = 100;      // final 키워드가 붙으면 '재대입'이 불가능
        final int GOLD_POINT = 80;      // 즉, 변함없는 데이터를 사용하고 싶을 때
        final int SILVER_POINT = 60;    // 사용하는데, 얘가 변함없는 데이터임을
        final int BRONZE_POINT = 40;    // 개발자들이 알아보기 위해
                                        // 어제 말한 snake_case를 활용하여 대문자로만
                                        // 작성합니다. 띄어쓰기는 '_' 사용.
        System.out.print("포인트를 입력하세요 >>> ");
        point = scanner.nextInt();      // 여기서 초기화가 이루어지겠네요.

        if(point > VIP_POINT) {
            System.out.println("회원등급 : VIP");
        } else if (point > GOLD_POINT) {
            System.out.println("회원등급 : GOLD");
        } else if (point > SILVER_POINT) {
            System.out.println("회원등급 : SILVER");
        } else if (point > BRONZE_POINT) {
            System.out.println("회원등급 : BRONZE");
        }

        // 풀이법 #2
        String userGrade = "";
        if(point > VIP_POINT) {
            userGrade = "VIP";
            System.out.println("회원등급 : " + userGrade);
        } else {
            if (point > GOLD_POINT) {
                userGrade = "GOLD";
            } else if (point > SILVER_POINT) {
                userGrade = "SILVER";
            } else if (point > BRONZE_POINT) {
                userGrade = "BRONZE";
            }
            System.out.println("회원등급 : " + userGrade);
        }

        /*
            풀이법 #1의 경우에는 20점 이하의 포인트를 가지게 될 경우 실행되는 부분이 없습니다.

            풀이법 #2의 경우에는 반복되는 print문이 없어도 된다는 점에서 장점을 가지고 있지만 20점 이하인 경우에도 59번 라인이 실행되고,
            20점 이하의 경우 userGrade가 ""에서 변화되지 않기 때문에 결과값이
            회원등급 : 이라는 빈칸이 생기게 단점이 있겠습니다.
         */
    }
}
