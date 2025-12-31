package ch10_access_modifier.bank;

class Bank {
    // 필드
    private int accountNum;          // 계좌번호
    private String accountHolder;    // 예금주
    private int balance;             // 잔액
    private int pinNumber;           // 비밀번호 (0 ~ 9999)

    // 생성자
    public Bank() {}

    public Bank(int accountNum) {
        this.accountNum = accountNum;
    }

    public Bank(int accountNum, String accountHolder) {
        this.accountNum = accountNum;
        this.accountHolder = accountHolder;
    }

    public Bank(int accountNum, String accountHolder, int balance) {
        this.accountNum = accountNum;
        this.accountHolder = accountHolder;
        setBalance(balance);
    }

    public Bank(int accountNum, String accountHolder, int balance, int pinNumber) {
        this.accountNum = accountNum;
        this.accountHolder = accountHolder;
        setBalance(balance);
        setPinNumber(pinNumber);
    }

    // Getter / Setter
    public int getAccountNum() {
        return accountNum;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public int getBalance() {
        return balance;
    }

    public int getPinNumber() {
        return pinNumber;
    }

    public void setBalance(int balance) {
        if (balance < 0) {
            this.balance = 0;
        } else {
            this.balance = balance;
        }
    }

    public void setPinNumber(int pinNumber) {
        if (pinNumber < 0 || pinNumber > 9999) {
            System.out.println("불가능한 비밀번호입니다.");
            return;
        }
        this.pinNumber = pinNumber;
    }

    // 입금 메서드
    public void deposit(int amount, int inputPin) {
        if (inputPin != pinNumber) {
            System.out.println("비밀번호가 틀렸습니다.");
            return;
        }

        if (amount <= 0) {
            System.out.println("불가능한 입력 금액입니다.");
            return;
        }

        balance += amount;
        System.out.println(amount + "원이 입금되었습니다. " + "현재 잔액 : " + balance + "원");
    }

    // 출금 메서드
    public void withdraw(int amount, int inputPin) {
        if (inputPin != pinNumber) {
            System.out.println("비밀번호가 틀렸습니다.");
            return;
        }

        if (amount <= 0) {
            System.out.println("불가능한 입력 금액입니다.");
            return;
        }

        if (balance - amount < 0) {
            System.out.println("잔액이 부족하여 출금할 수 없습니다.");
            return;
        }

        balance -= amount;
        System.out.println(amount + "원이 출금되었습니다. 현재 잔액 : " + balance + "원");
    }

    // 계좌 정보 출력
    public void showAccountInfo() {
        System.out.println("계좌 번호 : " + accountNum);
        System.out.println("계좌 소유자 : " + accountHolder);
        System.out.println("현재 잔액 : " + balance + "원\n");
    }
}

public class BankMain {
    public static void main(String[] args) {

        Bank account1 = new Bank(123456, "홍길동", 100000, 1111);
        Bank account2 = new Bank(987654, "신사임당", 500000, 2222);

        account1.showAccountInfo();
        account2.showAccountInfo();

        account1.deposit(50000, 1111);
        account1.withdraw(200000, 1111);
        account1.withdraw(100000, 1111);

        account2.withdraw(100000, 2222);
        account2.deposit(200000, 2222);

        System.out.println("\n최종 계좌 정보");
        account1.showAccountInfo();
        account2.showAccountInfo();
    }
}
