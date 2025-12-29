package ch07_method;

import java.util.Scanner;

public class Method04ScoreCalc2 {
    // method 정의 영역 - 이전의 메서드 03에서 정의한 방식은 하나의 메서드에 총합을 구하는 메서드와
    // 평균을 구하는 메서드가 합쳐져 있었습니다.

    // 이번 단계에서는 1. 합을 구하는 메서드 / 2. 평균을 구하는 메서드를 작성하고
    // 평균을 구하는 메서드 내에서 합을 구하는 메서드를 호출하는 방식으로 작성할겁니다.

    // 그리고 메서드 호출 영역에는 '평균을 구하는 메서드'만 호출

    // 1. 합을 구하는 메서드
    public static double calcSum(int numOfSubs) {
        double sum = 0;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < numOfSubs; i++) {
            System.out.print((i+1) + "과목의 점수를 입력하세요 >>> ");
            sum += scanner.nextDouble();
        }
        return sum;
    }

    // 2. 평균을 구하는 메서드
    public static double calcAvg() {
        // 여기서 스캐너로 과목 수를 입력받습니다.
        Scanner scanner = new Scanner(System.in);

        System.out.print("몇 개의 과목을 입력하시겠습니까? >>> ");
        int numOfSubs = scanner.nextInt();
        double sum = calcSum(numOfSubs);
        return sum / numOfSubs;
        // 그리고 합 구할 때 여기에 argument로 과목 수를 보내줘야 합니다. -> 그러면 정의 영역도 수정해야함
        // 그리고 return으로 합을 가지고 sum / 과목수를 해서 평균을 구하면 답이 나올거 같습니다.
    }


    public static void main(String[] args) {
        // method 호출 영역
        System.out.println("평균 점수 : " + calcAvg());
    }
}
