public class Hogwarts {
    private int powerMagic;
    private int transgressionDistance;

    public Hogwarts(int powerMagic, int transgressionDistance) {
        this.powerMagic = powerMagic;
        this.transgressionDistance = transgressionDistance;
    }

    public int getPowerMagic() {
        return powerMagic;
    }

    public void setPowerMagic(int powerMagic) {
        this.powerMagic = powerMagic;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    public void setTransgressionDistance(int transgressionDistance) {
        this.transgressionDistance = transgressionDistance;
    }

    @Override
    public String toString() {
        return "hogwarts{" +
                "powerMagic=" + powerMagic +
                ", transgressionDistance=" + transgressionDistance +
                '}';
    }
}
