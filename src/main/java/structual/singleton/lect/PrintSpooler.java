package structual.singleton.lect;

public class PrintSpooler {

    private static PrintSpooler spooler;

    private static boolean initialized = false;

    public PrintSpooler() {
        System.out.println("Creating another printSpooler object");
    }

    private void init() {
    }

    public static  synchronized PrintSpooler getInstance() {
        if (initialized) return spooler;
        spooler = new PrintSpooler();
        spooler.init();

        initialized = true;
        return spooler;
    }
}
