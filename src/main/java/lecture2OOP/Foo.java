package lecture2OOP;

class Doo extends Foo {
    public void M() {
        Foo.getCount();
    }
}

public class Foo {
    public Integer value;

    private static Integer count;
    public static Integer getCount(){
        return count;
    }

    static {
        count = 0;
    }

    public Foo() {
        count++;
    }

    public void printCount() {
        System.out.println(count);
    }

    @Override
    public String toString() {
        return value.toString();
    }
}
