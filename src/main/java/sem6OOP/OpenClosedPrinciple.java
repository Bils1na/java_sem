package sem6OOP;

import java.util.Map;

public class OpenClosedPrinciple {

    public static void main(String[] args) {
        // Принцип открытости - закрытости

        NdsCalculator ndsCalculator = new NdsCalculator();
    }

    private static class NdsCalculator {

        public double getPriceWithNds(Product product) {
            return product.getType().applyCoefficient(product.getPrice());
//            Double coefficient = product.getType().getCoefficient();
////            double coefficient = switch (product.getType()) {
////                case NATIONAL -> 0.0;
////                case FOREIGN -> 0.05;
////                case SANCTIONED -> 0.25;
////            };
//
//            double price = product.getPrice();
//            return price + price * coefficient;
        }
    }

    private static class Product {
        private double price;
        private ProductType type;

        public Product(double price, ProductType type) {
            this.price = price;
            this.type = type;
        }

        public double getPrice() {
            return price;
        }

        public ProductType getType() {
            return type;
        }
    }

    private enum ProductType {
        NATIONAL(0.0),         // 0%
        FOREIGN(0.05),          // 5%
        SANCTIONED(0.25),       // 25%
        NEW(0.1);               // 10%

        private final double coefficient;

        ProductType(double coefficient) {
            this.coefficient = coefficient;
        }

        public double getCoefficient() {
            return coefficient;
        }

        public double applyCoefficient(double value) {
            return value * (1 + coefficient);
        }

    }
}
