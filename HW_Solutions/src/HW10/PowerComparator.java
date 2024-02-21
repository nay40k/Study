package HW10;

import java.util.Comparator;

class PowerComparator implements Comparator<HomeAppliances> {
    @Override
    public int compare(HomeAppliances a1, HomeAppliances a2) {
        return Double.compare(a1.getPower(), a2.getPower());
    }
}