public interface ElectricDevice {

    boolean isSwitched();

    void switchOn();

    void switchOff();

    default void toggle() {
        if (isSwitched()) {
            switchOff();
        } else {
            switchOn();
        }
    }
}
