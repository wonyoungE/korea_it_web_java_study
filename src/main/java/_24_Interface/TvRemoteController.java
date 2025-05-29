package _24_Interface;

public class TvRemoteController {
    private PowerButton powerButton;
    private ChannelUpButton channelUpButton;
    private ChannelDownButton channelDownButton;
    private VolumeUpButton volumeUpButton;
    private VolumeDownButton volumeDownButton;

    // 생성자, allArgsConstructor
    public TvRemoteController(PowerButton powerButton, ChannelUpButton channelUpButton, ChannelDownButton channelDownButton, VolumeUpButton volumeUpButton, VolumeDownButton volumeDownButton) {
        this.powerButton = powerButton;
        this.channelUpButton = channelUpButton;
        this.channelDownButton = channelDownButton;
        this.volumeUpButton = volumeUpButton;
        this.volumeDownButton = volumeDownButton;
    }

    // powerButton이 private라 Main에서 직접 접근 불가
    // 메서드 생성해서 이 클래스에서 접근
    public void onPressedPowerButton() {
        System.out.print("TV의 ");
        powerButton.onPressed();
    }

    // 채널 한 칸 올림
    public void onUpChannelButton() {
        channelUpButton.onUp();
    }

    // 채널 계속 올림
    public void onPressedChannelUpButton() {
        channelUpButton.onPressed();
    }

    // 채널 한 칸 내림
    public void onDownChannelButton() {
        channelDownButton.onDown();
    }
    
    // 채널 계속 내림
    public void onPressedChannelDownButton() {
        channelDownButton.onPressed();
    }
    
    public void onUpVolumeButton() {
        volumeUpButton.onUp();
    }
    
    public void onPressedVolumeUpButton() {
        volumeUpButton.onPressed();
    }
    
    public void onDownVolumeButton() {
        volumeDownButton.onDown();
    }
    
    public void onPressedVolumeDownButton() {
        volumeDownButton.onPressed();
    }
}