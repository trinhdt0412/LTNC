package bai8.code;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // 1. INPUT
        int sizeInput = 4;
        String deviceInput = "L 01 LivingRoomLight\n" +
                "AC 02 BedroomAC\n" +
                "S 03 SmartSpeaker\n" +
                "C 04 WindowCurtain\n";
        Scanner scanner = new Scanner(deviceInput);

        // 2. KHỞI TẠO MẢNG CHO HUB
        Hub deviceHub = new Hub();

        for (int i = 0; i < sizeInput; i++) {
            String line = scanner.nextLine();
            String[] parts = line.split("\\s+");
            String type = parts[0];
            String id = parts[1];
            String name = parts[2];

            // Thêm device vào hub

            // Cách 1: if - else
//            if (type.equals("L")) {
//                deviceHub.addDevice(new SmartLight(id, name));
//            } else if (type.equals("AC")) {
//                deviceHub.addDevice(new AirConditioner(id, name));
//            } else if (type.equals("S")) {
//                deviceHub.addDevice(new SmartSpeaker(id, name));
//            } else if (type.equals("C")) {
//                deviceHub.addDevice(new AutomaticCurtain(id, name));
//            }

            // Cách 2: switch
            switch (type) {
                case "L" -> deviceHub.addDevice(new SmartLight(id, name));
                case "AC" -> deviceHub.addDevice(new AirConditioner(id, name));
                case "S" -> deviceHub.addDevice(new SmartSpeaker(id, name));
                case "C" -> deviceHub.addDevice(new AutomaticCurtain(id, name));
            }

        }

        // 3. IN RA MÀN HÌNH
        deviceHub.deviceList();
        System.out.println();

        deviceHub.turnOnAll();
        System.out.println();

        deviceHub.deviceList();
        System.out.println();

        deviceHub.turnOffAll();
        System.out.println();

        deviceHub.SetupWifi();
        System.out.println();

        deviceHub.deviceList();
        System.out.println();

    }


}
