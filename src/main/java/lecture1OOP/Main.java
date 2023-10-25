package lecture1OOP;

public class Main {

//    static double distance(int x1, int y1, int x2, int y2) {
//        return Math.sqrt(Math.pow(x2 -x1, 2) + Math.pow(y2 - y1, 2));
//    }
//
//    static double distance(Point2D a, Point2D b) {
//        return Math.sqrt(Math.pow(a.getX() -b.getX(), 2) + Math.pow(a.getY() - b.getY(), 2));
//    }
//
//
    public static void main(String[] args) {
//        Point2D a = new Point2D(0, 2);
//        System.out.println(a.toString());
////        a.setX(12);
////        System.out.println(a.toString());
//
//        Point2D b = new Point2D(0);
//        System.out.println(b);
//
//
////        System.out.println(distance(a, b));
//        // Создаем точку
//        // Печать точки
//
//        double dis = Point2D.distance(a, b);
//        System.out.println(dis);

        Robot1 robot1 = new Robot1("name_1", 1);

        System.out.printf("%s %d\n", robot1.name, robot1.level);
        robot1.startBIOS();
        robot1.startOS();
        robot1.sayHi();

        robot1.work();
        robot1.work();
        robot1.work();

        robot1.sayBye();
        robot1.stopOS();
        robot1.stopBIOS();

        Robot2 robot2 = new Robot2("name_2", 1);

        System.out.printf("%s %d", robot2.getName(), robot2.getLevel());
        robot2.powerOn();
        robot2.work();
        robot2.powerOff();

    }

}
