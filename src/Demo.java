public class Demo {
    private static final double[] rawData = {
            0.2,
            0.3,
            0.5,
            0.4,
            1.2,
            0.7,
            0.8,
            0.9,
            1.0,
            1.1,
            1.3,
            1.6,
            1.5,
            1.8,
            1.9,
            2.0,
            4.1,
            2.2,
            2.4,
            2.5,
            2.7,
            3.0,
            2.9,
            3.1,
            3.4,
            3.3,
            3.5
    };

    private static MovingAverageFilter filter = new MovingAverageFilter(10);

    public static void main(String[] args) {
        for (double n : rawData) {
            filter.AddReading(n);
            System.out.println("Moving Average Result: " + filter.GetAverage());
        }
    }
}
