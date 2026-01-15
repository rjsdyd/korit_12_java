package ch21_exception.bank;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BankMain {
    public static void withdraw(int amount) throws InsufficientBalanceException {
        int balance = 10000;
        if (amount > balance) {
            throw new InsufficientBalanceException("잔액이 부족합니다." + balance);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("출금 금액을 입력하세요 >>> ");

        try {
            int amount = scanner.nextInt();
            withdraw(amount);
        } catch (InsufficientBalanceException e) {
            System.out.println("금액 입력 오류 : " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("잘못된 입력입니다.");
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }
}
