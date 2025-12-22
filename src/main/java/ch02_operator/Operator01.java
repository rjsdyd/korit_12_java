package ch02_operator;
/*
    Camel case -> Java 상에서의 변수 표기법 (JavaScript에서도 사용)
    Snake case -> Java 에서 쓸 일이 없습니다. 근데 상수 표기에서 비슷하게 사용됨
    Pascal case -> 첫 번째 문자가 대문자고 나머지는 소문자로 가다가 두 번째 단어의 첫 번째 문자는 대문자다.
        ex) 한 단어 짜리 : Operator01
        ex) 복수 단어 : OperatorTestResult -> Pascal case는 클래스 명명 규칙에 해당
*/
public class Operator01 {
    public static void main(String[] args) {
        // 변수 선언 및 초기화
        int i = 10;

        // 이전 패키지까지 해서 자료형, 변수명, 데이터에 대해서 학습했습니다.
        // 이번에는 '='를 학습할 것입니다.
        System.out.println(i);
        i = i + 1;
        System.out.println(i);
        /*
            대입 연산자 (=) : 왼쪽과 오른쪽이 같다는 의미가 아닌 = 오른쪽에 있는 '데이터'를
            = 왼쪽에 있는 '변수'에 "대입"한다는 의미.

            그렇다면 왼쪽과 오른쪽이 같다는 의미로는 어떻게 표시될까요? ==
         */
        // 일반 연산자
        /*
            + : 더하기
            - : 빼기
            * : 곱하기
            / : 나누기
            % : 나머지 연산자
         */
        int a = 5;
        int b = 2;
        System.out.println(a/b);        // 결과값 : 2
        double result = (double) a/b;
        System.out.println(result);     // 결과값 : 2.5

        // 알아서 2.5가 나오면 좋겠지만 아까 말씀드렸던 것처럼 얘네가 생각보다 더 멍청해서
        // 하나하나 잘 지정해줘야 합니다.
        /*
            즉 개발자는 어떤 사람?
            컴퓨터가 잘 작동할 수 있도록 명령을 잘 내리는 사람이다. 라고 생각해주시고
            혹시 컴퓨터가 기분 나쁘지 않는지 체크도 좀 해줘야 합니다.
         */
        /*
            복합 대입 연산자
            1) +=
            2) -=
            3) *=
            4) /=
         */
        int num1 = 1;       // 변수 선언 및 초기화
        System.out.println(num1);
        num1 += 2;          // num1 = num1 + 2; 라는 의미
        System.out.println(num1);
        num1 -= 1;          // num1 = num1 - 1;
        System.out.println(num1);
        num1 *= 10;         // num1 = num2 * 10;
        System.out.println(num1);
        num1 /= 5;          // num1 = num1 / 5;
        System.out.println(num1);

        System.out.println("-------------------------------------------------------");
        int j = 10;
        System.out.println(j);
        System.out.println(j++);        // 변수명++ : 코드를 실행시킨 후에 j에 1를 더함 / 그래서 10
        System.out.println(j);
        System.out.println(++j);        // ++변수명 : 코드를 실행시키기 전에 j에 1을 더함 / 그래서 12
        System.out.println(j);          // 그럼 얘는 변할 일이 없으니까 12
        System.out.println(j--);        // 변수명-- : 코드를 실행시킨 후에 j에 1을 감함 / 그래서 12
        System.out.println(j);          // 그러면 얘는 11이겠네요.
        System.out.println(--j);        // --변수명 : 코드를 실행시키기 전에 j에서 1을 감함 / 10이겠네
        System.out.println(j);          // 10이겠네요.

        int age = 20;
        System.out.println("제 나이는 " + age + "살입니다.");
        System.out.println("내년에는 " + age + 1 + "살이 됩니다.");
        System.out.println("내년에는 " + (age + 1) + "살이 됩니다.");
        // 이상의 경우에서 78번 라인은 왜 원하는 결과값이 나오지 않는지 설명하시오.
        // 첫 번째가 자료형이기 때문에 뒷 부분도 자료형이 되기때문.
        // Operator02 클래스를 생성하시오.
    }
}
