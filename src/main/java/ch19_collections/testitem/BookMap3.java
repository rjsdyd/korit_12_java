package ch19_collections.testitem;

import java.util.*;

public class BookMap3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> books = new HashMap<>();
        String bookTitle = "";
        books.put("Java프로그래밍 입문", 2);
        boolean endOfProgram = false;
        while (!endOfProgram) {
            System.out.println("--- 도서 재고 관리 프로그램 ---");
            System.out.println("1. 도서 추가");
            System.out.println("2. 재고 입고");
            System.out.println("3. 재고 출고");
            System.out.println("4. 종료");
            System.out.print("메뉴를 선택하세요 >>> ");
            int option = scanner.nextInt();
            scanner.nextLine();
            switch (option) {
                case 1:
                    System.out.print("새 도서명을 입력하세요 >>> ");
                    bookTitle = scanner.nextLine();
                    if (books.containsKey(bookTitle)) {
                        System.out.println("이미 재고에 있는 도서입니다.");
                    } else {
                        System.out.print("재고 수량을 입력하세요 >>> ");
                        int stock = scanner.nextInt();
                        scanner.nextLine();
                        books.put(bookTitle, stock);
                        System.out.println(bookTitle + "도서가 " + stock + " 권 추가되었습니다.");
                    }
                    break;
                case 2:
                    System.out.print("입고할 도서명을 입력하세요 >>> ");
                    bookTitle = scanner.nextLine();
                    if (books.containsKey(bookTitle)) {
                        System.out.print("재고 입고분을 입력하세요 >>> ");
                        int temp = scanner.nextInt();
                        int stock = books.get(bookTitle) + temp;
                        System.out.println(bookTitle + " 도서가 " + stock + " 권으로 변경되었습니다.");
                        books.put(bookTitle, stock);
                    } else {
                        System.out.print("해당 도서가 재고에 없습니다.");
                    }
                    break;
                case 3:
                    System.out.print("출고할 도서명을 입력하세요 >>> ");
                    bookTitle = scanner.nextLine();
                    if (books.containsKey(bookTitle)) {
                        System.out.print("재고 출고분을 입력하세요 >>> ");
                        int temp = scanner.nextInt();
                        if (books.get(bookTitle) - temp < 0) {
                            System.out.println("재고가 부족합니다");
                        } else {
                        int stock = books.get(bookTitle) - temp;
                        System.out.println(bookTitle + " 도서가 " + stock + " 권으로 변경되었습니다.");
                        books.put(bookTitle, stock);
                        }
                    } else {
                        System.out.print("해당 도서가 재고에 없습니다.");
                    }
                    break;
                case 4:
                    System.out.println("프로그램을 종료합니다.");
                    endOfProgram = true;
                    break;
                // return;
                default:
                    System.out.println("잘못된 선택입니다.");
            }
        }
    }
}


