package a11_클래스_복습;

public class 붕어빵 {
    private String 재료;
    private String 모양;
    
    //기본생성자
    public 붕어빵(){

    }
    //전체생성자
    public 붕어빵(String 재료, String 모양){
        super();
        this.재료 = 재료;
        this.모양 = 모양;
    }
    //getter & setter
    public String get재료() {
        return 재료;
    }

    public void set재료(String 재료) {
        this.재료 = 재료;
    }

    public String get모양() {
        return 모양;
    }

    public void set모양(String 모양) {
        this.모양 = 모양;
    }
    //showInfo
    public void showInfo(){
        System.out.println(모양 + "모양의 " + 재료 + "맛 " + 모양+ "빵입니다.");
    }
}
