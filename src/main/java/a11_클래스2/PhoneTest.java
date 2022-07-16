package a11_클래스2;

public class PhoneTest {

    /*
     * addPhone(int type, String model, int color);
     * 리턴은 객체(주소값)
     *
     */
    public static Phone addPhone(int type, String model, int color) {
        Phone phone = new Phone(type, model, color);
//		phone.setPhoneType(type);
//		phone.setPhoneModel(model);
//		phone.setPhoneColor(color);
        return phone;
    }

    public static void main(String[] args) {
        // 객체생성1
        Phone p1 = addPhone(1, "고아라폰", 2);
        p1.showPhoneInfo();
        p1.powerOn();
        p1.powerOff();
    }
}
