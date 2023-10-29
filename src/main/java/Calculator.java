import java.util.stream.DoubleStream;

public class Calculator {
    public double add(double... operands) {
        return DoubleStream.of(operands)
                .sum();
    }
}
