public class Lamp extends LightingDevice{
    public Lamp(int power) {
        super(power);
    }

    @Override
    public int getEnergyConsumption() {



        return getBrightness() * getPower();
    }
}
