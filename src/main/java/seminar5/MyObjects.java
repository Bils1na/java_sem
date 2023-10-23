package seminar5;

import java.util.*;

public class MyObjects {
    private int height;
    private int weight;

    @Override
    public boolean equals(Object obj) {
        MyObjects obj1 = (MyObjects) obj;
        return height == obj1.height;
    }

    @Override
    public int hashCode() {
        int hash = Objects.hash(height);
        return hash;
    }
}
