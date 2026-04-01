package bai8.code;

public class AirConditioner extends Device implements WifiConnectable {
    private String wifiState;

    public AirConditioner(String id, String name) {
        super(id, name);
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
}
