package bai8.code;

import java.util.ArrayList;

public class Hub {
    private ArrayList<Device> devices;

    public Hub() {
        this.devices = new ArrayList<>();
    }

    public void addDevice(Device device) {
        this.devices.add(device);
    }

    public void turnOffAll() {
        System.out.println("=== Turn off all Devices ===");
        for (Device device : devices) {
            device.turnOff();
        }
    }

    public void turnOnAll() {
        System.out.println("=== Turn on all Devices ===");
        for (Device device : devices) {
            device.turnOn();
        }
    }

    public void SetupWifi() {
        System.out.println("=== Setup Wifi ===");
        for (Device device : devices) {
            if (device instanceof WifiConnectable) {
                ((WifiConnectable) device).connectToWifi();
            }
        }
    }

    public void deviceList() {
        System.out.println(" === Devices in this hub ===");
        for (Device device : devices) {
            System.out.println(device);
        }
    }
}
