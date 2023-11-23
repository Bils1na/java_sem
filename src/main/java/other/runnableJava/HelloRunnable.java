package other.runnableJava;

// https://habr.com/ru/sandbox/167189/

public class HelloRunnable implements Runnable{
    public void run() {
        System.out.println("Hello form a thread!");
    }
    
    public static void main(String[] args) {
        (new Thread(new HelloRunnable())).start();
    }
}