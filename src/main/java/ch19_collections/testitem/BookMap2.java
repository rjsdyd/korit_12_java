package ch19_collections.testitem;

import java.util.*;

public class BookMap2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> books = new HashMap<>();
        String bookTitle = "";
        books.put("Java프로그래밍 입문", 2);
        boolean endOfProgram = false;
        while (!endOfProgram) {
            System.out.println("--- 도서 재고 관리 프로그램 ---");
            System.out.println("1. 도서 추가");
            System.out.println("2. 재고 수정");
            System.out.println("3. 재고 목록");
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
                    System.out.print("수량을 변경할 도서명을 입력하세요 >>> ");
                    bookTitle = scanner.nextLine();
                    if (books.containsKey(bookTitle)) {
//                        System.out.print("\n새로운 재고 수량을 입력하세요 >>> ");
//                        int stock = scanner.nextInt();
//                        scanner.nextLine();
//                        System.out.println(bookTitle + " 도서가 " + stock + " 권으로 변경되었습니다.")
//                        books.replace(bookTitle, stock);

                        // 이하의 코드에서의 추가사항 : 책이 팔리면 -1로 입력
                        System.out.print("재고 변경분을 입력하세요 >>> ");
                        int temp = scanner.nextInt();
                        int stock = books.get(bookTitle) + temp;
                        System.out.println(bookTitle + " 도서가 " + stock + " 권으로 변경되었습니다.");
                        books.put(bookTitle, stock);
                    } else {
                        System.out.print("해당 도서가 재고에 없습니다.");
                    }
                    break;
                case 3:
                    Set<String> bookTitleSet = books.keySet();
                    List<String> bookTitles = new ArrayList<>();
                    bookTitles.addAll(bookTitleSet);
                    for (String book : bookTitles) {
                        System.out.println("도서명 : " + book + ", 현재 재고 : " + books.get(book));
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
