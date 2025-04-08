public class Lamp extends LightingDevice{
    public Lamp(int power) {
        super(power);
    }

    @Override
    public int getEnergyConsumption() {



        return getBrightness() * getPower();
    }

    @Override
    public void switchOn() {

    }

    @Override
    public void switchOff() {

    }

    @Override
    public void toggle() {
        super.toggle();
    }
}
