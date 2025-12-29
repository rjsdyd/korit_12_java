package ch07_method;
// Method03,04ScoreCalc1, 2도 확인하세요.
import java.util.Scanner;

public class Method05ScoreCalc3 {
    public static double calcSum(int numOfSubs) {
        double sum = 0;         // 지역 변수 sum 선언 및 초기화
        Scanner scanner = new Scanner(System.in);
//      주석 처리했습니다. 여기서 지역변수 numOfSubs를 쓰는게 아니라 매개변수 numOfSubs를 쓴다는 뜻.
//      int numOfSubs = scanner.nextInt();
        for ( int i = 0 ; i < numOfSubs ; i++ ) {
            System.out.print((i+1) + " 과목의 점수를 입력하세요. >>> ");
            sum += scanner.nextDouble();
        }
        return sum;
    }

    public static void calcAvg() {
        Scanner scanner = new Scanner(System.in);
        int numOfSubs = 0;
        double avgScore = 0;
        System.out.print("몇 개의 과목을 입력하시겠습니까? >> ");
        numOfSubs = scanner.nextInt();      // 이건 Java 내장 method를 호출한 경우죠.
        double sum = calcSum(numOfSubs);    // method 내에서 사용자 정의 method를 호출하는 것이 가능합니다.
        avgScore = sum / numOfSubs;
        System.out.println("총합은 " + sum + "이며, 평균은 " + avgScore + "입니다.");
    }

    public static void main(String[] args) {
        calcAvg();
    }
}