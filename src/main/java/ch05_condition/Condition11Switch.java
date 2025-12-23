package ch05_condition;

import java.util.Scanner;

/*
    switch문
    형식 :
    switch(변수명)
        case 조건 1 :
            실행문 1
            break;
        case 조건 2 :
            실행문 2
            break;
        case 조건 3 :
            실행문 3
            break;
        default:
            실행문4;
 */
public class Condition11Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        System.out.println("[메뉴선택]");
        System.out.println("1. Java를 공부한다.");
        System.out.println("2. JavaScirpt를 공부한다.");
        System.out.println("3. Python를 공부한다.");
        System.out.println("4. HTML를 공부한다.");
        System.out.println("5. 자습한다.");
        System.out.println("6. 오늘은 휴식.");
        System.out.print("메뉴를 선택하세요 >>> ");
        choice = scanner.nextInt();
        if (choice < 0 || choice > 6) {
            System.out.println("불가능한 메뉴 선택입니다.");
        } else {
            if (choice == 1) {
                System.out.println("메뉴 1을 선택하셨습니다.");
            } else if (choice == 2) {
                System.out.println("메뉴 2을 선택하셨습니다.");
            } else if (choice == 3) {
                System.out.println("메뉴 3을 선택하셨습니다.");
            } else if (choice == 4) {
                System.out.println("메뉴 4을 선택하셨습니다.");
            } else if (choice == 5) {
                System.out.println("메뉴 5을 선택하셨습니다.");
            } else {
                System.out.println("메뉴 6을 선택하셨습니다.");
            }
        }
        // switch문 적용 사례
        switch (choice) {
            case 1:
                System.out.println("메뉴 1을 선택하셨습니다.");
                break;
            case 2:
                System.out.println("메뉴 2을 선택하셨습니다.");
                break;
            case 3:
                System.out.println("메뉴 3을 선택하셨습니다.");
                break;
            case 4:
                System.out.println("메뉴 4을 선택하셨습니다.");
                break;
            case 5:
                System.out.println("메뉴 5을 선택하셨습니다.");
                break;
            case 6:
                System.out.println("메뉴 6을 선택하셨습니다.");
                break;
            default:
                System.out.println("불가능한 메뉴 선택입니다.");
        }
    }
}
