package a11_클래스_정보은닉;

public class Car {
    private String model;  //여기
    public String getModel() {
        return model;
    }
    public void setModel(String model) {     //setter는 리턴해줄게 없다.외부에서 값을 받아서 안에 넣어주면 되니깐
        this.model = model;   //this.을 해줘서 위의 여기 model을 가리키게 함.
    }
}
