package ch02_operator;
/*
    논리 연산자
    true(1) / false(0) : 컴퓨터가 읽을 수 있는 두 숫자
    boolean : true / false를 구분하는 자료형

    AND(&&) : 곱 연산자 T x T = T / T X F = F / F X F = F -> 하나라도 false면 false
    OR(||) : 합 연산자 T + T = T / T + F = T / F + F = F -> 하나라도 true면 true
    Not(!) : true 값을 false로, false 값을 true로 역전시키는 연산자
*/
public class Operator02 {
    public static void main(String[] args) {
        // 변수 선언 및 초기화
        boolean flag1 = true;
        boolean flag2 = false;

        // && 연산자 부분으로 result 1, 2, 3으로 작성
        System.out.println("----&& 연산자----");
        boolean result1 = flag1 && flag1;
        System.out.println("T X T = " + result1);
        boolean result2 = flag1 && flag2;
        System.out.println("T X F = " + result2);
        boolean result3 = flag2 && flag2;
        System.out.println("F X F = " + result3);

        // || 연산자 부분을 result4, 5, 6으로 작성하시오.
        System.out.println("----|| 연산자----");
        boolean result4 = flag1 || flag1;
        System.out.println("T + T = " + result4);
        boolean result5 = flag1 || flag2;
        System.out.println("T + F = " + result5);
        boolean result6 = flag2 || flag2;
        System.out.println("F + F = " + result6);
        
        // ch03_scanner 패키지 생성 / Scanner01 클래스 생성 -> main 적용
    }
}
