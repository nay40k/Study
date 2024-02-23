package homeappliances;

abstract class KitchenAppliance implements Pluggable {
    private boolean pluggedIn = false;
    private String name;
    private int power;

    public KitchenAppliance(String name, int power) {
        this.name = name;
        this.power = power;
    }

    @Override
    public void plugIn() {
        pluggedIn = true;
    }

    @Override
    public void plugOut() {
        pluggedIn = false;
    }

    @Override
    public boolean isPluggedIn() {
        return pluggedIn;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getPower() {
        return power;
    }
}