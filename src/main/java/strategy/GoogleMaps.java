package strategy;

public class GoogleMaps {
    public void findPath(String from, String to, String mode){
        PathCalculatorStrategy pathCalculatorStrategy = PathCalculatorFactory.getPathCalculatorByMode(mode);
        pathCalculatorStrategy.findPath(from, to);
    }
}
