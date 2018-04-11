public class Coin {
    private double aValue;
    private String aName;

    public static final double QUARTER_VALUE = 0.25;
    public static final double DIME_VALUE = 0.10;
    public static final double NICKLE_VALUE = 0.05;
    public static final double PENNY_VALUE = 0.01;

    public Coin(double aValue, String aName) {
        this.aValue = aValue;
        this.aName = aName;
    }
    public double getValue() {
        double value = 0;
        switch (aName){
            case "quarter":
                value = QUARTER_VALUE;
                break;
            case "dime":
                value = DIME_VALUE;
                break;
            case "nickle":
                value = NICKLE_VALUE;
                break;
            case "penny":
                value = PENNY_VALUE;
                break;
        }
        return value;
    }
}
