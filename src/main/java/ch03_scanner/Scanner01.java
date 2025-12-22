package ch03_scanner;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {
        // 변수 선언
        String name;
        // 초기화
        name = "안근수";
        System.out.println(name);
        Scanner scanner = new Scanner(System.in);
        // 변수에 재대입
        System.out.print("이름을 입력하세요 >>> ");
        name = scanner.nextLine();
        System.out.println(name);
        /*
            1. println vs print
                ln : line의 의미로 실행하면 출력문이 다 나오고 나서 개행
                print로 작성하면 동일 라인에 그대로 연결됨.
            2. nextLine vs next 등 다른 차이도 있습니다. -> 내일 수업

            현재까지의 상황에서
            Scanner scanner = new Scanner(System.in);
            이란 것을 쓰니까 콘솔에 데이터를 입력해서 변수에 저장할 수 있고
            그 변수 (name)을 println하는 것이 가능하다 정도로 아는 것으로
            충분합니다.

            하지만 혹시 예습을 하고 싶은 분들은
            Scanner scanner = new Scanner(System.in);이 '객체 생성'을 했고
            Scanner.nextLine();은 '메서드 호출'과 관련있는 개념이기 때문에 관련
            부분을 학습하시면 됩니다.
         */
    }
}
