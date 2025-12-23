package ch05_condition;

import java.util.Scanner;

public class Condition12Switch2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String choice;

        System.out.println("[메뉴선택]");
        System.out.println("a. Java를 공부한다.");
        System.out.println("b. JavaScirpt를 공부한다.");
        System.out.println("c. Python를 공부한다.");
        System.out.println("d. HTML를 공부한다.");
        System.out.println("e. 자습한다.");
        System.out.println("f. 오늘은 휴식.");
        System.out.print("메뉴를 선택하세요 >>> ");
        choice = scanner.nextLine();
        switch (choice) {
            case "a":
                System.out.println("메뉴 a을 선택하셨습니다.");
                break;
            case "b":
                System.out.println("메뉴 b을 선택하셨습니다.");
                break;
            case "c":
                System.out.println("메뉴 c을 선택하셨습니다.");
                break;
            case "d":
                System.out.println("메뉴 d을 선택하셨습니다.");
                break;
            case "e":
                System.out.println("메뉴 e을 선택하셨습니다.");
                break;
            case "f":
                System.out.println("메뉴 f을 선택하셨습니다.");
                break;
            default:
                System.out.println("불가능한 메뉴 선택입니다.");
        }
    }
}
