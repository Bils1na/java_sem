package seminar5OOP;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


class JUnitDemoTest {

    @Test
    void testMove1() {
        JUnitDemo testObject = new JUnitDemo();


        List<Integer> from = new ArrayList<>(Arrays.asList(1, 2, 3));
        List<Integer> to = new ArrayList<>(Arrays.asList(4, 5, 6));

        testObject.move(from, to);

//        Assertions.assertTrue(from.isEmpty());
//        Assertions.assertEquals(0, from.size());
        Assertions.assertEquals(0, to.indexOf(4));
        Assertions.assertEquals(1, to.indexOf(5));
        Assertions.assertEquals(2, to.indexOf(6));
        Assertions.assertEquals(3, to.indexOf(1));
        Assertions.assertEquals(4, to.indexOf(2));
        Assertions.assertEquals(5, to.indexOf(3));


//        Assertions.assertEquals(6, to.size());
//        for (int i = 0; i < 6; i++) {
//            Assertions.assertTrue(to.contains(i));
//        }

    }

    @Test
    void testRemoveSpacesToUpperCase() {
        JUnitDemo testObject = new JUnitDemo();

        String data = "asafdfsdfa DSFGSf gsg fgDFGDF Gfgdf";
        String result = testObject.removeSpacesToUpperCase(data);
        Assertions.assertEquals("ASAFDFSDFADSFGSFGSGFGDFGDFGFGDF", result);
    }

    @Test
    void testRemoveSpacesToUpperCase2() {
        JUnitDemo testObject = new JUnitDemo();

        String data = "        ";
        String result = testObject.removeSpacesToUpperCase(data);
        Assertions.assertEquals("", result);
    }

    @Test
    void testValidateAgeThrowsNullAgeException() {
        JUnitDemo testObject = new JUnitDemo();

        Assertions.assertThrows(JUnitDemo.NullAgeException.class, () -> testObject.validateAge(null));
    }

    @Test
    void testValidateAgeThrowsNegativeAgeException() {
        JUnitDemo testObject = new JUnitDemo();
        Executable executable = new Executable() {
            @Override
            public void execute() throws Throwable {

            }
        };

//        try {
//            executable.execute();
//            Assertions.fail();
//        } catch (Throwable e) {
//            Assertions.assertEquals(e.getClass(). );
//        }

        Assertions.assertThrows(JUnitDemo.NegativeAgeException.class, () -> testObject.validateAge(-5));
        Assertions.assertThrows(JUnitDemo.NegativeAgeException.class, () -> testObject.validateAge(0));
    }

    @Test
    void testValidateAgeNoException() {
        JUnitDemo testObject = new JUnitDemo();
        Assertions.assertDoesNotThrow(() -> testObject.validateAge(1));
        Assertions.assertDoesNotThrow(() -> testObject.validateAge(10));
    }
}