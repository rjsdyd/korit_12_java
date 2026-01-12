package ch17_static.singleton.factory;

import lombok.Getter;

public class Samsung {
    // 정적 필드
    private static Samsung instance;
    // 일반 필드
    @Getter
    private String company;
    private int serialNumber;

    private Samsung () {
        company = getClass().getSimpleName();   // 근데 이거 결과값 어짜피 Samsung
        serialNumber = 20260000;        // 일반 필드에 private static int serialNumber를 쓰면
                                        // 이 코드는 필요없음.
        System.out.println("삼성 객체가 생성");        // 싱글톤 확인용
    }
    public static Samsung getInstance() {
        if (instance == null) {
            instance = new Samsung();
        }
        return instance;
    }

    // 일반 메서드
    public String createSerialNumber(String model) {
        return model + "_" + ++serialNumber;
    }
    /*
        이미 싱글톤을 배운 우리는 어짜피 객체가 하나만 생성될거라는 것을 알고 있음.
        근데 이 메서드를 호출했을 때, ++가 적용은 됨. 그러면 다수의 객체를 만들려고 시도해봤자
        하나만 만들어지기 때문에 모델명_20260000에서 1씩 증가된 값이 시리얼 넘버가 될 것이고,
        그 결과가 시리얼 넘버가 중복되지 않으리라는 결론을 낼 수 있음.
     */
    /*
        정적 변수로 serialNumber를 선언하지 않고 일반 필드로 선언한 이유는 그냥 객체 하나만 생성된다고
        보여주려고임.
        이미 static 개념을 배우고 이해한 수강생들이 떠올릴 수 있는 의문이므로 이런 질문이 떠오른다면
        학습이 올바르게 되고 있는 중이라고 봄.
     */
}
