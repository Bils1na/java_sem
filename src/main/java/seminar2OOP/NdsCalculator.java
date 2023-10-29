package seminar2OOP;

public class NdsCalculator {

    private final NdsResolver ndsResolver;

    public NdsCalculator(NdsResolver ndsResolver) {
        this.ndsResolver = ndsResolver;
    }

    public double withNds(double price) {
        return price + (price * ndsResolver.ndsForToday());
    }

}
