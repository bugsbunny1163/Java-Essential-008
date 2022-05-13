package task2_3_4;

public class Main {
    public static void main(String[] args) {
        Device device = new Device("Samsung", 120, "AB1234567CD");
        Device device1 = new Device("Samsung", 120, "AB1234567CD");

        EthernetAdapter etAd = new EthernetAdapter("TP-Link", 345.4f, "sdfsdf564", 1000, "ab-54-ab");
        EthernetAdapter etAd1 = new EthernetAdapter("TP-Link", 345.4f, "sdfsdf564", 1000, "ab-54-ab");

        Monitor monitor = new Monitor("Samsung", 120,"AB1234567CD",1280, 1024);
        Monitor monitor1 = new Monitor("Samsung", 120,"AB1234567CD",1280, 1024);

        System.out.println(device);
        System.out.println(etAd);
        System.out.println(monitor);


        System.out.println(etAd.equals(etAd1)); // true
        System.out.println(device.equals(device1)); // true
        System.out.println(monitor.equals(monitor1)); // true

        System.out.println(device.hashCode());
        System.out.println(etAd.hashCode());
        System.out.println(monitor.hashCode());

    }

}