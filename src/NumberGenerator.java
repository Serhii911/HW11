import java.util.stream.Stream;

public class NumberGenerator {
    public static void main(String[] args) {
        randomStream(25214903917L, 11, (long) Math.pow(2d, 48d), 0);
    }
    public static Stream<Long> randomStream(long a, long c, long m, long seed){
        return Stream.iterate(seed, x -> (a * x + c) % m);
    }
}
