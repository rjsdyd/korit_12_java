package ch17_static.singleton.factory;

public class Factory {
    private String factoryName;

    public Factory(String factoryName) {
        this.factoryName = factoryName;
        System.out.println(factoryName + "이(가) 완공되었습니다.");
    }

    // method 정의
    public SmartPhone produceSmartPhone() {
        System.out.println(factoryName + "에서 스마트폰을 생성");
        String model = "갤럭시 S27";
        String serial;

        // 지역 변수로 Samsung 객체 생성
        // 그러면 계속 produceSmartPhone()을 호출하더라도
        // 이하의 객체가 계속 대입
        Samsung samsung = Samsung.getInstance();
        serial = samsung.createSerialNumber(model);     // 갤럭시 S27을 대입

        SmartPhone smartPhone = new SmartPhone(samsung.getCompany(), model, serial);

        return smartPhone;
    }
}
