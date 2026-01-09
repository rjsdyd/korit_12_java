package ch15_objects;

public class ObjectTest {
    private String name;
    private String address;

    public ObjectTest(String address, String name) {
        this.address = address;
        this.name = name;
    }

    public ObjectTest() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public void showInfo() {
        System.out.println("이름 : " + name + "\n주소 : " + address);
    }

    @Override
    public String toString() {
        return "이름 : " + name + "\n주소 : " + address;
    }
}

