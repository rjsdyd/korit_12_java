package ch13_abstraction.abstract_classes;

public abstract class Factory {
    // 필드 선언
    private String name;
    private String model;

    // 추상 메서드
    public abstract void produce(String model);
    public abstract void manage();

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    // 게터 / 세터
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }




    // 고유 메서드
    public void showInfo() {
        System.out.println("공장의 정보를 출력합니다.\n공장 이름 : " + name);
    }

}
