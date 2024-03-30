package scheduler;

class Shift {
    String name;
    String startTime;
    String endTime;

    public Shift(String name, String startTime, String endTime) {
        this.name = name;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    @Override
    public String toString() {
        return name + " (" + startTime + " - " + endTime + ")";
    }
}