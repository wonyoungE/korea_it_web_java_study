package _24_Interface;

public class Main {
    public static void main(String[] args) {
        TvRemoteController tvRemoteController = new TvRemoteController(
                new PowerButton(),
                new ChannelUpButton(),
                new ChannelDownButton(),
                new VolumeUpButton(),
                new VolumeDownButton()
        );

        tvRemoteController.onPressedPowerButton();
        tvRemoteController.onUpChannelButton();
        tvRemoteController.onPressedChannelUpButton();
        tvRemoteController.onDownChannelButton();
        tvRemoteController.onPressedChannelDownButton();
        tvRemoteController.onUpVolumeButton();
        tvRemoteController.onPressedVolumeUpButton();
        tvRemoteController.onDownVolumeButton();
        tvRemoteController.onPressedVolumeDownButton();

    }
}
