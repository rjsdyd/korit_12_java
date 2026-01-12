package ch18_generic.bmi;

public class PersonMain {
    public static void main(String[] args) {
        Person person = new Person("김일", 180, 69.8);
        double bmi = Bmi.calcBmi(person);
        Bmi.printResult(person, bmi);

        // 이상과 같이 작성했을 때 멀쩡히 동작함.
        // 근데 밑에 예시를 보겠음.
        Dog dog1 = new Dog("곰돌이", 52, 12);
//        double bmi = Bmi.calcBmi(dog1);
//        Bmi.printResult(dog1);
        // 이상의 두줄은 현재 오류. 이를 해결하기 위한 방법으로 printResult() 메서드를 method overload하는 법이 있음.
    }
}