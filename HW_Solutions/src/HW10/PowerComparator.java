package HW10;

import java.util.Comparator;

class PowerComparator implements Comparator<HomeAppliance> {
    @Override
    public int compare(HomeAppliance a1, HomeAppliance a2) {
        return Double.compare(a1.getPower(), a2.getPower());
    }
}