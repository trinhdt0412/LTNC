package bai8.code;

public class SmartSpeaker extends Device implements VolumeAdjustable, WifiConnectable {
    private int volume;
    private String wifiState;

    public SmartSpeaker(String id, String name) {
        super(id, name);
        this.volume = 100;
        this.wifiState = "Off";
    }

    @Override
    public String getWifiState() {
        return this.wifiState;
    }

    @Override
    public void connectToWifi() {
        System.out.println(this.name + " connected to Wifi");
        this.wifiState = "On";
    }

    @Override
    public void disconnectToWifi() {
        System.out.println(this.name + " disconnected from Wifi");
        this.wifiState = "Off";
    }

    @Override
    public void  adjustVolume(int volume) {
        System.out.println(this.name + " adjusted volume to " + volume);
    }

    @Override
    public int getVolume() {
        return this.volume;
    }
}
