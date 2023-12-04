package sem6OOP;

public class DependencyInversionPrinciple {
    public static void main(String[] args) {
        NdsCalculator ndsCalculator = new NdsCalculator(new CentralBankNdsResolver("https://central-bank/nds"));
    }

    private static class NdsCalculator {

        private NdsResolver ndsResolver;

        public NdsCalculator(NdsResolver ndsResolver) {
            this.ndsResolver = ndsResolver;
        }

        public  double getPriceWithNds(double price) {
            double coefficient = ndsResolver.getNdsForToday();
            return (1 + coefficient) * price;
        }

    }

    private interface NdsResolver {
        double getNdsForToday();
    }



    public static class HardcodedNdsResolver  implements NdsResolver {
        @Override
        public double getNdsForToday() {
            return 0.2;
        }
    }

    public static class CentralBankNdsResolver implements NdsResolver {
        private String centralBankUrl;

        public CentralBankNdsResolver(String centralBankUrl) {
            this.centralBankUrl = centralBankUrl;
        }

        @Override
        public double getNdsForToday() {
            return 0.2;
        }
    }
}
