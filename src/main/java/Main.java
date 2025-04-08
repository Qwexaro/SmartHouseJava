public class Main {
    public static void main(String[] args) {
        LightingDevice firstLightingDevice = new Lamp(100);
        System.out.println("Лампа: ");
        firstLightingDevice.setBrightness(110);
        System.out.println("Включили яркость на 100%");
        firstLightingDevice.changeBrightness(-20);
        System.out.println("Убавили яркость на 20%");
        System.out.println("Актуальная яркость в %: " + firstLightingDevice.getBrightness());
        System.out.println("Энергопотребление в вт состоит " + firstLightingDevice.getEnergyConsumption());

        LightingDevice secondLightingDevice = new Chandelier(100, 4);
        System.out.println("\nЛюстра: ");
        firstLightingDevice.setBrightness(110);
        System.out.println("Включили яркость на 100%");
        firstLightingDevice.changeBrightness(-20);
        System.out.println("Убавили яркость на 20%");
        System.out.println("Актуальная яркость в %: " + firstLightingDevice.getBrightness());
        System.out.println("Энергопотребление в вт состоит " + firstLightingDevice.getEnergyConsumption());


    }
}
