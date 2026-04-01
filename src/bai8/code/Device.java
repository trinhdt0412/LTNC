package bai8.code;

public abstract class Device {
    protected String id;
    protected String name;
    protected String state;

    public Device(String id, String name) {
        this.id = id;
        this.name = name;
        this.state = "Off";
    }

    public String getName() {
        return this.name;
    }

    public void turnOn() {
        this.state = "On";
        System.out.println(this.name + " turned On");
    }

    public void turnOff() {
        this.state = "Off";
        System.out.println(this.name + " turned Off");
    }

    @Override
    public String toString() {
        return "Device{" +
                "id=" + id +
                ", name=" + name +
                ", state=" + state +
                '}';
    }
}
