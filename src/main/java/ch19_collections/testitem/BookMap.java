package ch19_collections.testitem;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BookMap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> inventory = new HashMap<>();
        while (true) {
            System.out.println("\n--- 도서 재고 관리 프로그램 ---");
            System.out.println("1. 도서 추가");
            System.out.println("2. 재고 수정");
            System.out.println("3. 재고 목록");
            System.out.println("4. 종료");
            System.out.print("메뉴를 선택하세요 >>> ");
            int menu = sc.nextInt();
            sc.nextLine();
            switch (menu) {
                case 1:
                    System.out.print("새 도서명을 입력하세요 >>> ");
                    String newBook = sc.nextLine();
                    if (inventory.containsKey(newBook)) {
                        System.out.println("이미 재고에 있는 도서입니다.");
                    } else {
                        System.out.print("재고 수량을 입력하세요 >>> ");
                        int quantity = sc.nextInt();
                        inventory.put(newBook, quantity);
                        System.out.println(newBook + " 도서가 " + quantity + " 권 추가되었습니다.");
                    }
                    break;
                case 2:
                    System.out.print("재고를 변경할 도서명을 입력하세요 >>> ");
                    String updateBook = sc.nextLine();
                    if (!inventory.containsKey(updateBook)) {
                        System.out.println("해당 도서가 재고에 없습니다.");
                    } else {
                        System.out.print("새로운 재고 수량을 입력하세요 >>> ");
                        int newQuantity = sc.nextInt();
                        inventory.put(updateBook, newQuantity);
                        System.out.println(updateBook + " 도서가 " + newQuantity + " 권으로 변경되었습니다.");
                    }
                    break;
                case 3: // 재고 목록
                    System.out.println("--- 현재 재고 목록 ---");
                    if (inventory.isEmpty()) {
                        System.out.println("재고가 없습니다.");
                    } else {
                        for (Map.Entry<String, Integer> entry : inventory.entrySet()) {
                            System.out.println(
                                    "도서명 : " + entry.getKey() +
                                            ", 재고 수량 : " + entry.getValue() + " 권"
                            );
                        }
                    }
                    break;
                case 4:
                    System.out.println("프로그램을 종료합니다.");
                    sc.close();
                    return;
                default:
                    System.out.println("잘못된 메뉴 선택입니다.");
            }
        }
    }
}