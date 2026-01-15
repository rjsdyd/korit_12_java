package ch22_lambda;

@FunctionalInterface    // 얘가  함수형 인터페이스형이라는 것을 명시
public interface Calculator {
    int computer(int a, int b);
}
