package sem6OOP;

import java.lang.reflect.Field;

public class LiskovSubstitutionPrinciple {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        // Если q(х) является свойством, верным относительно объектов х некоторого типа Т,
        // тогда q(у) также должно быть верным для объектов у типа S, где S является подтипом типа Т.
//        T x = new T();
//        q(x);
//
//        S y = new S();
//        q(y);
        Square s = new Square();
//        rectangle.setX(10);
//        rectangle.setY(15);
//
//        Field x = Rectangle.class.getDeclaredField("x");
//        x.setAccessible(true);
//        x.set(rectangle, 1);


//        System.out.println(rectangle.calculateArea());
    }

//    static class  T {
//
//    }
//
//    static class S extends T {
//
//    }
//
//    private static void q(T x) {
//
//    }

    static interface Shape {
        int calculateArea();
    }

    static class Rectangle implements Shape {
        private int x;
        private int y;

        public void setX(int x) {
            this.x = x;
        }

        public void setY(int y) {
            this.y = y;
        }

        public int calculateArea() {
            return x * y;
        }
    }

    static class Square implements Shape {
        private int size;

        public int calculateArea() {
            return size * size;
        }
    }

    private static class NdsCalculator {

        public double getPriceWithNds(Product product) {
            NationalProduct nationalProduct = (NationalProduct) product;
            double coefficient = product.getCoefficient();
            return (coefficient + 1) * product.getPrice();
        }
    }

    private static class ForeignProduct extends Product {
        public ForeignProduct(double price) {
            super(price, 0.2);
        }
    }

    private static class NationalProduct extends Product {
        public NationalProduct(double price) {
            super(price, 0.0);
        }
    }

    private static class Product {
        private double price;
        private double coefficient;

        public Product(double price, double coefficient) {
            this.price = price;
            this.coefficient = coefficient;
        }

        public double getPrice() {
            return price;
        }

        public double getCoefficient() {
            return coefficient;
        }
    }

}
