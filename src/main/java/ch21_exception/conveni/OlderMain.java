package ch21_exception.conveni;

import java.util.InputMismatchException;
import java.util.Scanner;

public class OlderMain {
    public static void order(int quantity) throws InvalidOrderQuantityException {
        if (quantity < 1 || quantity > 50) {
            throw new InvalidOrderQuantityException("주문 수량이 잘못되었습니다.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("주문 수량을 입력하세요 >>> ");

        try {
            int quantity = scanner.nextInt();
            order(quantity);
        } catch (InvalidOrderQuantityException e) {
            System.out.println("수량 입력 오류 : " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("잘못된 입력입니다.");
        } catch (Exception e) {
            throw new RuntimeException();
        } finally {
            System.out.println("주문 프로세스 완료");
        }
    }
}
