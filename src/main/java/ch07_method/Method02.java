package ch07_method;

import java.util.Scanner;

/*
    지시사항)
    3개 과목의 점수를 입력 받아서, 총합과 평균 점수를 콘솔창에 표시하시오.

    실행 예)
    몇 과목의 점수를 입력하시겠습니까? >>> 3
    1과목의 점수를 입력하세요 >>> 90
    2과목의 점수를 입력하세요 >>> 100
    3과목의 점수를 입력하세요 >>> 95
    총합은 285.0, 평균은 95.0입니다.
 */
public class Method02 {
    public static void main(String[] args) {
//    Scanner scanner = new Scanner(System.in);
//        System.out.print("몇 과목의 점수를 입력하시겠습니까? >>> ");
//        float a = scanner.nextFloat();
//        System.out.print("1과목의 점수를 입력하세요 >>> ");
//        float b = scanner.nextFloat();
//        System.out.print("2과목의 점수를 입력하세요 >>> ");
//        float c = scanner.nextFloat();
//        System.out.print("3과목의 점수를 입력하세요 >>> ");
//        float d = scanner.nextFloat();
//        System.out.println("총합은 " + (b + c + d) + "이며, " + "평균은 " + ((b+c+d)/a) + "입니다.");

        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        int numOfSubs;
        System.out.print("몇 과목의 점수를 입력하시겠습니까? >>> ");
        numOfSubs = scanner.nextInt();
//        System.out.print("1과목의 점수를 입력하세요 >>> ");
//        sum += scanner.nextDouble();
//        System.out.print("2과목의 점수를 입력하세요 >>> ");
//        sum += scanner.nextDouble();
//        System.out.print("3과목의 점수를 입력하세요 >>> ");
//        sum += scanner.nextDouble();
        for (int i = 0; i < numOfSubs; i++) {
            System.out.print((i+1) + "과목의 점수를 입력하세요 >>> ");
            sum += scanner.nextDouble();
        }

        System.out.println("총합은 " + sum + "이며, " + "평균은 " + (sum/numOfSubs) + "입니다.");
    }
}
