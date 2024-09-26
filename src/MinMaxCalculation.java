import java.util.ArrayList;

public interface MinMaxCalculation {

	public static double min(double ... numbers) {
        double min = numbers[0];
        for (double num: numbers) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }
    
    public static double max(double ... numbers) {
        double max = numbers[0];
        for (double num: numbers) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
}