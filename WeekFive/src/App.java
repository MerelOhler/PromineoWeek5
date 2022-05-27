public class App {
    public static void main(String[] args) throws Exception {
        Logger asteriskLogger = new AsteriskLogger();
        asteriskLogger.log("hello there!");
        asteriskLogger.error("NOOOOO there is an error!!!!");

        Logger spacedLogger = new SpacedLogger();
        spacedLogger.log("String cheese");
        spacedLogger.error("There is another error, oh no!");
    }
}
