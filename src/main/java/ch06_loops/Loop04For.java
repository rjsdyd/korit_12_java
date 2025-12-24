package ch06_loops;
/*
    for 반복문 (for Loop)
    : 대부분의 경우 횟수가 고정되어 있을 때 사용하는 반복문

    그럼 무엇을 기준으로 for / while을 선택하는가?
    : 횟수를 기준으로 특정 반복 횟수가 되었을 때 반복을 정지하고 싶다면 = for
    : 몇번이나 진행될지 모르지만 특정 상태가 되었을 때 반복을 정지하고 싶다면 = while

    형식 :
    for (시작값 ; 종료값 ; 증감값) {
        반복실행문
    }
 */
public class Loop04For {
    public static void main(String[] args) {
        // while문
        int i = 1;
        while (i < 11) {
            System.out.println(i++ + " ");
            i++;
        }

        ;      // for문
        for (int j = 1; j < 11; j++) {
            System.out.println(j + " ");
        }

        // 1부터 100까지의 합을 구하시오. (for문)
        int sum = 0;
        for (int k = 1; k < 101; k++) {
            sum += k;
        }
        System.out.print(sum);

        // 1부터 100까지의 숫자 중에서 홀수 합만 구하는 코드를 구하시오.
    }
}
