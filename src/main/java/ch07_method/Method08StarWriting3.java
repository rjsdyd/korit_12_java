package ch07_method;

import java.util.Scanner;

public class Method08StarWriting3 {
    public static String getStar() {
        String result = "";
        Scanner scanner = new Scanner(System.in);
        int row = 0;     // 몇 줄짜리 만들건지
        int choice = 0;         // 증가하는 별인지 감소하는 별인지 etc
        String starResult = ""; // 별은 String 자료형이라서 이런식으로 선언 및 초기화

        System.out.print("몇 줄 짜리 별을 생성하시겠습니까? >> ");
        row = scanner.nextInt();

        System.out.println("1. 왼쪽으로 치우친 증가하는 별");
        System.out.println("2. 오른쪽으로 치우친 증가하는 별");
        System.out.println("3. 왼쪽으로 치우친 감소하는 별");
        System.out.println("4. 오른쪽으로 치우친 감소하는 별");
        System.out.print("어떤 유형의 별을 생성하시겠습니까? >> ");
        choice = scanner.nextInt();
        switch (choice) {
            case 1:
                for (int i = 0; i < row + 1; i++) {
                    // 별을 책임지는 안쪽 for
                    for (int j = 0; j < i; j++) {
                        result += "*";
                    }
                    result += "\n";
                }
                break;
            case 2:
                for (int i = 0; i < row + 1; i++) {
                    for (int j = row; j > i; j--) {
                        result += " ";
                    }
                    for (int k = 0; k < i; k++) {
                        result += "*";
                    }
                    result += "\n";
                }
                break;
            case 3:
                for (int i = 0; i < row; i++) {
                    for (int k = row; k > i; k--) {
                        result += "*";
                    }
                    result += "\n";
                }
                break;
            case 4:
                for (int i = 0; i < row; i++) {
                    for(int j = 0; j < i; j++) {
                        result += " ";
                    }
                    for(int k = row; k > i; k--) {
                        result += "*";
                    }
                    result += "\n";
                }
                break;
            default:
                result = "불가능한 숫자 입력입니다. 1 ~ 4 사이의 정수만 입력해주세요.";
        }

        return result;
    }

    public static void main(String[] args) {
        // getStar() 메서드가 2번 실행될 수 있도록 반복문을 작성하시오.
        // 1. for문
//        for (int i = 0; i < 2; i++) {
//            System.out.println(getStar());
//        }
//        // 2. while문
//        int num = 0;
//        while (num < 2) {
//            System.out.println(getStar());
//            num++;
//        }
        // while 문의 경우 횟수를 고정시키기 보다는 특정 조건에 맞춰서 진행된다고 했습니다.
        // 그 부분에 대한 예시입니다.
        boolean continued = true;
        while (continued) {
            System.out.println(getStar());
            System.out.println("계속하시겠습니까? Y(1) / N(0) >>> ");
            Scanner scanner = new Scanner(System.in);
            int answer = scanner.nextInt();
            switch (answer) {
                case 1:
                    break;
                case 0:
                    continued = !continued;     // 대입 연산자 개념
                    break;
                default:
                    System.out.println("불가능한 선택입니다. >>> 0과 1을 선택해주세요.");
                    continued = !continued;
            }
        }
    }
}
