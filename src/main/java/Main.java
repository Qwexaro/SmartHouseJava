public class Main {
    public static void main(String[] args) {
        LightingDevice firstLightingDevice = new Lamp(100);
        System.out.println("Лампа: ");
        firstLightingDevice.setBrightness(110);
        System.out.println("Включили яркость на 100%");


    }
}
