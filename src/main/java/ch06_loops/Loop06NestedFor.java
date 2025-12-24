package ch06_loops;

import java.util.Scanner;

/*
    중첩 for문도 가능합니다
    for (int i = 0; i < 100; i++) {
        반복실행문 1-a
        for (int j = 0; j < 100; j++) {
            반복 실행문2
        }
        반복실행문 1-b
     }
     for문을 활용하여 1일차 1교시입니다. ~ 5일차 3교시까지입니다. 까지 출력하세오.
     다하면 구구단 for문으로 출력하시오.
 */
    public class Loop06NestedFor {
        public static void main(String[] args) {
//         // 시간 안내
//            int month = 0;
//            int time = 0;
//            for (int i = 1; i < 6; i++) {
//                month += 1;
//            for (int j = 1; j < 4; j++) {
//                time += 1;
//            }
//            System.out.println(month + "일차" + time + "교시입니다.");
//        }

//        // 1 2 3 4 5...6 7 ...10
//        for (int i = 1; i < 101; i++) {
//            System.out.print(i + " ");
//            if (i % 10 == 0) {
//                System.out.println();
//            }
//        }
        // 숫자를 입력받아 1부터 홀수만 더하는 for반복문
        // 다했으면 1부터 짝수만 구하는 for 반복
            Scanner scanner = new Scanner(System.in);
            System.out.print("숫자를 입력해주세요 >>> ");
            int n = scanner.nextInt();
            int sumEven = 0;
            int sumOdd = 0;
            int sum = 0;
            for (int i = 1; i < (n+1); i++) {
                sum += i;
                if (i % 2 == 0) {
                    sumEven += 1;
                } else {
                    sumOdd += 1;
                }
            }
            System.out.println("1부터" + n + "까지 중 홀수의 합은 " + sumOdd + "입니다");
            System.out.println("1부터" + n + "까지 중 짝수의 합은 " + sumEven + "입니다");
            System.out.println(sum);
    }
}