package lecture1OOP;

public class Robot2 {
    /**Уровень робота */
    private int level;

    /**Имя робота */
    private String name;

    /**
     * Создание робота
     * @param name Имя робота
     * @param level Уровень робота
     */
    public Robot2(String name, int level) {
        this.name = name;
        this.level = level;
    }

    // Методы вкл\выкл подсистем

    public void powerOn() {
        this.startBIOS();
        this.startOS();
        this.sayHi();
    }

    public void powerOff() {
        this.sayBye();
        this.stopOS();
        this.stopBIOS();
    }

    public int getLevel() {
        return this.level;
    }

    public String getName() {
        return this.name;
    }

    private void startBIOS() { System.out.println("Start BIOS..."); }

    private void startOS() { System.out.println("Start OS..."); }

    private void sayHi() { System.out.println("Hello world..."); }

    private void stopBIOS() { System.out.println("Stop BIOS..."); }

    private void stopOS() { System.out.println("Stop OS..."); }

    private void sayBye() { System.out.println("Bye..."); }

    public void work() { System.out.println("Working..."); }
}
