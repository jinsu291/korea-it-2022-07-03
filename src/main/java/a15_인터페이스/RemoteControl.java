package a15_인터페이스;

public class RemoteControl implements PowerButton, VolumeUpButton, VolumeDownButton{
    private boolean powerFlag;

    @Override
    public void keepTheUpButton() {
        System.out.println("사운드를 올입니다.");
    }

    @Override
    public void keepTheDownButton() {
        System.out.println("사운드를 줄입니다.");
    }

    @Override
    public void onClick() {
        if(powerFlag == false) {
            System.out.println("전원을 켭니다.");
            powerFlag = true;
        } else {
            System.out.println("전원을 끕니다.");
            powerFlag = false;
        }
    }

    @Override
    public void sendSignal() {
        System.out.println("전원 신호" + powerFlag + "를 전송합니다.");
    }
}
