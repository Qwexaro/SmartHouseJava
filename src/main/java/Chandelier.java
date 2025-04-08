public class Chandelier extends LightingDevice{

    private final int countLamps;

    public Chandelier(int power, int countLamps){
        super(power);
        this.countLamps = countLamps;
    }

    @Override
    public int getEnergyConsumption() {
        return getBrightness() * getPower() * countLamps;
    }

    @Override
    public void switchOn() {
        setBrightness(MAX_BRIGHTNESS);
    }

    @Override
    public void switchOff() {
        setBrightness(MIN_BRIGHTNESS);
    }
}
