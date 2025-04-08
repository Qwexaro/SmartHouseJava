public abstract class LightingDevice {
    public static final int MIN_BRIGHTNESS = 0;
    public static final int MAX_BRIGHTNESS = 0;
    private int brightness;
    private final int power;

    public LightingDevice(int power) {
        this.power = power;
    }

    public int getBrightness() {
        return brightness;
    }

    public int getPower() {
        return power;
    }

    public void setBrightness(int brightness) {
        if (brightness > MAX_BRIGHTNESS) {
            this.brightness = MAX_BRIGHTNESS;
        } else if (brightness < MIN_BRIGHTNESS) {
            this.brightness = MIN_BRIGHTNESS;
        } else {
            this.brightness = brightness;
        }
    }
}
