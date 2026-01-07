package ch13_abstraction.interfaces;

public class TvRemoteController {
    // field 선언
    private PowerButton powerButton;
    private ChannelDownButton channelDownButton;
    private ChannelUpButton channelUpButton;
    private VolumeDownButton volumeDownButton;
    private VolumeUpButton volumeUpButton;

    public TvRemoteController(PowerButton powerButton, ChannelDownButton channelDownButton, ChannelUpButton channelUpButton, VolumeDownButton volumeDownButton, VolumeUpButton volumeUpButton) {
        this.powerButton = powerButton;
        this.channelDownButton = channelDownButton;
        this.channelUpButton = channelUpButton;
        this.volumeDownButton = volumeDownButton;
        this.volumeUpButton = volumeUpButton;
        System.out.println("Tv 리모컨 객체가 생성되었습니다.");
    }

    public void onPressedPowerButton() {
        powerButton.OnPressed();
    }
    public void onPressedChannelDownButton() {
        channelDownButton.OnPressed();
    }
    public void onDownChannelDownButton() {
        channelDownButton.onDown();
    }
    public void onPressedChannelUpButton() {
        channelUpButton.OnPressed();
    }
    public String onUpChannelUpButton1() {
        return channelUpButton.onUp();
    }
    public void onUpChannelUpButton2() {
        System.out.println(channelUpButton.onUp());
    }
    public void onPressedVolumeDownButton() {
        volumeDownButton.OnPressed();
    }
    public void onDownVolumeDownButton() {
        volumeDownButton.onDown();
    }
    public void onPressedVolumeUpButton() {
        volumeUpButton.OnPressed();
    }
    public String onUpVolumeUpButton1() {
        return volumeUpButton.onUp();
    }
}
    /*
        onPressedChannelDownButton() 메서드와
        onDownChannelDownButton 메서드를 정의하시오.
        정의 방식을 이상을 참조할 것.
        Main에서 tvRemoteController.onPressedChannelDown();
        Main에서 tvRemoteController.onDownChannelDown();
        메서드들을 호출하시오.
        실행 예)
        Tv 리모컨 객체가 생성되었습니다.
        전원을 켭니다.
        채널을 한 칸 내립니다.
        채널을 게속 내립니다.
     */


