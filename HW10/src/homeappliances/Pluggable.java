package homeappliances;

interface Pluggable extends Appliance {
    void plugIn();
    void plugOut();
    boolean isPluggedIn();
}