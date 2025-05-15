public class MainFile {
    public static void main(String[] args) {
        FirstLevelHandler firstLevelHandler = new FirstLevelHandler();
        SecondLevelHandler secondLevelHandler = new SecondLevelHandler();
        ThirdLevelHandler thirdLevelHandler = new ThirdLevelHandler();

        firstLevelHandler.setNextHandler(secondLevelHandler);
        secondLevelHandler.setNextHandler(thirdLevelHandler);

        Request request = new Request("Advanced");

        firstLevelHandler.handle(request);
    }
}