package D;

public class Main {
    public static void main(String[] args) {
        Logger logger = new ConsoleLogger(); 
        App app = new App(logger);
        app.start();
    }
}
