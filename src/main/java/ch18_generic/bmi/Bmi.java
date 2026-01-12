package ch18_generic.bmi;

public class Bmi {
    public static double calcBmi(Person person) {
        double heightMeter = person.height / 100.0;
        return person.weight / (heightMeter * heightMeter);
    }
    public static void printResult(Person person, double bmi) {
        String result;
        if (bmi < 18.5) result = "저체중";
        else if (bmi < 23) result = "정상";
        else if (bmi < 25) result = "비만전1단계";
        else if (bmi < 30) result = "1단계비만";
        else if (bmi < 35) result = "2단계비만";
        else result = "3단계비만";
        System.out.printf(person.name + "님의 키는 " +
                person.height + "cm, 몸무게는 " +
                person.weight + "kg, bmi 지수는 " +
                + bmi + "으로 " + result + "입니다.");
    }
}
