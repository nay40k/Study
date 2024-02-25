package homeappliances;

abstract class AbstractHomeAppliance implements HomeAppliance {
    protected String name;
    protected int powerConsumption;
    protected boolean isPluggedIn;



    public AbstractHomeAppliance(String name, int powerConsumption) {
        this.name = name;
        this.powerConsumption = powerConsumption;
        this.isPluggedIn = false;
    }


    @Override
    public void plugIn() {
        isPluggedIn = true;
    }

    //метод для получения !потребления! мощности
    @Override
    public int getPowerConsumption() {
        return isPluggedIn ? powerConsumption : 0;
    }

    // метод для получения номинальной мощности
    @Override
    public int getPower() {
        return powerConsumption;
    }


    @Override
    public String getName() {
        return name;
    }
}