package ch13_abstraction.interfaces;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        PowerButton powerButton = new PowerButton();
//        ChannelDownButton channelDownButton = new ChannelDownButton();
//        ChannelUpButton channelUpButton = new ChannelUpButton();
//        powerButton.OnPressed();
        /*
            버튼들을 만들어서 Main에서 객체 생성을 한 후에
            메서드를 호출하는 것은 가능합니다.
            그런데 Main에서 매번 객체를 생성해줘야 한다는 문제점이 있습니다.
         */
        TvRemoteController tvRemoteController = new TvRemoteController(
                new PowerButton(),
                new ChannelDownButton(),
                new ChannelUpButton(),
                new VolumeDownButton(),
                new VolumeUpButton()
        );
        /*
            리모컨 객체의 argument로 PowerButton 생성자를 집어넣었습니다.
            생성자의 정의는 : 객체를 생성할 때 호출되는 특별한 메서드이므로,
            new PowerButton(), 을 통해서 객체가 생성되었다고 볼 수 있습니다.
            -> 하지만 객체명이 없는 상태라고 볼 수 있겠네요.

            근데 이상까지 이해했다는 전체하에 TvRemoteController 클래스를 확인해보면
            this.powerButton = powerButton이라고 되어 있습니다.
            그 말은 argument로 들어온 new PowerButton()이
            매개변숭인 PowerButton powerButton으로 치환되고,
            그것이 TvRemoteController의 field인 powerButton에 대입된다는 것을
            확인할 수 있습니다.
         */
        // tvRemoteController.powerButton.OnPressed();
        tvRemoteController.onPressedPowerButton();
        tvRemoteController.onPressedChannelDownButton();
        tvRemoteController.onDownChannelDownButton();
        tvRemoteController.onPressedChannelUpButton();
        System.out.println(tvRemoteController.onUpChannelUpButton1());
        tvRemoteController.onUpChannelUpButton2();
        tvRemoteController.onPressedPowerButton() ;
        /*
            VolumeDownButton 클래스를 정의하시오.
            VolumeUpButton 클래스를 정의하시오.

            그리고 Main에서
            tvRemoteController.onPressedVolumeDown(); 을 호출하면
            볼륨을 한 칸 내립니다.가 출력될 수 있도록 작성하시오.

            실행 예
                    Tv 리모컨 객체가 생성되었습니다.
                    전원을 켭니다.
                    채널을 한 칸 내립니다.
                    채널을 계속 내립니다.
                    채널을 한 칸 올립니다.
                    채널을 계속 올립니다.
                    볼륨을 한 칸 내립니다.
                    볼륨을 계속 내립니다.
                    볼륨을 한 칸 올립니다.
                    볼륨을 계속 올립니다.
                    전원을 끕니다.
         */
        System.out.println("------------------");
        tvRemoteController.onPressedPowerButton();
        tvRemoteController.onPressedChannelDownButton();
        tvRemoteController.onDownChannelDownButton();
        tvRemoteController.onPressedChannelUpButton();
        System.out.println(tvRemoteController.onUpChannelUpButton1());
        tvRemoteController.onPressedVolumeDownButton();
        tvRemoteController.onDownVolumeDownButton();
        tvRemoteController.onPressedVolumeUpButton();
        System.out.println(tvRemoteController.onUpVolumeUpButton1());
        tvRemoteController.onPressedPowerButton();

        System.out.println("--------------------------------");
        AirConditionerController airConditionerController = new AirConditionerController(
                new PowerButton(),
                new TemperatureDownButton(),
                new TemperatureUpButton(),
                new ModeChangeButton()
        );
        airConditionerController.onPressedPowerButton();
        airConditionerController.onPressedTemperatureDownButton();
        airConditionerController.onDownTemperatureDownButton();
        airConditionerController.onPressedTemperatureUpButton();
        System.out.println(airConditionerController.onUpTemperatureUpButton1());
        airConditionerController.onPressedModeChangeButton();
        airConditionerController.onPressedModeChangeButton();
        airConditionerController.onPressedPowerButton();
    }
}
