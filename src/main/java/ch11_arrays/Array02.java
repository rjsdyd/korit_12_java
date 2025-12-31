package ch11_arrays;
/*
    1. humans 배열에 이름을 입력할 수 있도록 할것입니다.
    실행 예)
    몇 명의 학생을 등록하시겠습니까? >>> 8
    1번 학생의 이름을 등록하세요 >>> 김일
    2번 학생의 이름을 등록하세요 >>> 김이
    3번 학생의 이름을 등록하세요 >>> 김삼
    4번 학생의 이름을 등록하세요 >>> 김사
    5번 학생의 이름을 등록하세요 >>> 김오
    6번 학생의 이름을 등록하세요 >>> 김육
    7번 학생의 이름을 등록하세요 >>> 김칠
    8번 학생의 이름을 등록하세요 >>> 김팔

    2. scores 배열에 점수를 입력할 수 있도록 할것입니다.
    1번 학생의 점수를 입력하세요 >>> 4.1
    2번 학생의 점수를 입력하세요 >>> 4.2
    3번 학생의 점수를 입력하세요 >>> 4.3
    4번 학생의 점수를 입력하세요 >>> 4.4
    5번 학생의 점수를 입력하세요 >>> 4.5
    6번 학생의 점수를 입력하세요 >>> 3.9
    7번 학생의 점수를 입력하세요 >>> 3.8
    8번 학생의 점수를 입력하세요 >>> 3.7
    학생들의 점수 총합은 32.9입니다.
 */
import java.util.Scanner;

public class Array02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("몇명의 학생을 등록하시겠습니까? >>> ");
        int humans = scanner.nextInt();
        String[] names = new String[humans];
        double[] scores = new double[humans];
        for (int i = 0; i < humans; i++) {
            System.out.print((i + 1) + "번 학생의 이름을 등록하세요 >>> ");
            names[i] = scanner.next();
        }
        double sum = 0;
        for (int i = 0; i < humans; i++) {
            System.out.print((i + 1) + "번 학생의 점수를 입력하세요 >>> ");
            scores[i] = scanner.nextDouble();
            sum += scores[i];
        }
        System.out.println("학생들의 점수 총합은 " + sum + "입니다.");
    }
}
