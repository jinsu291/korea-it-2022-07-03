package a11_클래스2;

/*
 * 속성
 * phoneType(int) 1: feature-phone, 2: smart-phone
 * phoneModel(String)
 * phoneColor(int) 1: 블랙, 2: 화이트, 3: 블루, 4: 레드
 *
 * 기능
 * powerOn()
 * 모델명의 전원을 켭니다.
 * powerOff()
 * 모델명의 전원을 끕니다.
 * showPhoneInfo()
 * 휴대폰 타입 : feature-phone, smart-phone
 * 휴대폰 모델 : 롤리팝, 고아라폰, 아이폰, 갤럭시
 * 휴대폰 색상 : 블랙, 화이트, 블루, 레드
 *
 */

public class Phone {
    private int phoneType;
    private String phoneModel;
    private int phoneColor;

    //기본 생성자
    public Phone() {

    }
    //전체생성자
    public Phone(int phoneType, String phoneModel, int phoneColor) {
        super();
        this.phoneType = phoneType;
        this.phoneModel = phoneModel;
        this.phoneColor = phoneColor;
    }
    public int getPhoneType() {
        return phoneType;
    }

    public void setPhoneType(int phoneType) {
        this.phoneType = phoneType;
    }
    public String getPhoneModel() {
        return phoneModel;
    }
    public void setPhoneModel(String phoneModel) {
        this.phoneModel = phoneModel;
    }
    public int getPhoneColor() {
        return phoneColor;
    }
    public void setPhoneColor(int phoneColor) {
        this.phoneColor = phoneColor;
    }
    public void powerOn() {
        System.out.println(phoneModel + "의 전원을 켭니다.");
    }
    public void powerOff() {
        System.out.println(phoneModel + "의 전원을 끕니다.");
    }

    public void showPhoneInfo() {
        System.out.println("휴대폰 타입 : " + (phoneType == 1 ? "feature-phone" : "smart-phone"));
        System.out.println("휴대폰 모델 : " + phoneModel);
        System.out.println("휴대폰 색상 :  " + (phoneColor == 1 ? "블랙" : phoneColor == 2 ? "화이트" :phoneColor == 3 ? "블루" : "레드"));
    }
}
