package strategy;

public class PathCalculatorFactory {
    private PathCalculatorFactory(){}
    public static PathCalculatorStrategy getPathCalculatorByMode(String mode) {
        if (mode.equals("car")) {
            return new CarPathCalculatorStrategy();
        } else if (mode.equals("bike")) {
            return new BikePathCalculatorStrategy();
        } else {
            return new WalkPathCalculatorStrategy();
        }
    }
}
