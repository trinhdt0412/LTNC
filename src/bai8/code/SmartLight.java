package bai8.code;

public class SmartLight extends Device implements BrightnessAdjustable {
    private int brightness;

    public SmartLight(String id, String name) {
        super(id, name);
        this.brightness = 10;
    }

    @Override
    public void turnOn() {
        this.state = "On";
        System.out.println("Smart Light turned on");
    }

    @Override
    public void turnOff() {
        this.state = "Off";
        System.out.println("Smart Light turned off");
    }

    @Override
    public void adjustBrightness(int brightness) {
        System.out.println("Adjusting brightness to " + brightness);
        this.brightness =  brightness;
    }

    @Override
    public int getBrightness() {
        return this.brightness;
    }

}
