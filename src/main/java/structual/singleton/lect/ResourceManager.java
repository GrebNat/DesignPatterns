package structual.singleton.lect;

public class ResourceManager {
    public static void main(String[] args) {
        PrintSpooler spooler = PrintSpooler.getInstance();

        Thread thread1 = new Thread(()->{PrintSpooler s = PrintSpooler.getInstance();});
        Thread thread2 = new Thread(()->{PrintSpooler s = PrintSpooler.getInstance();});

        thread1.start();
        thread2.start();
    }
}
