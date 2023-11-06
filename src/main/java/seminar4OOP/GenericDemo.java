package seminar4OOP;

// A <- B <- C <- D <- E

import java.util.*;

public class GenericDemo {

    public static void main(String[] args) {
        List<A> aList = new ArrayList<>();
        List<B> bList = new ArrayList<>();
        List<C> cList = new ArrayList<>();
        List<D> dList = new ArrayList<>();
        List<E> eList = new ArrayList<>();
        List<Object> objectList = new ArrayList<>();

        Comparator<A> aComparator = null;
        Comparator<B> bComparator = null;
        Comparator<C> cComparator = null;
        Comparator<D> dComparator = null;
        Comparator<E> eComparator = null;
        Comparator<Object> objectComparator = null;

        foo5(bList, aList);

        C c = foo0(cList);
        D d = foo0(dList);
        E e = foo0(eList);

        D dd = foo0(eList); // T = {D E}
//        E ee = foo0(dList); // T = {E}


    }

    static <T extends B> void foo10(List<T> first, List<? extends T> second) {

    }


    static <K, V> void move(List<? extends Map<? extends K, ? super V>> from, List<? super Map<K, V>> to) {

    }


    static <T extends C> T foo0(Collection<T> coll) {
        T next = coll.iterator().next();
        return next;
    }

    static <T extends Comparable<T>> void sort(List<T> list) {

    }

    static <T extends A> void sort(Comparator<? super T> comparator, Collection<? extends T> coll) {

    }

    // Wildcard - ?
    static void foo1(List<? extends C> list) {

    }

    static void foo2(List<? extends C> list1, List<? extends C> list2) {

    }

    static <T extends C, V extends C> void foo3(List<T> list1, List<V> list2) {

    }

    static void foo4(List<? super C> list) {

    }
// PECS Producer Extends Consumer Super
    // Поставщик Потребитель
    static <T extends A> void foo5(List<? extends T> from, List<? super T> to) {
        // List<A> = {A B C D E}
        // List<B> = {  B C D E}
        // A => A +
        // A => B -
        // B => A +

        // T = C
        // {C D E} => {C B A Object}
    }


    static class A {

    }

    static class B extends A {

    }

    static class C extends B {

    }

    static class D extends C {

    }

    static class E extends D {

    }

}
